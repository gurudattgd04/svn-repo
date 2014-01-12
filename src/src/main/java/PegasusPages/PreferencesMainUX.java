package PegasusPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreferencesMainUX {

private final By preference_link = By.xpath("//a[@title='Preferences']");
private final String preference_frame = "_ctl0__ctl0_phBody_PageContent_ifrmPreferences"; 
private final By LTItools_link = By.id("atdContnet34");
private final By LTItool_frame = By.className("bod_1");
private final By LTItool_table = By.id("divborderLTI");
private final By LTItool_description = By.id("divToolInformation");
private final By LTItool_checkbox = By.id("chkEnableTools");
private final By SavePreference_btn = By.id("_ctl0:ContentHolderFooter:btnSavePrefFooter");

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
	iedriver.switchTo().defaultContent();
	return this;
}

public PreferencesMainUX ToolSelection()
{
	ActionDriver frameselector = new ActionDriver(iedriver);
	frameselector.frameselector(preference_frame);
	
	ActionDriver waitforelement = new ActionDriver(iedriver);
	waitforelement.explicitwait(LTItool_table);
	
	WebElement ltitable = iedriver.findElement(LTItool_table);
	List<WebElement> rows = ltitable.findElements(By.tagName("tr"));
	int rowsize = rows.size();
	
	        for (int i = 1; i <=rowsize; i++)
	        {
	        	WebElement columns = iedriver.findElement(By.xpath("//div[@id='divborderLTI']//tr["+i+"]/td[1]"));
	        	columns.click();
	        	ActionDriver wait = new ActionDriver(iedriver);
	        	wait.explicitwait(LTItool_description);
	        	String tooldescription = iedriver.findElement(LTItool_description).getText();
	        	System.out.println(tooldescription);
	        	if(tooldescription.contains("dev 4"))
	        	{
	        		WebElement Statuscol = iedriver.findElement(By.xpath("//div[@id='divborderLTI']//tr["+i+"]/td[3]/span"));
	        		String Status = Statuscol.getText();
	        		if(Status.contains("Enabled"))
	        		{
	        			JavascriptExecutor js;
	    	    		js = (JavascriptExecutor) iedriver;
	    	    		Object bool = js.executeScript("var chkBox = document.getElementById('chkEnableTools');"  +
	    	    			       "  if (chkBox.checked) {" +
	    	    			       "  return true  ;" +
	    	    			       "  }" +
	    	    			       " else{"+ " return false;" +"}" );
	    	    		
	    	    		boolean checkboxStatus = (Boolean) bool;
	    	    		if(checkboxStatus)
	    	    		{
	    	    			System.out.println(checkboxStatus);	
	    	    		}
	    	    		
	    	    		boolean checkbxstatus = iedriver.findElement(LTItool_checkbox).isEnabled();
	    	    		System.out.println(checkbxstatus);
	        			break;
	        		}
	        		else{
	        			
	        		iedriver.findElement(LTItool_checkbox).click();
	        		  		break;
	        		}
	        	}
	    		
	        	
	        }
	        
        	        		return this;		
	
	
}


public void savepreferences()
{
	iedriver.findElement(SavePreference_btn).click();


}



}
