package Greenview.Automation;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

import Greenview.Automation.SearchUserpage;
import resources.base;
import Greenview.Automation.Loginpage;

//import SeleniumAutomation.Mavenjava.Loginpage;
//import ObjectRepository.Loginpage;
//import ObjectRepository.SearchUserpage;

public class SearchUserTest extends base {
	
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
	public void AddEnvironmentaldata(String Username,String Password) throws InterruptedException, IOException
	{

		
		Loginpage ap = new Loginpage(driver);
		
		Thread.sleep(5000);

		ap.LoginClick().click();
		ap.EmailID().sendKeys(Username);
		ap.Password().sendKeys(Password);
		ap.Login().click();
		log.info("Successfully logged in");
	
		SearchUserpage user = new SearchUserpage(driver);
		
		Thread.sleep(5000);

		// Mouse over on User Management
				Actions actions = new Actions(driver);
				Thread.sleep(3000);
				WebElement UserManagement = user.UserManagement();
				actions.moveToElement(UserManagement).perform();
				System.out.println("Done Mouse hover on 'UserManagement' from Menu");

		// Mouse Over on Search User
				WebElement searchuser = user.searchuser();
				actions.moveToElement(searchuser).perform();
				System.out.println("Done Mouse hover on 'searchuser' from Menu");
				searchuser.click();
				Thread.sleep(3000);

		// Search using Filter		
				
				user.Filter().click();
				Thread.sleep(2000);

				user.Input().sendKeys("Chimeraa");
				Thread.sleep(2000);

				user.Search().click();
				Thread.sleep(5000);

		// click on Dashboard icon
				WebDriverWait wait1 = new WebDriverWait(driver, 10);
				WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(user.element1()));
				element1.click();
				Thread.sleep(5000);

		// Mouse over on track
				Actions actions1 = new Actions(driver);
				Thread.sleep(5000);
		        WebElement  track =  user.track();
				actions.moveToElement(track).perform();
				System.out.println("Done Mouse hover on 'track' from Menu");
				Thread.sleep(3000);

		// Mouse over on Environmental data
				WebElement Environmentaldata =user.Environmentaldata();
				//Mouse hover menuOption 'Rock'
				actions.moveToElement(Environmentaldata).perform();
				System.out.println("Done Mouse hover on 'Environmentaldata' from Menu");
				Environmentaldata.click();
				
				//bulk data upload
				//WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/span[2]/div[2]/div/div/div/ul/li[2]/span/a"));
				//JavascriptExecutor executor = (JavascriptExecutor)driver;
				//executor.executeScript("arguments[0].click();", ele);
				
				Thread.sleep(3000);

				
				//WebElement file = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div/bulk-file-upload/div/div[1]/div/input"));
				//file.click();

		// Click on Add Environmental data
				user.Add().click();
				Thread.sleep(5000);
				
		// Select Category from drop down
				user.Category().click();
				Thread.sleep(2000);

				user.Energy().click();
				Thread.sleep(5000);

		// Select Utility from drop down
				user.Utility().click();
				Thread.sleep(5000);
				user.utilityname().click();
				Thread.sleep(5000);

		// Select From date		
				user.FromDate().click();
				Thread.sleep(2000);

				user.Date1().click();
				Thread.sleep(2000);

				user.Date2().click();
				
		// Select To date
				user.ToDate().click();
				Thread.sleep(2000);

				user.Date3().click();
				Thread.sleep(2000);

				user.Date4().click();
				Thread.sleep(5000);

		// Input usage value
				user.Usage().sendKeys("1000");
				Thread.sleep(5000);

		// Click on Save
				user.Save().click();
				Thread.sleep(8000);

				driver.quit();

				/*//bulk data upload
				WebElement BulkUpload = user.BulkUpload();
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", BulkUpload);
						
				
				Thread.sleep(8000);
				WebDriver webDriver = null;
				
				Thread.sleep(8000);

				WebElement upload = user.upload();

				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();",upload );
						
		
				//user.upload().click();
				Thread.sleep(5000);
				
				Robot robo = new Robot();
				
				StringSelection str  = new StringSelection("C://Users//Ranjitha//Desktop//property-env-submeter-data (24).xlsm");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				
				robo.keyPress(KeyEvent.VK_CONTROL);
				robo.keyPress(KeyEvent.VK_V);
				
				robo.keyRelease(KeyEvent.VK_CONTROL);
				robo.keyRelease(KeyEvent.VK_V);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);

				driver.close();*/

				
				//user.upload().sendKeys("C://Users//Ranjitha//Desktop//property-env-submeter-data (24).xlsm");
		       // upload.sendKeys("C://Users//Ranjitha//Desktop//property-env-submeter-data (24).xlsm");
		
				//user.button().click();

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