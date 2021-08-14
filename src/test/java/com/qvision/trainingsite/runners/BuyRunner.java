package com.qvision.trainingsite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buybooks.feature", glue = "com.qvision.trainingsite.stepdefinitions", snippets = SnippetType.CAMELCASE)
public class BuyRunner {

}
