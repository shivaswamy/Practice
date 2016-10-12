import React from 'react'
import App from '../../js/App.js'
import TestUtils from 'react-addons-test-utils'

var appComponent;

describe('Test app', () => {
    var Subject = require("../../test_helpers/RequestRouterContext.js")(App);

    it("renders header", () => {

        var header = TestUtils.renderIntoDocument(
            <Subject/>
        );
    })
})
