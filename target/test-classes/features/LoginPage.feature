@Schoology
Feature: Login
  As user I want to login

  @hpschem
  Scenario: Login as hpschemistry
    Given user is on the landing page
    Then user logs in as a user
    And user verifies that webpage name is displayed as "Home | Schoology"

  @wrongUser
  Scenario: Login as wrogUser
    Given user is on the landing page
    Then user logs on with "username" and "password"
    And user verifies the error as

    @trials
  Scenario Outline: Login as wrogUser
    Given user is on the landing page
    Then user logs on with "<username>" and "<password>"

    Examples:
      | username               | password               |
      | hello                  | world                  |
      | hpschemistry@gmail.com | hpschemistry@gmail.com |
      | selenium               | cucumber               |
      | java                   | python                 |