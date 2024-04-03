Feature: Register account
Background: common lines
	Given user launed browser
	When user enters url 
	Then user clicks on Myacc dropdown
	Then user selects register option

@tag1
Scenario: enter only mandatory fields

	Then user enters all mandatory fields
	Then user clicks on privacy policy slider
	And user clicks on continue button
	Then user verifies success message as "!Register Account"
	Then user clicks on continue button
	Then user clicks on logout button
	Then user clicks on final continue button


@tag2
Scenario: enter only mandatory fields

	Then user enters required fields
	|firstname|lastname |email								|password|
	|abhilash |babunaidu|abhnaidu@hhmail.com  |mmm123aa| 
	
	Then user clicks on privacy policy slider
	And user clicks on continue button
	Then user verifies success message as "Register Account"
	Then user clicks on continue button
	Then user clicks on logout button
	Then user clicks on final continue button


@tag3
Scenario Outline: enter all fields
	
	
	Then user enters fields "<firstname>" "<lastname>" "<email>" "<password>"
	Then user clicks on privacy policy slider
	And user clicks on continue button
	Then user verifies success message as "Register Account"
	Then user clicks on continue button
	Then user clicks on logout button
	Then user clicks on final continue button
	
Examples:
|firstname|lastname |email										|password|	
|abhilash |babunaidu|abhilashnaidu@lomail.com |naidu000|
|abhilash |naidubabu|abhilash1232u@lomail.com |naidu000|