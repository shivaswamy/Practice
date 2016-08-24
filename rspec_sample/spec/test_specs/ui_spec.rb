describe "Google homepage" do
  it "Sould load properly" do
    #net = Net::HTTP.new("www.google.co.uk")

    response = @net.get('/')
    expect(response.code).to eq "200"
    expect(response.body).to include TEST_STRING
  end
end
