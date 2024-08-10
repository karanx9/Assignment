package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\eclipse-workspace\\Assignmenet\\src\\main\\resources\\featurefile\\simpleform.feature",
glue = "simpleform")

public class runner extends AbstractTestNGCucumberTests {

}
