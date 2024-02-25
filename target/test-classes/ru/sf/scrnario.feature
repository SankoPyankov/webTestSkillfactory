Feature: Website Skillfactory
  Scenario: Test checks the page title
    Given url of Skillfactory 'https://skillfactory.ru/'
#    When view tab 'онлайн-курсы'
    Then click in tab онлайн-курсы
    Then click in tab все курсы
