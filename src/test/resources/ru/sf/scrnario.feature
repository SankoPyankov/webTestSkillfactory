Feature: Website Skillfactory
  Scenario: Test 1
    #тест переход на страницу всех курсов
    Given url of Skillfactory 'https://skillfactory.ru/'
    When click in tab онлайн-курсы
    And click in tab все онлайн-курсы
    Then get text ib courses 'Онлайн-курсы по IT-профессиям'
  Scenario: Test 2
    #тест перехода на страницу с бесплатной информацией по клику таба, в навигационном меню
    Given url of Skillfactory 'https://skillfactory.ru/'
    When click in tab все бесплатно
#    Then assert url 'https://skillfactory.ru/free-events'
    Then get text for page 'Бесплатные мероприятия'
