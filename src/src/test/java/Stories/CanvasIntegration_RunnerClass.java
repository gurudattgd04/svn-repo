package Stories;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@Cucumber.Options(tags = {"@canvas","@Scenario1"}, format = {"pretty", "html:target/cucumber","json:target/cucumber.json" })

public class CanvasIntegration_RunnerClass {

}
