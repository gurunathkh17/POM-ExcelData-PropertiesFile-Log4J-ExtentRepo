package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	public static String getDataFromPropertyFile(String key) throws IOException {
	
		//create a file class object to get file path
		File file = new File("C:\\Users\\HOME\\Desktop\\JavaSeleniumTrainingWorkSpace\\TestData.properties");
		//Create reader class object
		FileReader reader = new FileReader(file);
		//create properties class object
		Properties prop = new Properties();
		//load the properties file
		prop.load(reader);
		//call getValue() of properties class
	    return (String) prop.get(key);
	
		
	}
	
}
