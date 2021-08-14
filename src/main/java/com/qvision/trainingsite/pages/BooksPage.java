package com.qvision.trainingsite.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class BooksPage extends PageObject {

	@FindBy(xpath = "//*[@id='existentes']/form/table/tbody/tr[2]/td[4]/input")
	WebElement txtJava;
	
	@FindBy(xpath = "//*[@id='existentes']/form/table/tbody/tr[3]/td[4]/input")
	WebElement txtRuby;
	
	@FindBy(xpath = "//*[@id='existentes']/form/table/tbody/tr[4]/td[4]/input")
	WebElement txtPython;
	
	@FindBy(xpath = "//*[@id='existentes']/form/div/input[1]")
	WebElement btnAdd;
	
	@FindBy(id = "total")
	WebElement txtTotal;
	
	public void addBooks(int java, int ruby, int python){
		txtJava.clear();
		txtJava.sendKeys(String.valueOf(java));
		txtRuby.clear();
		txtRuby.sendKeys(String.valueOf(ruby));
		txtPython.clear();
		txtPython.sendKeys(String.valueOf(python));
		btnAdd.click();
	}
	
	public boolean validateTotal(int expected){
		boolean isEquals = false;
		if(Integer.parseInt(txtTotal.getAttribute("value")) == expected){
			isEquals = true;
		}
		return isEquals;
	}
	
}
