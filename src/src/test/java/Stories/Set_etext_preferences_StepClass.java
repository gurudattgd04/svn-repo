package Stories;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PegasusPages.ActionDriver;
import PegasusPages.HEDGlobalHome;
import PegasusPages.PreferencesMainUX;
import PegasusPages.frmlogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Set_etext_preferences_StepClass {

private WebDriver iedriver;
	
@Given("^I am on the Global Home page$")
public void homepageaccess() throws FileNotFoundException, IOException
{
frmlogin login = new frmlogin();
this.iedriver = login.LoginMethod();	
	
}

@When("^I enter in the MySpanishLabMaster from the Global Home page as HedWsInstructor$")
public void courseaccess() throws InterruptedException
{

HEDGlobalHome homepageaccess = new HEDGlobalHome(iedriver);
homepageaccess.CourseAccess();
	
}

@When("^I navigate to the Preferences tab$")
public void preferencetabaccess()
{
PreferencesMainUX prefaccess = new PreferencesMainUX(iedriver);
prefaccess.preflinkaccess();


}

@Then("^I should be on the Preferences page$")
public void preferencepagevalidatior()
{
	ActionDriver pagevalidation = new ActionDriver(iedriver);
	pagevalidation.PageValidation("Preferences");
	
}

@When("^I select LTI Tools sub tab$")
public void subpreferenceaccess()
{
	PreferencesMainUX ltitoolaccess = new PreferencesMainUX(iedriver);
	ltitoolaccess.LTItoolsaccess();
	
}

@When("^I set the eText in enable state$")
public void etextprefset()
{
	
}

@Then("^I should see the successfull message Preferences updated successfully$")
public void messagecheck()
{
	
}




}
