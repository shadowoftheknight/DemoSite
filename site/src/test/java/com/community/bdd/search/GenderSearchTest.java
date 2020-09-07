package com.community.bdd.search;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/search",
        glue = "com.community.bdd"
)
public class GenderSearchTest {
}
