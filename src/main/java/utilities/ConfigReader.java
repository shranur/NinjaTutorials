package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties init_properties() {
	
	Properties prop = new Properties();
	File file = new File("./src/test/resources/configurationFiles/config.properties");
	try {
	FileInputStream fis = new FileInputStream(file);
	prop.load(fis);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return prop;

	}
	}
