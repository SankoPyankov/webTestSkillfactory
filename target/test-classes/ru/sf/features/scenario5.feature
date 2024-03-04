Feature: test of main button

  Scenario Outline: return on main page
    Given url of sf page <url>
    When click on main button
    Then verify that main page is opened 'https://skillfactory.ru/'
    Examples:
      | url                               |
      | 'https://skillfactory.ru/courses' |
      | 'https://skillfactory.ru/courses/design' |
      |'https://skillfactory.ru/courses/kiberbezopasnost' |
      | 'https://skillfactory.ru/courses/backend-razrabotka' |
      | 'https://skillfactory.ru/courses/sozdanie-saytov' |
      | 'https://skillfactory.ru/courses/recruting' |
