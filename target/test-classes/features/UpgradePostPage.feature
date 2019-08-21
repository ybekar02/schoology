Feature: Upgrade Post
  As a user I want to post an announcement

  Scenario: Post an announcement on home page
    Given user is on the landing page
    Then User logs on as hpschem
    Then User clicks on the update icon
    Then User enters informative text
    Then User clicks on the on insert icon, clicks on link and sends data
    And User clicks on browse icon and selects the courses
    And User clicks on post icon


