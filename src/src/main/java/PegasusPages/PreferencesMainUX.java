package PegasusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreferencesMainUX {

private final By preference_link = By.xpath("//a[@title='Preferences']");
private final String preference_frame = "_ctl0__ctl0_phBody_PageContent_ifrmPreferences"; 
private final By LTItools_link = By.id("atdContnet34");

private WebDriver iedriver;

public PreferencesMainUX(WebDriver iedriver)
{
	this.iedriver = iedriver;
}
	
public PreferencesMainUX preflinkaccess()
{
	ActionDriver waitforpreflink = new ActionDriver(iedriver);
	waitforpreflink.explicitwait(preference_link);
	iedriver.findElement(preference_link).click();
	
	return this;
}

public PreferencesMainUX LTItoolsaccess()
{

	ActionDriver waitforframe = new ActionDriver(iedriver);
	waitforframe.frameselector(preference_frame);
	iedriver.findElement(LTItools_link).click();
	return this;
}




}
