package org.step;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_LoginPageStepClass extends BaseClass {

	@Given("User Should be in Jpetshop Webpage")
	public void user_should_be_in_jpetshop_webpage() {
		try {

			getDriver("Chrome");
			maximize();
			getUrl("https://petstore.octoperf.com/");

			Thread.sleep(1000);

			System.out.println("Chrome was Launched");
		} catch (Exception e) {

			System.out.println("Chrome was Not Launched" + "Error_" + e.getMessage());
		}

	}

	@When("User Should in Jpetshop Singin Page Enter Username  Passsword to Signin")
	public void user_should_in_jpetshop_singin_page_enter_username_passsword_to_signin() {
		try {

			LoginPage a = new LoginPage();

			WebElement enterstore = a.getEnterstore();
			enterstore.click();

			WebElement signin = a.getSignin();
			signin.click();

			WebElement username = a.getUsername();
			username.sendKeys("deva");

			WebElement password = a.getPassword();
			password.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, "deva@007");

			WebElement login = a.getLogin();
			login.click();

			System.out.println("login successfull");
		} catch (Exception e) {
			System.out.println("login error" + "Error_" + e.getMessage());
		}
	}

	@When("User Should Select the Products")
	public void user_should_select_the_products() {
		try {
			LoginPage a = new LoginPage();

			WebElement dogs = a.getDogs();
			dogs.click();

			WebElement product = a.getProduct();
			product.click();

			WebElement addcart = a.getAddcart();
			addcart.click();

			WebElement checkout = a.getCheckout();
			checkout.click();

			System.out.println("product select successfull");

		} catch (Exception e) {
			System.out.println("product not select" + "Error_" + e.getMessage());
		}
	}

	@When("User Should Enter Deatiles")
	public void user_should_enter_deatiles() {

		try {
			LoginPage a = new LoginPage();

			WebElement cardtype = a.getCardtype();
			cardtype.click();

			WebElement cardnum = a.getCardnum();
			cardnum.sendKeys("987654321987");

			WebElement expdate = a.getExpdate();
			expdate.sendKeys("2025");

			WebElement firstname = a.getFirstname();
			firstname.sendKeys("epic");

			WebElement lastname = a.getLastname();
			lastname.sendKeys("raj");

			WebElement address = a.getAddress();
			address.sendKeys("2,velacher");

			WebElement city = a.getCity();
			city.sendKeys("chennai");

			WebElement state = a.getState();
			state.sendKeys("Tamilnadu");

			WebElement check = a.getCheck();
			check.click();

			WebElement conform = a.getConform();
			conform.click();

			System.out.println("Deatiles add successfull");

		} catch (Exception e) {
			System.out.println("Deatiles added not successfull" + "Error_" + e.getMessage());

		}
	}

	@When("User Should Conform the Order")
	public void user_should_conform_the_order() {
		try {
			LoginPage a = new LoginPage();

			WebElement conform2 = a.getConform2();
			conform2.click();

			WebElement conform3 = a.getConform3();
			conform3.click();

			System.out.println("Order is conformed");
		} catch (Exception e) {
			System.out.println("Order is Not conformed" + "Error_" + e.getMessage());
		}

	}

	@Then("User should Verify the Successfull message")
	public void user_should_verify_the_successfull_message() {

		System.out.println("Add to cart Successfull");
	}

}
