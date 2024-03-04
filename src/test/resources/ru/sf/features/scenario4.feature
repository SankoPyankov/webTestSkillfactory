Feature: test dropdown of button online-courses on main page
 Background: dropdown
   Given url of sf 'https://skillfactory.ru/'
   And opened dropdown
  Scenario: chose courses data-science from dropdown
    When chosen data-science in dropdown
    Then verify that page data-science is opened 'https://skillfactory.ru/courses/data-science'
  Scenario: chose courses web-razrabotka from dropdown
    When chosen web-razrabotka in dropdown
    Then verify that page web-razrabotka is opened 'https://skillfactory.ru/courses/web-razrabotka'
  Scenario: chose courses razrabotka-mobilnyh-prilozheniy from dropdown
    When chosen razrabotka-mobilnyh-prilozheniy in dropdown
    Then verify that page razrabotka-mobilnyh-prilozheniy is opened 'https://skillfactory.ru/courses/razrabotka-mobilnyh-prilozheniy'
  Scenario: chose courses design from dropdown
    When chosen design in dropdown
    Then verify that page design is opened 'https://skillfactory.ru/courses/design'
