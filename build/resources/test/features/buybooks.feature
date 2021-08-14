Feature: Buy Books
  I as a privileged user
  I want to be able to buy books
  to offer the service to customers

  Scenario: Successful purchase
    Given That entered the application
    	|user									|password|
    	|qmatic@qvision.com.co|secret	 |
    When I type the data
    	|java|ruby|python|
    	|1	 |2   |1		 |
    Then I get the grand total
    	|total|
    	|105  |