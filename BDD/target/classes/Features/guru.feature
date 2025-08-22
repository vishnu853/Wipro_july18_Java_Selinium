Feature: Registration functionality

  @sanity
  Scenario Outline: Verify registration form with multiple sets of data
    Given the user is on the Registration page
    When the user enters first name "<firstname>" and last name "<lastname>"
    And the user enters phone "<phone>"
    And the user enters email "<email>"
    And the user enters address "<address>"
    And the user enters city "<city>"
    And the user enters state "<state>"
    And the user enters postal code "<postalcode>"
    And the user selects country "<country>"
    And the user enters username "<username>"
    And the user enters password "<password>" and confirm password "<confirmpassword>"
    And the user clicks on the submit button
    Then the registration should be successful

    Examples:
      | firstname | lastname   | phone        | email            | address           | city     | state        | postalcode | country | username | password   | confirmpassword  |
      | Vishnu    | Vardhan    | 875367786    | vishnu@gmail.com | Kurnool, AP       | Kurnool  | Andhra       | 518002     | INDIA   | vishnu   | vishnu123  | vishnu123        |
      | Vijay     | kumar      | 9823543210   | kumar@gmail.com  | Dhone, AP         | Dhone    | AndhrPradesh | 500001     | INDIA   | vijay    | vijay456   | vijay456         |