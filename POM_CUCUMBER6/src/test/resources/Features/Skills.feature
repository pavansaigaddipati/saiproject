Feature: Skills Record creation
	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Create SKills Record
 		When User Navigate to LogIn Page
    			|Username|Password|
    			|Admin   |admin123|
    Then Creted Skills Record
          |SKILLNAME|SKILLDESCR| 
					|Java22101|Java22101 descr|
					|Java33101|Java33101 descr|
					|Java43101|Java43101 descr|
    When Click on logout button
    Then Close Browser
