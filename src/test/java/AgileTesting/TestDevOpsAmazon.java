package AgileTesting;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//Glue is used to specify the test file
//Tag is used to exclude or include the files while execution.
@CucumberOptions(features="src/test/resources/Amazon.feature",glue="AgileTesting",tags="@mytest")
public class TestDevOpsAmazon {

}
