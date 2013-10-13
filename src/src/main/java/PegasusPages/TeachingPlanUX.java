package PegasusPages;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.runtime.junit.Assertions;

public class TeachingPlanUX {
	
private final By CourseMaterialsNav = By.xpath("//table[@id='tblMenuBar']/tbody/tr/td[4]/a[@title='Course Materials']");	
private final String MyCourseFrameID = "ifrmRight";
private final By AddCourseMaterials_btn = By.className("btn_AddContent");
private final String pagetitle = "Course Materials";
private final String ContentType = "Add eText Link";
private final By MessageBoard = By.id("PegasusMessageBoard");

private WebDriver iedriver;

public TeachingPlanUX(WebDriver iedriver)
{

	this.iedriver = iedriver;
	
}

public TeachingPlanUX CoursehomepageValidator()
{
	ActionDriver pagevalidate = new ActionDriver(iedriver);
	pagevalidate.PageValidation(pagetitle);
	return this;
}

public TeachingPlanUX ContentSelector()
{
	iedriver.findElement(CourseMaterialsNav).click();
	
	return this;
}

public TeachingPlanUX ContentCreator() throws InterruptedException
{
	ActionDriver wait = new ActionDriver(iedriver);
	wait.frameselector(MyCourseFrameID);
	iedriver.findElement(AddCourseMaterials_btn).click();

	return this;
}

public TeachingPlanUX ActivityTypeSelector()
{
	WebElement contentdropdown = iedriver.findElement(By.xpath("//table[@id='tbldivMenu']/tbody"));
	List<WebElement> rows = contentdropdown.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	for(int i=1;i<rows.size();i++)
	{
		WebElement columns = iedriver.findElement(By.xpath("//table[@id='tbldivMenu']/tbody/tr["+i+"]"));
		List<WebElement> col = columns.findElements(By.tagName("td"));
		for(int j=1; j <= col.size(); j++)
		{
			WebElement column = iedriver.findElement(By.xpath("//table[@id='tbldivMenu']/tbody/tr["+i+"]"));
			String contentname = column.findElement(By.tagName("td")).getText();
			
			if(contentname.contains(ContentType))
			{
				iedriver.findElement(By.xpath("//table[@id='tbldivMenu']/tbody/tr["+i+"]/td")).click();
				break;
			}
		}
		//System.out.println(col.size());
	}
	

	
	return this;
}

public TeachingPlanUX MessageValidator()
{
	ActionDriver wait = new ActionDriver(iedriver);
	wait.explicitwait(MessageBoard);
	WebElement message = iedriver.findElement(MessageBoard);
	String text = message.getText();
	Assert.assertEquals("eText link saved successfully.", text);
	System.out.println(text);
	return this;
}

}
