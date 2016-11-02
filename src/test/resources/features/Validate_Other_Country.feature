Feature: Validate other country 

@test
Scenario Outline: EVO2_226, EVO2_227, EVO2_228, EVO2_229
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	
	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD329645|testpw|
		|world|HZ250505|testpw|
		|world|HD889367|testpw|
		|world|HD328810|testpw|

@test
Scenario Outline:		
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the error messages 
			
	Examples: 
	|PLAN |IR_ID   |PWD   |
	|world|MY591137|TESTPW|
	|world|IC102363|TESTPW|
	|world|EW058471|TESTPW|
	|world|GL100001|TESTPW|		