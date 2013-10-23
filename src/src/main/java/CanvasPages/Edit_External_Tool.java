package CanvasPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Libraries.PropertiesFileReader;
import PegasusPages.ActionDriver;

public class Edit_External_Tool {

	WebDriver iedriver;
private By external_tool_name = By.id("external_tool_name");	
private By external_tool_consumer_key = By.id("external_tool_consumer_key");
private By external_tool_shared_secret = By.id("external_tool_shared_secret");
private By external_tool_domain = By.id("external_tool_domain");
private By external_tool_privacy_level = By.id("external_tool_privacy_level");
private By external_tool_custom_fields_string = By.id("external_tool_custom_fields_string");
private By submit_btn = By.xpath("//button[@class='btn-primary ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']");

public Edit_External_Tool(WebDriver iedriver)
{
	this.iedriver = iedriver;
}


public Edit_External_Tool ExternalToolsformfill() throws FileNotFoundException, IOException
{
	ActionDriver wait = new ActionDriver(iedriver);
	wait.explicitwait(external_tool_name);
	
	PropertiesFileReader file = new PropertiesFileReader();
	iedriver.findElement(external_tool_name).sendKeys(file.getvalue("Externaltoolname"));
	iedriver.findElement(external_tool_consumer_key).sendKeys(file.getvalue("ConsumerKey"));
	iedriver.findElement(external_tool_shared_secret).sendKeys(file.getvalue("SharedSecretKey"));
	iedriver.findElement(external_tool_domain).sendKeys(file.getvalue("Domain"));
	Select selectprivacy = new Select(iedriver.findElement(external_tool_privacy_level));
	selectprivacy.selectByVisibleText("Public");
	iedriver.findElement(external_tool_custom_fields_string).sendKeys(file.getvalue("CustomFields"));
	iedriver.findElement(submit_btn).click();
	return this;
}





}
