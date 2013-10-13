package Stories;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(tags = {"@etext"}, format = {"pretty", "html:target/cucumber","json:target/cucumber.json" })


public class LaunchEtextByEcollegeInstructor_RunnerClass {

}
