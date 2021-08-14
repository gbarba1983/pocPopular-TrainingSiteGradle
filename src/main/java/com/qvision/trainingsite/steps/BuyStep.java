package com.qvision.trainingsite.steps;

import com.qvision.trainingsite.pages.BooksPage;
import com.qvision.trainingsite.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class BuyStep {

	LoginPage pageLogin;
	BooksPage pageBook;
	
	@Step
	public void openApp(String user, String pass){
		pageLogin.open();
		pageLogin.Login(user, pass);
	}
	
	@Step
	public void buyBooks(int java, int ruby, int python){
		pageBook.addBooks(java, ruby, python);
	}
	
	@Step
	public boolean validateBuy(int expectedTotal){
		return pageBook.validateTotal(expectedTotal);
	}
	
}
