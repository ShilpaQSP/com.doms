package com.doms.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.doms.WebDriverLibrary.WebDriverUtility;

/**
 * This Class provides the reusable methods to perform Java-Script Related Actions
 * 
 * 
 * @author HP
 * */
public class JavaScriptUtility {
		
		public static JavascriptExecutor jscobj;

		public  void enterData_DisabledElement(WebElement element, String data) {
			jscobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			jscobj.executeScript("arguments[0].value='"+ data +"'", element);
		}
		public  void click_DisabledElement(WebElement element) {
			jscobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			jscobj.executeScript("arguments[0].click()",element);
			
		}
		public void defaultVerticalScrollBy() {
			jscobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			jscobj.executeScript("window.scrollBy(1000,1000)");
		}
		public  void defaultVerticalScrollTo() {
			jscobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			jscobj.executeScript("window.scrollBy(1000,1000)");
		}
		
		public void scrollUsingView(WebElement element, boolean value) {
			jscobj= (JavascriptExecutor)WebDriverUtility.driver_static;
			jscobj.executeScript("arguments[0].scrollIntoView("+value+");",element);
		}
}
