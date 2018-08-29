package Basic;
//package ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class setProperty {

	//Properties prop = new Properties();
	public void setProperty1() throws IOException
	{

		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("C:/Users/Administrator/eclipse-workspace/HelloWorld/src/Drivers.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
		String chromeprop = prop.getProperty("chromeprop");
		String chromedriver = prop.getProperty("chromedriver");
		System.setProperty(chromeprop,chromedriver);
		}
		
	catch (IOException ex) 
		{
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}
		}}
		

