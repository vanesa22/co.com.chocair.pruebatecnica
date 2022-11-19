# Autor:Leidy Vanesa Fernandez

@stories
Feature: Sign Up Utest
  As an user, I want to sign up in utest platform in an automated way so that I can use all platform functionalities
  @scenario1
  Scenario: Automated sign up in UTest
    Given Vanesa wants to sign up on the uTest platform
    When she entered all the data requested by the platform
      |strFirstName|strLastName|strBirthdayMonth|strBirthdayDay |strBirthdayYear|strEmail               |strPassword|strPasswordConfirmation|strCity  |strZip|strCountry|strComputerOS|strComputerVersion|strComputerLanguage|strMobileOS|strMobileBrand|strMobileModel|
      |Vanesa      |Fernandez  |February        |11             |1997           |vanesa089-20@hotmail.com|Choucair1* |Choucair1*             |Cali     |760026|Colombia  |Windows      |10                |Spanish            |Android 7.0|Alcatel       |Crystal       |
    Then she will be signed up