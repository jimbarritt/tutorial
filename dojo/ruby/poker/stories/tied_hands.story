Story: I can identify tied poker hands

  As a game player
  I want to identify tied hands
  So that I can split the prize
  
  Scenario: Straight flush tie
    Given a black hand with cards: 2H 3H 4H 5H 6H
    And a white hand with cards: 2C 3C 4C 5C 6C
    Then tie
  
  Scenario: Straight flush untie by highest card
    Given a white hand with cards: 7H 3H 4H 5H 6H
    And a black hand with cards: 2C 3C 4C 5C 6C
    Then white should win
  
  # Not possible to tie Four of a Kind
  
  Scenario: Four of a kind untie by value of four cards
    Given a black hand with cards: KC KH KD KS AC
    And a white hand with cards: JC JH JD JS QC
    Then black should win

  # Not possible to tie a Full house
  
  Scenario: Full house untie by value of three cards
    Given a black hand with cards: 4C 4D 4H 2C 2S
    And a white hand with cards: 3C 3H 3D AH AC
    Then black should win

  Scenario: Flush tie
    Given a black hand with cards: 4C 8C JC QC KC
    And a white hand with cards: 4S 8S JS QS KS
    Then tie

  Scenario: Flush untie by highest card
    Given a white hand with cards: 4C 8C JC QC KC
    And a black hand with cards: 2S 8S JS QS KS
    Then white should win

  Scenario: Straight tie
    Given a black hand with cards: TH JC QS KC AC
    And a white hand with cards: TH JD QS KD AD
    Then tie

  Scenario: Straight untie by highest card
    Given a white hand with cards: TH JC QS KC AC
    And a black hand with cards: TH JC QS KC 9C
    Then white should win

  # Not possible to tie a Three of a kind

  Scenario: Three of a kindd untie by value of three cards
    Given a black hand with cards: 4C 4H 4S 3S 2C
    And a white hand with cards: AH KC 3C 3D 3H
    Then black should win

  Scenario: Two pairs tie
    Given a black hand with cards: AH AC KC KH QS
    And a white hand with cards: AS AD QH KD KS
    Then tie
  
  Scenario: Two pairs untie by highest card
    Given a black hand with cards: AH AC KC KH QS
    And a white hand with cards: AS AD JH KD KS
    Then black should win

  Scenario: Two pairs untie by lowest pair
    Given a white hand with cards: AH AC KC KH QS
    And a black hand with cards: AS AD QH QD KS
    Then white should win

  Scenario: Two pairs untie by highest pair
    Given a black hand with cards: AH AC KC KH QS
    And a white hand with cards: AS KD QH QD KS
    Then black should win

  Scenario: Pairs tie
    Given a black hand with cards: AH AC KC QH JS
    And a white hand with cards: AS AD JC QH KS
    Then tie

  Scenario: Pair untie by highest card
    Given a black hand with cards: AH AC KC QH JS
    And a white hand with cards: AS AD TC QH KS
    Then black should win
  
  Scenario: Pair untie by value of two cards
    Given a white hand with cards: AH AC KC QH JS
    And a black hand with cards: KD AD JC QH KS
    Then white should win
  
  Scenario: Highest card tie
    Given a black hand with cards: 2H 3D 5S 9C KD
    And a white hand with cards: 2D 3H 5C 9S KH
    Then tie
  
  Scenario: Highest card untie
    Given a white hand with cards: 2C 3H 4S 8C AH
    And a black hand with cards: 2H 3D 5S 9C KD
    Then white should win