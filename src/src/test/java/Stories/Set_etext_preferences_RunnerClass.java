package Stories;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@Cucumber.Options(tags = {"@etextpref"}, format = {"pretty", "html:target/cucumber","json:target/cucumber.json" })
public class Set_etext_preferences_RunnerClass {

}
