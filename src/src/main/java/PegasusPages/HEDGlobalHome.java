package PegasusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HEDGlobalHome {
	
private final String PageTitle = "Global Home";	
private final By CourseFrame = By.id("tblCourse");	
private final By CourseID = By.id("aCT_10001188");

private WebDriver iedriver;

public HEDGlobalHome(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public void PageValidation()
{
	String title = iedriver.getTitle();
	if(title.contains(PageTitle))
	{
		System.out.print("Global Home page loaded");
	}
	else
	{
		throw new IllegalArgumentException("This is not Course home page");
	}
}

public HEDGlobalHome CourseAccess() throws InterruptedException
{
	//Thread.sleep(3000);
	ActionDriver wait = new ActionDriver(iedriver);
	wait.explicitwait(CourseID);
	//iedriver.findElement(CourseID).click();
	iedriver.findElement(By.partialLinkText("eText25thjuly")).click();
	return this;
}

}
