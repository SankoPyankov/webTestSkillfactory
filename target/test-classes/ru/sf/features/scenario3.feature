Feature: ask the questions and take a free test
  Background: main page
    Given url of sf 'https://skillfactory.ru/'
  Scenario: get form for question
    When chosen contacts
    And chosen block other
    Then verify that user got form 'Ваш вопрос' in contact information
   Scenario: get free test
     When chosen free-events
     And clicked button start on test what profession without code suits you
     Then assert that user got the first step of test "Какая профессия без кода вам подходит?"
