package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature/BDDLogin.feature",
glue = "StepDef",
dryRun = false, 
plugin = {"pretty","html:BDDReports/report1.html",
		  "pretty","json:BDDReports/report2.json",
		  "pretty","junit:BDDReports/report3.junit"})

public class RunnerClass1 {

	}


