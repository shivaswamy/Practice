require 'net/http'
include 'TestData'

APP_URL = "www.google.co.uk"

RSpec.configure do |config|

  config.before(:all) do
    @net = Net::HTTP.new(APP_URL)
  end

end
