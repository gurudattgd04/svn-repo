package PegasusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class frmAddeBookLink {

private final By Link_Title = By.id("txtLinkTitle");	
private final By Select_Book = By.id("ddlSingleSelectBook");
private final By Add_btn = By.id("imgBtnSave_Update");
private final String Link_Name = "eText_Automatedlink1";
private final String eBook_name = "etext25thju;u";
private WebDriver iedriver;
private final String window_title = "Add eText Link";
public frmAddeBookLink(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public frmAddeBookLink eTextLinkCreator() throws InterruptedException
{
	String mainwindow = iedriver.getWindowHandle();
	ActionDriver popupswitch = new ActionDriver(iedriver);
	popupswitch.popuphandler(window_title);
	
	ActionDriver waitforlinktitle = new ActionDriver(iedriver);
    waitforlinktitle.explicitwait(Link_Title);
    
	iedriver.findElement(Link_Title).sendKeys(Link_Name);
	waitforlinktitle.Dropdownselectot(Select_Book, eBook_name);
	iedriver.findElement(Add_btn).click();
	iedriver.switchTo().defaultContent();
	ContentBrowser savecopy = new ContentBrowser(iedriver);
	savecopy.savecopyto();
	iedriver.switchTo().window(mainwindow);
	//iedriver.switchTo().defaultContent();
	return this;
}


}
