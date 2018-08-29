package BasicProp;
//package ;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class setProperty {

	InputStream input = null;
	Properties prop = new Properties();
	public void setProperty1(String args[]) throws IOException
	{
		input = getClass().getClassLoader().getResourceAsStream("config.properties");


	    // load a properties file
	    prop.load(input);

		
		String chromeprop = prop.getProperty("chromeprop");
		String chromedriver = prop.getProperty("chromedriver");
		System.setProperty(chromeprop,chromedriver);
		setProperty f = new setProperty();
		
	}
}
