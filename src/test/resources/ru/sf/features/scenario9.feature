Feature: negative test of subscription
  Scenario: entered incorrect email
    Given url of sf 'https://skillfactory.ru/'
    When incorrect email entered 'julia@mailru'
    Then verify that user got message 'Укажите, пожалуйста, корректный email'

