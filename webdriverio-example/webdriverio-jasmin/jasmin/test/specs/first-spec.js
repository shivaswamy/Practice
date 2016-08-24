var assert = require('assert')

describe('webdriverio page', function() {
  it('should have the right title', function() {
    browser.url('/')
    var title = browser.getTitle()
    assert.equal(title, 'WebdriverIO - Selenium 2.0 javascript bindings for nodejs')
    //expect(title).toBe('WebdriverIO - Selenium 2.0 javascript bindings for nodejs');
  })
})
