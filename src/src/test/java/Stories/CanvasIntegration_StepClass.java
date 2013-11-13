package Stories;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.maven.plugin.gpg.SigningBundle;
import org.openqa.selenium.WebDriver;

import CanvasPages.Edit_External_Tool;
import CanvasPages.UserDashboard;
import CanvasPages.courses;
import CanvasPages.login;
import PegasusPages.ActionDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CanvasIntegration_StepClass {
	
private WebDriver iedriver;
	
@Given("^canvas user enter username and password$")
public void userformfill() throws FileNotFoundException, IOException
{
    login signin = new login(iedriver);
    signin.usernameentry();
    this.iedriver = signin.passwordentry();
}

@When("^clicks on sign in button$")
public void signin()
{

	login signin = new login(iedriver);
    signin.sign();
}

@Then("^user should see home page$")
public void homepage()
{
    		
	ActionDriver pagevalidate = new ActionDriver(iedriver);
	pagevalidate.PageValidation("User Dashboard");
	
}

@When("^user access the course$")
public void courseaccess()
{
	UserDashboard courseacc = new UserDashboard(iedriver);
	courseacc.courseaccess();
}


@When("^Click on Settings Clicks$")
public void settingsaccess()
{
	
	courses settingaccess = new courses(iedriver);
	settingaccess.settings_access();
	
}

@When("^Access Apps link$")
public void Appslink_access()
{
	courses applinkaccess = new courses(iedriver);
	applinkaccess.Apps_linkaccess();
}


@When("^instructor click on View installed apps button$")
public void viewinstallappaccess()
{
	courses viewinstallappacc = new courses(iedriver);
	viewinstallappacc.View_Installed_Appaccess();
}

@When("^clicks on Add New App button$")
public void Addnewapp_access()
{
	courses addnewapp = new courses(iedriver);
	addnewapp.AddNewApps_LinkAccess();
	
}

@When("^Fill the External tool form with required data$")
public void Externaltool_formfill() throws FileNotFoundException, IOException
{
	Edit_External_Tool externaltools = new Edit_External_Tool(iedriver);
	externaltools.ExternalToolsformfill();
}

@After
public void shutdown()
{
	iedriver.close();
	iedriver.quit();
}

}
