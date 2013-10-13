package Libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	private String URL;
	private void reader() throws FileNotFoundException, IOException
	{
		Properties file = new Properties();
		file.load(new FileInputStream("Config.properties"));
		URL = file.getProperty("url");
	}
	
	public String geturl() throws FileNotFoundException, IOException
	{
		reader();
		return this.URL;
	}

}
