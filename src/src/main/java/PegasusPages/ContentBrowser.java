package PegasusPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentBrowser {
	
	private final String title = "Save copy to";	
    private final By AddandClose_btn = By.xpath("//a[@id='_ctl0_PopupPageContent_imgBtnAdd_Close']");
    private WebDriver iedriver;
public ContentBrowser(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public void savecopyto() throws InterruptedException
{
	//iedriver.switchTo().defaultContent();
	//String mainwindow = iedriver.getWindowHandle();
	Thread.sleep(3000);
	ActionDriver popup = new ActionDriver(iedriver);
	popup.popuphandler(title);
	ActionDriver wait = new ActionDriver(iedriver);
	wait.explicitwait(AddandClose_btn);
	iedriver.findElement(AddandClose_btn).click();
	
	
}


}


