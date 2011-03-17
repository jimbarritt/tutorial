Story: I can rank poker hands

  As a game player
  I want to rank a poker hand
  So that I can decide a winner for the prize
  
  Scenario: Straight flush wins Four of a kind
    Given a black hand with cards: 2H 3H 4H 5H 6H
    And a white hand with cards: AC AH AD AS KC
    Then black should win

  Scenario: Four of a kind wins Full house
    Given a white hand with cards: 2C 2H 2D 2S AC
    And a black hand with cards: AC AH AD KS KC
    Then white should win

  Scenario: Full house wins Flush
    Given a black hand with cards: 2C 2H 2S 3C 3S
    And a white hand with cards: 4C 8C TC KC AC
    Then black should win

  Scenario: Flush wins Straight
    Given a black hand with cards: 2S 3S 4S 5S 7S
    And a white hand with cards: TH JC QS KC AC
    Then black should win

  Scenario: Straight wins Three of a kind
    Given a black hand with cards: 2H 3C 4S 5C 6C
    And a white hand with cards: AH AC AD KC QH
    Then black should win

  Scenario: Three of a kind wins Two pairs
    Given a white hand with cards: 2S 2C 2H 3S 4C
    And a black hand with cards: AH AC KC KH QS
    Then white should win

  Scenario: Two pairs wins Pair
    Given a black hand with cards: 2S 2C 3H 3D 4S
    And a white hand with cards: AH AC KC QH JS
    Then black should win

  Scenario: Pair wins Highest card
    Given a white hand with cards: 2H 2C 3S 4C 6H
    And a black hand with cards: AH KC QS JD 9S
    Then white should win