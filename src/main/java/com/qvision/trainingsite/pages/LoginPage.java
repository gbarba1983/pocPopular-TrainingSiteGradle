package com.qvision.trainingsite.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://3.233.80.188/TrainingSite-1.0-SNAPSHOT/")
public class LoginPage extends PageObject {
	
	@FindBy(name = "user")
	WebElement txtEmail;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	public void Login(String username, String password){
		txtEmail.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}	
	
}
