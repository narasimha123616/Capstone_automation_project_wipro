Feature: Login with Excel data

  Scenario Outline: Login using Excel data from Excel file
    Given user opens the login page
    When user enters "<username>" and "<password>"
    Then user should be able to attempt login

  Examples:
    | username | password |
    | <data from Excel> | <data from Excel> |
