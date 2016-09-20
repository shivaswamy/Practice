var expect = require('chai').expect
var request = require('superagent')

var PactOpts = {
    consumer: 'consumer',
    provider: 'provider',
    providerPort: 1234
}

PactConsumer(PactOpts, function() {
    //this is wrapped in a before() block, takes an array of Interactions
    addInteractions([{
        state: 'Provider has a list of projects',
        uponReceiving: 'a request for projects',
        withRequest: {
            method: 'get',
            path: '/projects',
            headers: {'Accept': 'application/json'}
        },
        willRespondWith: {
            status: 200,
            headers: {'Content-Type':'application/json; charset=utf-8'},
            body: {'projects':['project1', 'project2']}
        }
    }])

    function requestProjects() {
        return request.get('http://localhost:' + PactOpts.providerPort + '/projects')
            .set({ 'Accept': 'application/json' })
    }

    //this is 'it' block
    verify('a list of projects is returned', requestProjects, function(result, done) {
        expect(JSON.parse(result)).to.eql({'projects':['project1', 'project2']})
        done()
    })

    //this is wrapped in a 'after' block, runs after all verifies, writes the pact and  clear all interactions
    finalizePact()
})