Feature: Validate Login Page 

@test
Scenario Outline:
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	
	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|
		#|world|HD328709|testpw|
		
	