package com.community.bdd.catalog;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.Arrays;

import com.community.bdd.SpringIntegrationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenderStepDefinitions  {
    Integer response;
    // String url = DEFAULT_URL ;

    private WebDriver driver = null;

    @Before()
    public void openBrowser() {
        System.setProperty("webdriver.firefox.bin", "C:\\Users\\HoHill\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        String Firefoxdriverpath = "C:\\Work\\geckodriver-v0.27.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", Firefoxdriverpath);
        driver = new FirefoxDriver();
    }

    @Given("I have logged in")
    public void i_have_logged_in() {
        System.out.println("I logged in");
        // driver.get("https:\\www.google.com");
    }

    @When("I search for {word} merchandise")
    public void i_search_for_merchandise(String female) {
        // response = restTemplate.getForObject(url + "search?q=" + female, Integer.class);
        // System.out.println( " response " + female);
        // result = calculator.add(a,b);
    }

    @Then("I should be shown the following merchandise:")
    public void I_should_be_shown_the_following_merchandise(io.cucumber.datatable.DataTable dataTable) {
        // assertThat(response).isEqualTo(expectedResult);
        System.out.println(""+ Arrays.toString(dataTable.asList().toArray()));
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
 