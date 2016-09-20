var path = require('path')
var wrapper = require('@pact-foundation/pact-node')

//create mock server
var mockServer = wrapper.createServer({
    port: 1234,
    log: path.resolve(process.cwd(), 'logs', 'mockserver.log'),
    dir: path.resolve(process.cwd(), 'pacts'),
    spec: 2
})

//start mock server
mockServer.start().then(function(){
    run()
})