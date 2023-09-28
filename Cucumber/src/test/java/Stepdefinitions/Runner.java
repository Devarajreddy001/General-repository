package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"Stepdefinitions"},
monochrome = true, plugin={"pretty", "html:target/cucumber-report/index.html","json:target/cucumber-report/cucumber.json", "junit:target/cucumber-report/cucumber.xml"}
)
		
public class Runner {

}
