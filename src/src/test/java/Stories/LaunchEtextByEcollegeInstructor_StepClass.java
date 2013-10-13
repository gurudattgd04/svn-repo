package Stories;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;











import Libraries.PropertiesFileReader;
import PegasusPages.HEDGlobalHome;
import PegasusPages.TeachingPlanUX;
import PegasusPages.TodaysViewUX;
import PegasusPages.frmAddeBookLink;
import PegasusPages.frmlogin;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchEtextByEcollegeInstructor_StepClass {

public WebDriver iedriver;	
	

		
//The below step methods belongs to background	
@Given("^instructor is logged into application$")
public void instructorlogin() throws FileNotFoundException, IOException
{

frmlogin login = new frmlogin();
this.iedriver = login.LoginMethod();
	
}
	
@When("^user access course$")
public void courseaccess() throws InterruptedException
{

	HEDGlobalHome homepage = new HEDGlobalHome(iedriver);
	homepage.CourseAccess();
	
}

@Then("^Course Home page should display$")
public void coursehomepage()
{
	TodaysViewUX coursehome = new TodaysViewUX(iedriver);
	coursehome.TodaysViewCourseHome();
}
//Here it ends the background part


//Below are the step methods for scenario	
@When("^I navigate to the Course Materials tab$")
public void coursematerialtabaccess()
{
	TeachingPlanUX coursematerials = new TeachingPlanUX(iedriver);
	coursematerials.ContentSelector();
}

@Then("^I should be on the Course Materials page$")
public void coursematerialspageassert()
{
	TeachingPlanUX pagevalidate = new TeachingPlanUX(iedriver);
	pagevalidate.CoursehomepageValidator();
}

@When("^I click on the Add Course Materials option$")
public void addcontent() throws InterruptedException
{
TeachingPlanUX addcontent = new TeachingPlanUX(iedriver);
addcontent.ContentCreator();
	
	
}

@When("^I click on the Add eText Link activity type$")
public void AddEtextLink()
{
	TeachingPlanUX contentselect = new TeachingPlanUX(iedriver);
	contentselect.ActivityTypeSelector();
}

@When("^I create eText link$")
public void EtextCreation() throws InterruptedException
{
frmAddeBookLink etextcreation = new frmAddeBookLink(iedriver);
etextcreation.eTextLinkCreator();
	
}

@Then("^I should see the successfull message eText link saved successfully$")
public void SuccessMsg()
{
	iedriver.switchTo().defaultContent();
	TeachingPlanUX messagedisplay = new TeachingPlanUX(iedriver);
	messagedisplay.MessageValidator();
}


/*@After
public void driverquit()
{
	iedriver.close();
	iedriver.quit();
}*/

}
