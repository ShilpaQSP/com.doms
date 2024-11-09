package Dmo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Add Dependencies
	//JavaSelenium,TestNG,WebDriverManager,ApachePoi-Common,OOxml,ExtentReport



public class DDFdemo {
	public static void main(String[] args) throws IOException {
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		WorkbookFactory.create(false);
	}
	@Test
	public void DDFdemo() {
		
	}
}
