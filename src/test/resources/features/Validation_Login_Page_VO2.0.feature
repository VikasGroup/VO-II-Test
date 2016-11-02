Feature: Validate Login Page 

@test
Scenario Outline: EVO2_01 
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And select language "<LANG>" 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the vo2 dashboard page 
	
	Examples: 
		|PLAN |LANG|IR_ID   |PWD   |
		|world|EN  |HD932941|testpw|

@test	
Scenario Outline: EVO2_02, EVO2_03, EVO2_21, EVO2_22, EVO2_23,EVO2_27, EVO2_31, EVO2_47, EVO2_49, EVO2_237,  
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And select language "<LANG>" 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the error messages 
			
	Examples: 
	|PLAN |LANG|IR_ID   |PWD   |
	|world|EN  |HD932941|TESTPW|
	|world|EN  |HD932941|      |
	|world|EN  |HA075236|testpw|
	|world|EN  |HA075236|test12|      
	|world|EN  |HA060652|testpw| 
	|world|EN  |HA060652|test12|          					
	|world|EN  |HY934645|testpw|  
	|world|EN  |HD447019|testpw|
	|world|EN  |HU050294|testpw|   				
	|world|EN  |HY934645|testpw|
	|world|EN  |HD330116|testpw|

@test	
Scenario Outline:EVO2_24, EVO2_25, EVO2_26
Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And select language "<LANG>" 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the error messages 
			
	Examples: 
	|PLAN |LANG|IR_ID   |PWD   |
	|world|EN  |HA060652|test12|  
	|world|EN  |AA020117|testpw|       
	|world|EN  |AA020117|test12| 
	
@test
Scenario Outline:
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 
	And select language "<LANG>" 
	And enter IR ID password and login "<IR_ID>" "<PWD>" 
	When validate the unauthorised error messages 
	
	Examples: 
	|PLAN |LANG|IR_ID   |PWD   |
	
@test		 
Scenario Outline: EVO2_09 
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 	
	When slect enroll as IR
	And validate the referrer info page

	Examples: 
		|PLAN |	
		|world|
		
@test	
Scenario Outline: EVO2_10 
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 	
	When slect shop as RC
	And validate the info referrer detail page

	Examples: 
		|PLAN |	
		|world|
		
@test	
Scenario Outline: EVO2_11 
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 	
	When slect forgot password link
	And validate the reset password page 

	Examples: 
		|PLAN |	
		|world|
	
@test
Scenario Outline: EVO2_12 
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 	
	When slect forgot password link
	And validate the reset password page 
	Then Enter IR ID to reset "<IRID_RESET>"
	And click submit
	And verify error message for reset pwd

	Examples: 
		|PLAN |IRID_RESET|	
		|world|test|
		
@test	
Scenario Outline: EVO2_13
	Given User opens "<PLAN>" home page 
	And click on IR login 
	And select beta VO 	
	When slect forgot password link
	And validate the reset password page 
	Then Enter IR ID to reset "<IRID_RESET>"
	And click submit
	And verify success message for reset pwd

	Examples: 
		|PLAN |IRID_RESET|	
		|world|HD932941|
		
@test	
Scenario Outline: EVO2_08
	Given user opens PBO page 		
	And enter username and password "<USER_NAME>" "<PASSWORD>"	
	And Enter token key 
	When Enter irid and crfNo "<IRID>" "<CRFNO>"	
	And click on vo2 link
	And varify PVO2.0 Dashboard 
	
	Examples: 
	|USER_NAME|PASSWORD|IRID    |CRFNO|
	|VK_Pavi  |PFFZLmmX|HD932941|test |
				
				
				
				
				
				
				
				
				
				
				
		