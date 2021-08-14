package com.qvision.trainingsite.stepdefinitions;

import java.util.Map;

import org.junit.Assert;

import com.qvision.trainingsite.steps.BuyStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuyStepdefinitions {
	
	@Steps
	BuyStep stepBuy;

	@Given("^That entered the application$")
	public void thatEnteredTheApplication(DataTable dataLogin) {
		Map<String, String> data = dataLogin.asMaps(String.class, String.class).get(0);
	    stepBuy.openApp(data.get("user"), data.get("password"));
	}

	@When("^I type the data$")
	public void iTypeTheData(DataTable dataBooks) {
		Map<String, String> data = dataBooks.asMaps(String.class, String.class).get(0);
		stepBuy.buyBooks(Integer.parseInt(data.get("java")), Integer.parseInt(data.get("ruby")), Integer.parseInt(data.get("python")));
	}

	@Then("^I get the grand total$")
	public void iGetTheGrandTotal(DataTable dataTotal) {
		Map<String, Integer> data = dataTotal.asMaps(String.class, Integer.class).get(0);
		Assert.assertTrue("Los valores no coinciden.", stepBuy.validateBuy(data.get("total")));
	}
	
}
