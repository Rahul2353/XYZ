package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	WebElement loginclick;

	@FindBy(name = "email")
	WebElement UserName;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement ClickBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public HomePage login(String UN,String PA) {
		loginclick.click();
		
		UserName.sendKeys(UN);
		Password.sendKeys(PA);
		ClickBtn.click();

		return new HomePage();

	}

}
