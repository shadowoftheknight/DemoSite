package com.community.bdd.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/calculator",
        glue = "com.community.bdd"
)
public class CalculatorTest {
}
