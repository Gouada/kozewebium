@tag
 Feature: jeuneafrique
 
Background:
    Given I am on the startpage
@comment   
Scenario Outline:
	Then I go to politik page
	Then I select an article
	Then I click the comment button
	When I enter my <profilname> and <email>
	And I type in my <comment>
	Then I click add comment button
	
Examples:
		|profilname|email		|comment|
		|gouada|gouada1@yahoo.fr|this is a comment writen just for testing the comment feature|