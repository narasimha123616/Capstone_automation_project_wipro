Feature: check user valid credentials

Scenario Outline: Check successful login
  Given login page should be open in the default browser
  When click on the username button and enter valid "<username1>"
  And add "<password1>"
  And click on the signin button "<Status>"
  Then login page successfully and open home page

Examples:
  | username1 | password1 | Status |
  | usern     | passwor   | fail   |
  | usernam   | password  | fail   |
  | username  | passwor   | fail   |
  | username  | password  | pass   |
