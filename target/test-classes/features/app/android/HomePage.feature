Feature: Meezan bank App

 @android
  Scenario: Verify  login functionality of the app
    Given App should open successfully
    When I enter username and password
    And I click on loginbutton
    Then Show balance text is visible
    When the user clicks on "Send Money"
    And the user clicks on Send money to a new account
    And the user searches for a bank and select the first bank
    And the user enters the account number and click on fetch account details
    And the user verifies the account details and clicks on the next button
    And the user enters the amount to be sent and click on nextbutton
    #Then  [Home Page] Verify the Version Code version code : 106
    #And   [Home Page] Verify the Version Name version name : 12.0

  #@android
   #Scenario: User sends money to a new account
    # Given the user is on the home page
     #When the user clicks on Al meezan investment
     #When the user clicks on "Send Money"
    # And the user clicks on Send money to a new account
     #And the user searches for a bank and select the first bank
    # And the user enters the account number and click on fetch account details
     #And the user verifies the account details and clicks on the next button
     #And the user enters the amount to be sent and click on nextbutton
     #And the user click on send now button
     #Then the money should be sent successfully and sucessfull message should appeared
#
#  @android @final
#  Scenario: Verify the Flexible button and its feature is working as requirement
#    Given [Home Page] App should open successfully
#    Then [Home Page] Verify the Flexible Update button is visible
#    When [Home Page] User tap on Flexible Update Button
#    When [Home Page] User tap on Button 1
#    Then [Home Page] Verify that Result 1 is displayed
#    When [Home Page] User tap on Button 2
#    Then [Home Page] Verify that Result 2 is displayed
#    When [Home Page] User tap on Button 3
#    Then [Home Page] Verify that Result 3 is displayed
