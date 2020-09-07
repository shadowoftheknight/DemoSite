package com.community.bdd.catalog;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import com.community.bdd.SpringIntegrationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenderStepDefinitions /*extends SpringIntegrationTest*/ {
    Integer response;
    // String url = DEFAULT_URL;

    
    @Given("I have logged in")
    public void i_have_logged_in() {
        System.out.println("I logged in");      
    }

    @When("I search for {word} merchandise")
    public void i_search_for_merchandise(String female) {
    }

    @Then("I should be shown the following merchandise:")
    public void I_should_be_shown_the_following_merchandise(io.cucumber.datatable.DataTable dataTable) {
    }

}
 