package frmAdminTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PegasusPages.ActionDriver;

public class PublishingTab {

WebDriver iedriver;	
private By publishing_tab = By.id("_ctl8__ctl10_Link");
private By ManageProducts_subtab = By.id("_ctl9_anc_3");
private String ManageProducts_pagetitle = "Manage Products";
private String frmProductManagementContainer = "ifrmWorkspace";	
private String frmListCourses = "ifrmLeft";
private By SearchCourses_link = By.id("ancLeftSearch");


public PublishingTab(WebDriver iedriver)
{
	this.iedriver = iedriver;
}

public PublishingTab publishingtab_access()
{
	ActionDriver waitforpage = new ActionDriver(iedriver);
	waitforpage.explicitwait(publishing_tab);
	iedriver.findElement(publishing_tab).click();
	return this;
}

public PublishingTab Manageproductsubtab_access()
{
	ActionDriver waitforpage = new ActionDriver(iedriver);
	waitforpage.explicitwait(ManageProducts_subtab);
	iedriver.findElement(ManageProducts_subtab).click();
	return this;
}

public PublishingTab Searchcourses()
{
	ActionDriver frameselect = new ActionDriver(iedriver);
	frameselect.frameselector(frmProductManagementContainer);
	iedriver.findElement(SearchCourses_link).click();
	return this;
}


}
