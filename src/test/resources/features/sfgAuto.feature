
Feature: SFG auto search functionality
  Agile story: As a user, when I am on the sfg auto  page
  I should be able to search cars and see relevant results


  Scenario: Search result title verification
    Given user is on the sfg auto page
    And user clicks on browse inventory tab
    When  user enters "toyota" in the searchBox
    Then user should see get pre-qualified img in the result