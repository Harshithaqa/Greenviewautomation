package Greenview.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Greenview.Automation.PerformanceReportpage;
import resources.base;
import Greenview.Automation.Loginpage;

//import ObjectRepository.Loginpage;
//import ObjectRepository.PerformanceReportpage; 


public class PerformanceTest extends base {
	public WebDriver driver;
	public Properties prop;

    private static Logger log = LogManager.getLogger(base.class.getName());
    
@BeforeTest
	
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initiated");
		
		Properties prop=new Properties();

		
		FileInputStream fis = new FileInputStream("D:\\AutomationSelenium\\src\\main\\java\\resources\\data.properties");
				
				prop.load(fis);
				
				//driver.get("http://stage.greenviewportal.com/");
				driver.get(prop.getProperty("url"));
		
		
		log.info("Navigated to Login page");

		driver.manage().window().maximize();	
	}

private Object keyEvent;

@Test(dataProvider="getData")
public void Reports(String Username,String Password) throws InterruptedException, IOException
{

	
	Loginpage ap = new Loginpage(driver);
	
	Thread.sleep(5000);

	ap.LoginClick().click();
	ap.EmailID().sendKeys(Username);
	ap.Password().sendKeys(Password);
	ap.Login().click();
	log.info("Successfully logged in");

	

		PerformanceReportpage Rep = new PerformanceReportpage(driver);
		
		 //mouse over on User Management
			Actions actions = new Actions(driver);
			Thread.sleep(3000);
			WebElement UserManagement = Rep.UserManagement();
			actions.moveToElement(UserManagement).perform();
			System.out.println("Done Mouse hover on 'UserManagement' from Menu");
			Thread.sleep(8000);

//Mouse over on Search user
			WebElement searchuser = Rep.searchuser();
			actions.moveToElement(searchuser).perform();
			System.out.println("Done Mouse hover on 'searchuser' from Menu");
			searchuser.click();
			
			Thread.sleep(8000);

		
	
			
//click on Dashboard icon
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(Rep.Dashboard()));
			element1.click();
			Thread.sleep(8000);

//Mouse over on Reports
			WebElement Reports = Rep.Reports();
			//Mouse hover menuOption 'Rock'
			actions.moveToElement(Reports).perform();
			System.out.println("Done Mouse hover on 'Reports' from Menu");
			Reports.click();
			Thread.sleep(8000);

//Mouse over on Performance
			WebElement Performance = Rep.Performance();
			//Mouse hover menuOption 'Rock'
			actions.moveToElement(Performance).perform();
			System.out.println("Done Mouse hover on 'Performance' from Menu");
			Performance.click();
			Thread.sleep(3000);

		
			Rep.Category().click();
			Thread.sleep(3000);

			Rep.Category1().click();
			Thread.sleep(3000);

			Rep.Subtype().click();
			Thread.sleep(3000);

			Rep.Subtype1().click();
			Thread.sleep(3000);

			Rep.Categorygrouping().click();
			Thread.sleep(3000);

			Rep.Categorygrouping1().click();	
			Thread.sleep(3000);

			Rep.name().click();
			Thread.sleep(3000);

			Rep.unit().click();
			Thread.sleep(3000);

			Rep.unit1().click();
			Thread.sleep(3000);

			Rep.Date().click();
			Thread.sleep(3000);

			Rep.runreport().click();
			Thread.sleep(3000);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)");
	        js.executeScript("window.scrollBy(0,-2000)");
	        
			Thread.sleep(5000);

			Rep.Download().click();


			Thread.sleep(3000);

		
		
}

@DataProvider
public Object[][] getData()
{
	
		
		Object[][] data = new Object[1][2];
		data[0][0]="grace@greenview.sg";
		data[0][1]="greenview17";

		//data[1][0]="grace@greenview.sg";
		//data[1][1]="grace@greenview.sg";

		return data;
		
}
	
		

@AfterTest
public void teardown()
{
	driver.close();
}




}