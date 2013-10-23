package CanvasPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PegasusPages.ActionDriver;

public class courses {
	WebDriver iedriver;
private By Settings = By.xpath("//ul[@id='section-tabs']//a[@class='settings']");
private By Apps_link = By.id("tab-tools-link");
private By View_Installed_Apps = By.xpath("//button[@class='btn view_tools_link lm pull-right']");	
private By Add_New_Apps = By.xpath("//button[@class='btn btn-primary add_tool_link lm pull-right']");


public courses(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public courses settings_access()
{
	ActionDriver waitforelement = new ActionDriver(iedriver);
	waitforelement.explicitwait(Settings);
	iedriver.findElement(Settings).click();
	return this;
}

public courses Apps_linkaccess()
{
	ActionDriver wait = new ActionDriver(iedriver);
	wait.explicitwait(Apps_link);
	iedriver.findElement(Apps_link).click();
	return this;
}

public courses View_Installed_Appaccess()
{
	
	ActionDriver wait = new ActionDriver(iedriver);
	wait.explicitwait(View_Installed_Apps);
	iedriver.findElement(View_Installed_Apps).click();
	return this;
}

public courses AddNewApps_LinkAccess()
{
	ActionDriver waitfornewapp = new ActionDriver(iedriver);
	waitfornewapp.explicitwait(Add_New_Apps);
	iedriver.findElement(Add_New_Apps).click();
	return this;
}


}
