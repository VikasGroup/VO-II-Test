Feature: Validation menu in footer

@test1
Scenario Outline: EVO2_148
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	Then click on footer Privacy Policy
	And validate the privacy policy page
	
	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|	

@test1
Scenario Outline: EVO2_149
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And change the vo2 language "<vo2_lang>"
	Then click on footer Privacy Policy
	And validate the privacy policy page

	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||

@test1
Scenario Outline: EVO2_150
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And click on footer Disclaimer
	And validate the Disclaimer page

	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|

@test1
Scenario Outline: EVO2_151
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And change the vo2 language "<vo2lang>"
	And click on footer Disclaimer
	And validate the Disclaimer page

	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||

@test1
Scenario Outline: EVO2_152
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And click on footer Terms of Use
	And validate the Terms of Use page

	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|

@test1	
Scenario Outline: EVO2_153
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And change the vo2 language "<vo2lang>"
	And click on footer Terms of Use
	And validate the Terms of Use page

	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||

@test1
Scenario Outline: EVO2_154
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And click on footer  Social Media Policy
	And validate the Social Media Policy page

	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|

@test1	
Scenario Outline: EVO2_155
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And change the vo2 language "<vo2lang>"
	And click on footer  Social Media Policy
	And validate the Social Media Policy page

	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||

@test1
Scenario Outline: EVO2_156
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And click on footer  Code of Ethics 
	And validate the Code of Ethics  page

	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|

@test1
Scenario Outline: EVO2_157
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	And change the vo2 language "<vo2lang>"	
	And click on footer  Code of Ethics 
	And validate the Code of Ethics  page

	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||

@test1
Scenario Outline: EVO2_158
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And click on footer Earning and Income Disclaimer
	And validate the Earning and Income Disclaimer page

	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|

@test1
Scenario Outline: EVO2_159
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	And change the vo2 language "<vo2lang>"
	And click on footer Earning and Income Disclaimer
	And validate the Earning and Income Disclaimer page

	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||

@test1
Scenario Outline: EVO2_160
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 	
	And click on footer Contact Us
	And validate the Contact Us page

	Examples: 
		|PLAN |IR_ID   |PWD   |
		|world|HD932941|testpw|

@test1
Scenario Outline: EVO2_161
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	And change the vo2 language "<vo2lang>"	
	And click on footer Contact Us
	And validate the Contact Us page
	
	Examples: 
		|PLAN |IR_ID   |PWD   |vo2lang|
		|world|HD932941|testpw||
	
