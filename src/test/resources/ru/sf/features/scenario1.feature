Feature: test button all courses on main page
  Scenario: button all courses opens page with all courses
    Given url of sf 'https://skillfactory.ru/'
    When click button all courses
    Then verify that page courses is opened 'https://skillfactory.ru/courses'