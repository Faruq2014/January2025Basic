package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
Properties prop;

	public PropertyReader() {
	super();
	prop= new Properties();
	
	String filePath="src/test/resources/test.properties";
	try {
		FileInputStream fis= new FileInputStream(filePath);
		prop.load(fis);
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	
}
	public String getUrl() {
		return prop.getProperty("url");
		
	}
	
	public String getUserName() {
		return prop.getProperty("userName");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}
	public String getfirstName() {
		return prop.getProperty("firstName");
	}





	public static void main(String[] args) {
		 PropertyReader pr = new PropertyReader();
	System.out.println(pr.getUrl());
	System.out.println(pr.getPassword());
	}

}
