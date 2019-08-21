Feature: Course Materials
  As a user I manage the course materials

  Scenario: Manage course materials
    Given user is on the landing page
    Then user logs in as a user
    Then user goes to the dashboard and selects the course
    And user collects the course materials
    Then user takes the attendance


  Scenario: Manage course materials
    Given user is on the landing page
    Then user logs in as a user
    Then user goes to the dashboard and selects the course
    And user should be able to see the course materials as
      | Updates     |
      | Gradebook   |
      | Grade Setup |
      | Badges      |
      | Attendance  |
      | Members     |


  Scenario: Manage course materials
    Given user is on the landing page
    Then user logs in as a user
    Then user goes to the dashboard and selects the course
    Then user collects the course materials
    And user clicks on gradebook
    Then user should see the information as
#      | 1 Carmona, 1 Fernando | 90                |
#      | Araiza, Anahi         | 43                |
#      | Barrrientos, Sheyla   | 81                |
#      | Briseno, Julian       | 22                |

      | name  | Figueroa, Enrique |
      | grade | 88                |
      | calcs | N/A               |


  Scenario: Manage course materials
    Given user is on the landing page
    Then user logs in as a user
    Then user goes to the dashboard and selects the course
    Then user collects the course materials
    And user clicks on gradebook
    Then user collects usernames
