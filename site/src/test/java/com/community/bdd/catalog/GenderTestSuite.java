package com.community.bdd.catalog;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/catalog",
        glue = "com.community.bdd"
)
public class GenderTestSuite {
}