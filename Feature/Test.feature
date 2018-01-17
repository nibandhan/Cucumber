Feature: This is the feature file

Scenario: Login credentials

      Given User opens the browser
	  When he gets the url
	  Then validate the title of the home page
	  
	  
Scenario Outline: Multiple login credentials

      Given User opens the browser
	  When he gets the url
	  Then enter the "<username>" and "<password>"
	  Then validate the title of the home page
	  
	  Examples:
	  
	  |username|password|
	  |nibandhan|nibbu1|
	  |nibandhan|nibbu1|
	  |nibandhan|nibbu1|
	
	
