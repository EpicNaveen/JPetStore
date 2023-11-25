package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='actions/Catalog.action']")
	private WebElement enterstore;

	public WebElement getEnterstore() {
		return enterstore;
	}

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//img[@src='../images/dogs_icon.gif']")
	private WebElement dogs;

	public WebElement getDogs() {
		return dogs;
	}

	@FindBy(xpath = "//a[@href='/actions/Catalog.action?viewProduct=&productId=K9-BD-01']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}

	@FindBy(xpath = "(//a[text()='Add to Cart'])[1]")
	private WebElement addcart;

	public WebElement getAddcart() {
		return addcart;
	}

	@FindBy(xpath = "//a[text()='Proceed to Checkout']")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(xpath = "//option[@value='Visa']")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}

	@FindBy(xpath = "//input[@name='order.creditCard']")
	private WebElement cardnum;

	public WebElement getCardnum() {
		return cardnum;
	}

	@FindBy(xpath = "//input[@name='order.expiryDate']")
	private WebElement expdate;

	public WebElement getExpdate() {
		return expdate;
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;

	}

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}

	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement state;

	public WebElement getState() {
		return state;
	}

	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement zip;

	public WebElement getZip() {
		return zip;
	}

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement check;

	public WebElement getCheck() {
		return check;
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement conform;

	public WebElement getConform() {
		return conform;
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement conform2;

	public WebElement getConform2() {
		return conform2;
	}

	@FindBy(xpath = "//a[text()='Confirm']")
	private WebElement conform3;

	public WebElement getConform3() {
		return conform3;
	}
}
