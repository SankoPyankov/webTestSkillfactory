Feature: sign up for courses from page courses
  Background: page courses
    Given url of sf page courses 'https://skillfactory.ru/courses'
  Scenario: chose programmirovanie Python
    When chosen programmirovanie
    And chosen Python
    Then chose Python-developer
    When click button sign up for class
    And click button leave a request in base rate
    Then assert that user got form 'Записаться на курс по базовому тарифу' Python-developer
  Scenario: chose product-manager
    When chosen management
    Then chose product-manager
    And click button sign up for class profession product-manager
    Then click button choose in optimal rate
    Then assert that user got form 'Записаться на курс по оптимальному тарифу' product-manager
  Scenario: chose ux/ui designer
    When chosen design
    Then chose ux ui designer
    And click button sign up for class profession ux ui designer
    Then assert that user got form 'записаться на курс' ux ui designer

