package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//features//",
		glue= {"stepdefs"},
		monochrome=true,
		//tags= {"@SmokeTest"}
		
		//tags= {"@SmokeTest","@RegressionTest"}
				//tags= {"@SmokeTest,@RegressionTest"}
		//tags={" not @SmokeTest", "@RegressionTest"}
				//tags= {"@RegressionTest"}@EndtoEndTest
				//tags={"not @SmokeTest","@EndtoEndTest", "@RegressionTest"}
		//tags={"@EndtoEndTest" ,"@RegressionTest"}
		 tags=("@FunctionalTest")
		)

public class TagRunner {

}
