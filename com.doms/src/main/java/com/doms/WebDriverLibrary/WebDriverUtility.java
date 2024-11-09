package com.doms.WebDriverLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * This class is used provides the reusable methods to perform all Browser Related Actions
 * @author HP*/




public class WebDriverUtility {

	public  WebDriver driver;
	public static WebDriver driver_static;
	public  Select selectobj;
	public  Actions actionsobj;
	public  Robot rbtobj;
	public  WebDriverWait wait;
	
	
	/**
	 * This method is used to launch the specific Browser
	 * @param String Browser Name
	 * @return void*/
	public  void launchBrowser(String browser) {
		switch(browser) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static = driver;
			break;
		case "Edge" :
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver_static = driver;
			break;
		case "Firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver_static = driver;
			break;
		default : 
			System.out.println("Choose a valid browser.");
			break;
		}

	}
	
	/**
	 * This method is used to Navigate to specfic Application
	 * @param String url
	 * @return void*/
	public  void navigateToApplication(String url) {
		driver.get(url);
	}
	
	/**
	 * This method is used to Maximize the Browser
	 * return void*/
	public  void maximizeTheBrowser() {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to close a Specific Browser
	 * return void*/
	
	public  void closeTheBrowser() {
		driver.close();
	}
	
	/**
	 * This method is used to Close All the Browsers
	 * return void*/
	public  void closeAllBrowser() {
		driver.quit();
	}
	
	/**
	 * This method is used to Wait Implicitly
	 * @param long duration
	 * return void*/
	public  void waitImplicitly(long duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	/**
	 * This method is used to wait Explicitly
	 * @param long duration, WebElement element
	 *  return void*/
	public  void waitexplicitly(long duration,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method is used to Select Options in Dropdown
	 * @param WebElement element,int index
	 *  return void*/
	
	public void selectOptionInDropDown(WebElement element,int index) {
		selectobj.selectByIndex(index);
	}

	/**
	 * This method is used to Select Options in Dropdown
	 * @param WebElement element,String visibletext
	 *  return void*/
	public void selectOptionInDropDown(WebElement element,String visibletext) {
		selectobj.selectByVisibleText(visibletext);
	}
	
	/**
	 * This method is used to Select Options in Dropdown
	 * @param String value,WebElement element
	 *  return void*/
	public void selectOptionInDropDown(String value,WebElement element) {
		selectobj.selectByValue(null);
	}

	/**
	 * This method is used to Mouse Hovering Actions
	 * @param WebElement element
	 *  return void*/
	public void mouseHovering(WebElement element) {
		actionsobj.moveToElement(element).perform();
	}
	
	
	/**
	 * This method is used to perform Press Key using Keyboard actions 
	 *  return void*/
	public void pressTheKey_pageDown() {
		rbtobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This method is used to perform Release Key using Keyboard actions 
	 *  return void*/
	public void releaseTheKey_pageDown() {
		rbtobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This method is used to Accept the Popup 
	 *  return void*/
	public void alertPopupAccept() {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method is used to Dismiss the Popup 
	 *  return void*/

	public void alertPoopupDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is used to Pass Control to Frame 
	 *@param int index
	 *  return void*/
	public void switchControlToFrame(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to Pass Control to Frame 
	 *@param WebElement element
	 *  return void*/
	public void switchControlToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method is used to Pass Control Back to Main 
	 *@param int index
	 *  return void*/
	public void switchBackControlToMain() {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to Pass Control to Window 
	 *@param String windowadd
	 *  return void*/
	public void switchControlToWindow(String windowadd) {
		
		driver.switchTo().window(windowadd);
	}
}
