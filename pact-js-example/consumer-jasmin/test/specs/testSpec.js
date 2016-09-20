//import request from 'superagent';
var request = require('superagent');
var chai = require('chai');
var chaiAsPromised = require('chai-as-promised');

var expect = chai.expect;
chai.use(chaiAsPromised);

describe("Client", function() {
    var client, helloProvider;

    beforeAll(function(done) {
        //ProviderClient is the class you have written to make the HTTP calls to the provider
        //client = new ProviderClient('http://localhost:1234');
        helloProvider = Pact.mockService({
            consumer: 'Hello Consumer',
            provider: 'Hello Provider',
            port: 1234,
            done: function (error) {
                expect(error).toBe(null);
            }
        });

        // This ensures your pact-mock-service is in a clean state before
        // running your test suite.
        helloProvider.resetSession(done);
    });

    it("should say hello", function(done) {
        helloProvider
            .given("a list of projects exists")
            .uponReceiving("a request for list of projects")
            .withRequest("GET", "/projects", {"Accept": "application/json"})
            .willRespondWith(200, {"Content-Type": "application/json"}, {"projects": ["project1", "project2"]});

        /*helloProvider.run(done, function(runComplete) {
            var expected = request.get('http://localhost:1234/projects').set({ 'Accept': 'application/json' })
            console.log(expected)
            expect(expected.status).toEqual(200);
            runComplete();
        });*/
        const verificationPromise = request
            .get('http://localhost:1234/projects')
            .set({ 'Accept': 'application/json' })
            .then(helloProvider.verify)
        expect(verificationPromise).to.eventually.eql(JSON.stringify({"projects": ["project1123", "project2"]})).notify(done)
    });
});