require 'card'

class Hand
  attr_reader :cards
  
  def initialize(cards)
    @cards = []
    cards = cards.split(" ")
    cards.each do |card|
      @cards << Card.new(card[0], card[1]) 
    end
  end
end