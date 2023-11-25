Feature: To Verify JpetShop Webpage

  Scenario: To Verify JpetShop Addcart in Webpage with Valid Credentials
    Given User Should be in Jpetshop Webpage
    When User Should in Jpetshop Singin Page Enter Username  Passsword to Signin 
    And User Should Select the Products
    And User Should Enter Deatiles
    And User Should Conform the Order
    Then User should Verify the Successfull message
    