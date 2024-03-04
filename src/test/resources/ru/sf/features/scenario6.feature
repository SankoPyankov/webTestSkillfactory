Feature: chose courses on page courses
 Background: page courses
   Given url of sf page courses 'https://skillfactory.ru/courses'
  Scenario: chose courses programmirovanie
    When chosen programmirovanie
    Then verify that page programmirovanie is opened 'https://skillfactory.ru/courses/programmirovanie'
  Scenario: chose courses testirovanie
    When chosen testirovanie
    Then verify that page testirovanie is opened 'https://skillfactory.ru/courses/testirovanie'
  Scenario: chose courses analitika-dannyh
    When chosen analitika-dannyh
    Then verify that page analitika-dannyh is opened 'https://skillfactory.ru/courses/analitika-dannyh'
  Scenario: chose courses games
    When chosen razrabotka-igr
    Then verify that page razrabotka-igr is opened 'https://skillfactory.ru/courses/razrabotka-igr'