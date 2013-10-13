package PegasusPages;

import org.openqa.selenium.WebDriver;

public class TodaysViewUX {

private WebDriver iedriver;
private String TodaysViewPageTitle = "Today's View";

public TodaysViewUX(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public TodaysViewUX TodaysViewCourseHome()
{
	ActionDriver waitfortitle = new ActionDriver(iedriver);
	waitfortitle.waitforpage(TodaysViewPageTitle);
	String TodaysViewTitile = iedriver.getTitle();
	
	if(TodaysViewTitile.contains(TodaysViewPageTitle))
	{
		System.out.println("Today's view page loaded");
	}
	
	else
	{
		throw new IllegalArgumentException("This is not Todays view page");
	}
	
	return this;
	
}

	
}
