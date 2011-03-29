require 'rspec'
require 'hand'

describe Hand do

  it "should know that a straight beats a flush" do
    black_hand = Hand.new("2H 3H 4H 5H 6H")
    white_hand = Hand.new("AC AH AD AS KC")

    black_hand.beats(white_hand).should be_true
  end
  
end