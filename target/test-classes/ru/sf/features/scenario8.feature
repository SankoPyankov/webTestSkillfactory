Feature: registration in programs
  Background: main page
    Given url of sf 'https://skillfactory.ru/'
  Scenario: registration in partner program
    When chosen partner program
    And clicked button become a partner
    Then verify that page registration in partner program is opened 'https://my.advcake.com/o/skillfactory/affiliate/registration'
  Scenario: create account referral program
    When chosen referral program
    And clicked button to participate in the program
    Then verify that page registration in referral program is opened 'https://my.advcake.com/o/skillfactory/affiliate/referral'
