require 'rspec'
require 'card'

describe Card do
  
  it "should have a denomination" do
    card = Card.new('A','C')
    card.denomination.should == 'A'
  end
  
  it "should have a suit" do
    card = Card.new('A','C')
    card.suit.should == 'C'
  end
  
  it "should have a suit" do
    card = Card.new('A','H')
    card.suit.should == 'H'
  end
  
end