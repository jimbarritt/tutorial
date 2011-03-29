require 'rspec'
require 'hand'
describe Hand do

  it "should accept card string" do
    hand = Hand.new("2H 3H 4H 5H 6H")
    hand.cards.length.should == 5
  end
  
end
