Feature: Registration Form functionality


  Scenario: Successful registration with valid details
    Given the user is on the Practice Registration Form page
    When the user enters name "Vishnu Vardhan"
    And the user enters email "vishnu@gmail.com"
    And the user selects gender "Male"
    And the user enters mobile number "9652211550"
    And the user enters date of birth "09-09-2002"
    And the user enters subjects "java selenium, software testing"
    And the user selects hobby "Reading"
    And the user uploads a picture "C:/Users/VISHNU VARDHAN/OneDrive/Pictures/test.jpg"
    And the user enters address "Kurnool, Andhra Pradesh"
    And the user selects state "NCR"
    And the user selects city "Agra"
    And the user clicks on the login button
    Then the registration should be submitted successfully