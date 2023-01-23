Feature: testing Login box for google
  Scenario Outline: User wants to go to google webpage  and login to system
      Given :User wants to go to google webpage
      When User wants to fill out login information with different values
      And user wants to fill out username as "<username>" and password box as "<password>"
      Then user wants to click on login button
      Then user wants to verify that landed on homepage

    #invalid password box it takes min 8 characters and one capital word,at least 1 number , 1 character

    Examples: |username| password|
              | invalid email| invalid password|
              |valid email   |invalid password |
              |valid e mail  |
              |invalid e mail| valid password  |
              |valid e mail | valid password   |