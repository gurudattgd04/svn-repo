package Libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	private String URL;
	Properties file = new Properties();
	private void reader() throws FileNotFoundException, IOException
	{
		
		file.load(new FileInputStream("Config.properties"));
		URL = file.getProperty("canvasurl");
	}
	
	public String geturl() throws FileNotFoundException, IOException
	{
		reader();
		return this.URL;
	}
	
	public String getvalue(String value) throws FileNotFoundException, IOException
	{
		reader();
		return file.getProperty(value);
		
		
	}

}
