package PegasusPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDriver {
	
private WebDriver iedriver;	

public ActionDriver(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public ActionDriver explicitwait(By locator)
{
	WebDriverWait wait = new WebDriverWait(iedriver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	
	return this;
}

public ActionDriver waitforpage(String locator)
{
	WebDriverWait wait = new WebDriverWait(iedriver, 30);
	wait.until(ExpectedConditions.titleIs(locator));
	
	return this;
}

public ActionDriver frameselector(String frameid)
{
   WebDriverWait waitforframe = new WebDriverWait(iedriver, 30);
   waitforframe.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameid));
	
	
	return this;
}
public ActionDriver PageValidation(String PageTitle)
{
	String title = iedriver.getTitle();
	if(title.contains(PageTitle))
	{
		System.out.print(title);
	}
	else
	{
		throw new IllegalArgumentException("This is not "+PageTitle+" page");
	}
	
	return this;
}

public ActionDriver Dropdownselectot(By locator, String text)
{
	Select select = new Select(iedriver.findElement(locator));
	select.selectByVisibleText(text);
	return this;
}


public ActionDriver popuphandler(String windowtitle)
{
	String mainwindow = iedriver.getWindowHandle();
	Set<String> windows = iedriver.getWindowHandles();
	System.out.println(windows.size());
	Iterator<String> iterator = windows.iterator();
	while(iterator.hasNext())
	{
		String popup = iterator.next();
		System.out.println(popup);
			iedriver.switchTo().window(popup);
			System.out.println(iedriver.getTitle());
			if(iedriver.getTitle().contains(windowtitle))
			{
				break;
		}
			
	}
	
	
	return this;
}

}
