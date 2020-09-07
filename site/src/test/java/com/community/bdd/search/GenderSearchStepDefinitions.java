package com.community.bdd.search;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.community.bdd.AbstractTest;
import com.community.controller.catalog.SearchController;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenderSearchStepDefinitions  {

    // @Autowired
    // private SearchController controllerToTest;

    
    @Given("I have access in")
    public void i_have_access_in() {
    }

    @When("I filter for {word} merchandise")
    public void i_search_for_merchandise(String female) {

        // Mocking Controller
        // controllerToTest = mock(SearchController.class);

        // try {
        //     mvc.perform(get("/search").param("q", female)).andDo(print()).andExpect(status().isOk());
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        
    }

    @Then("I should see the following merchandise:")
    public void I_should_see_the_following_merchandise(io.cucumber.datatable.DataTable dataTable) {      
    }

}
