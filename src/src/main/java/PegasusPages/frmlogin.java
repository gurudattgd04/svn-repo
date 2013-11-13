package PegasusPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Libraries.PropertiesFileReader;
import Libraries.XMLReader;





public class frmlogin {
	
private final By username = By.id("username");
private final By password = By.id("password");
private final By signin_btn = By.className("lgn_btn");


public final WebDriver iedriver;
XMLReader dataread = new XMLReader("CSUserdetails");
public frmlogin()
{
	 iedriver = new InternetExplorerDriver();
}

public WebDriver LoginMethod() throws FileNotFoundException, IOException
{
	PropertiesFileReader properties = new PropertiesFileReader();
	iedriver.get(properties.geturl("wsurl"));
	iedriver.findElement(username).sendKeys(dataread.username());
	iedriver.findElement(password).sendKeys(dataread.password());
	iedriver.findElement(signin_btn).click();
	return iedriver;
}

}
