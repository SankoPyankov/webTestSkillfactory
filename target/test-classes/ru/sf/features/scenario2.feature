Feature: test elements of header on main page
  Background: main page
    Given url of sf 'https://skillfactory.ru/'
  Scenario: button free-events opens page free-events
    When chosen free-events
    Then verify that page free-events is opened 'https://skillfactory.ru/free-events'
  Scenario: button career-center opens page career-center
    When chosen career-center
    Then verify that page career-center is opened 'https://skillfactory.ru/career-center'
  Scenario: button contacts opens page contacts
    When chosen contacts
    Then verify that page contacts is opened 'https://skillfactory.ru/contacts'


