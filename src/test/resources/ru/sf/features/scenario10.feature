Feature: student's reviews
  Background: main page
    Given url of sf 'https://skillfactory.ru/'
  Scenario: open page student's reviews from page actions
    When chosen page actions
    And chosen student's reviews on page action
    Then verify that page student's reviews is opened 'https://skillfactory.ru/cases-n-reviews'
  Scenario: open page student's reviews from main page
    When chosen student's reviews on main page
    Then verify that page student's reviews is opened right 'https://skillfactory.ru/cases-n-reviews'