package CanvasPages;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




import Libraries.PropertiesFileReader;
import Libraries.XMLReader;

public class login {
	
public WebDriver iedriver;	
private By Email = By.id("pseudonym_session_unique_id");
private By password = By.id("pseudonym_session_password");
private By Login_btn = By.xpath("//button[text()='Log In']");
private XMLReader userdata = new XMLReader();


public login(WebDriver iedriver)
{
	if(iedriver==null)
	{
this.iedriver = new InternetExplorerDriver();
	}
	else
	{
	  this.iedriver = iedriver;
	}
}


public WebDriver usernameentry() throws FileNotFoundException, IOException
{
	PropertiesFileReader fileread = new PropertiesFileReader();
    iedriver.get(fileread.geturl());	
	iedriver.findElement(Email).sendKeys(userdata.username());
	return iedriver;
}


public WebDriver passwordentry()
{
	iedriver.findElement(password).sendKeys(userdata.password());
	return iedriver;
}

public login sign()
{
	
	iedriver.findElement(Login_btn).click();
	return this;
}

}
