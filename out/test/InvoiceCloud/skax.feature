Feature:
  Scenario Outline:
    Given user wants to go to google
    When user wants to search "<String>" on search button
    Examples:
    |String|
    |invoice|
    |cloud  |