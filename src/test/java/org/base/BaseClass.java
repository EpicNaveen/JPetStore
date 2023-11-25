package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\NAVEEN\\eclipse-workspace\\ProjectCucumberOct2023\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void scrool(WebElement obj) {
		Actions act = new Actions(driver);
		act.moveToElement(obj).perform();

	}
}