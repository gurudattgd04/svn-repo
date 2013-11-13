package CanvasPages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Libraries.XMLReader;

public class UserDashboard {
	
WebDriver iedriver;
private By Start_newCourse_btn = By.id("start_new_course"); 
private By Course_name = By.id("course_name");
private By CreateCourse_btn = By.xpath("//button[text()='Create course']");
private By Courses = By.className("menu-item-title");
private By Courses_dropdwn = By.className("menu-item-drop");

public UserDashboard(WebDriver iedriver)
{
	this.iedriver=iedriver;
}

public UserDashboard courseaccess()
{
	XMLReader CourseNameread = new XMLReader("canvasLogins");
	Actions selectcouse = new Actions(iedriver);
	WebElement course = iedriver.findElement(Courses);
	WebElement courses_dropdown = iedriver.findElement(Courses_dropdwn);
	selectcouse.moveToElement(course).moveToElement(courses_dropdown).build().perform();
	
	WebElement courselist = iedriver.findElement(By.xpath("//div[@class='menu-item-drop']/table/tbody/tr/td/ul"));
	List<WebElement> courseslist = courselist.findElements(By.tagName("li"));
	//Iterator iter = courseslist.iterator();
	
		for(int i = 1; i < courseslist.size(); i++ )
		{
		String coursename = courselist.findElement(By.xpath("//ul[@class='menu-item-drop-column-list']/li["+i+"]/a/span")).getText();
			//System.out.println(iter.next());
		if(coursename.contains(CourseNameread.Coursename()))
		{
			
			WebElement courseclick = courselist.findElement(By.xpath("//ul[@class='menu-item-drop-column-list']/li["+i+"]/a/span"));
			selectcouse.moveToElement(course).moveToElement(courseclick).click().build().perform();
			break;
		}
		}
	
	
	return this;
}

}
