package com.doms.PropertiesFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.doms.GenericLibrary.FrameworkConstant;

/**
 * This Class provides the reusable methods to Read the Data to Property File
 * By calling in-built methods
 * @author HP
 * */


public class ReadPropertiesFile implements FrameworkConstant {
	public  FileInputStream fis; //declare as local var bcz access for within cls 
	public  Properties property;
	public  FileOutputStream fos;//locl...
public  String readData(String key) {
	//1.convert the Physical file into Java readable file
	try {
		 fis=new FileInputStream(propertypath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//2.create an object for Properties class
	Properties property=new Properties();
	
	//3.Load all the keys/Datas
	try {
		property.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//4.Fetch the data
	String data=property.getProperty(key);
	return data;
	
}
public  void writeData(String key,String value) {
	//1.convert the Physical file into Java readable file
		try {
			 fis=new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2.create an object for Properties class
		Properties property=new Properties();
		//3.Load all the keys/Datas
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//4.write data
		property.put(key, value);
		//5.convert java readable to physical file
		try {
			 fos=new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//6.store the data
		try {
			property.store(fos, "Latest key updated sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}



