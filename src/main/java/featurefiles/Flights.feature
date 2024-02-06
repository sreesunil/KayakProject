
Feature: Kayak Assignment

  @tag1
  Scenario: Looking to book a Flight ticket
    Given user on the kayak website
    And user select origin and destination cites
    When user select travel dates
    And user click on search
    Then user able to see search result
    Then user select flight from option
    Then validate the result

  