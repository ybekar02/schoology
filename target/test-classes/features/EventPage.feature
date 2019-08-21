Feature: Event Page
  As a user I want to post an event

  Scenario: Post an event
    Given user is on the landing page
    Then user logs in as a user
    Then user moves to the event tab
    And user enter the date information
    And user enters the title and the announcement
    Then user selects group to share and disbales to comments
    Then user select the course
    And user clicks on create button to finalize
    And user gets the page title


