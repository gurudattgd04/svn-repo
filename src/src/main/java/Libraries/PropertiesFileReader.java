package Libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	private String URL;
	Properties file = new Properties();
	public PropertiesFileReader() throws FileNotFoundException, IOException
	{
		
		file.load(new FileInputStream("Config.properties"));
		
	}
	
	public String geturl(String url) throws FileNotFoundException, IOException
	{
		//reader();
		URL = file.getProperty(url);
		return this.URL;
	}
	
	public String getvalue(String value) throws FileNotFoundException, IOException
	{
		//reader();
		return file.getProperty(value);
		
		
	}

}
