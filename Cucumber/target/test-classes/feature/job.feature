Feature: About Testers

In order to get a high paid job
As a tester
I want to learn Automation

Scenario: 
		Given I am a "<testerType>" Tester
		When I apply for a job
		Then I got a "<jobType>" paid job
		And I am "<satisfactionType>" satisfied with my salary
		But my parents are "<parentsSatisfaction>" satisfied
		
		Examples:
		|testerType | jobType | satisfactionType | parentsSatisfaction |
		|Manual     | LESS    | low              | Average             |
		|Automation | HIGH    | Highly           | Highly              |
		|API        | MEDIUM  | quite            | Average             |
		|DataBase   | MEDIUM  | quite            | Average             |
		|Security   | HIGH    | highly           | highly              |