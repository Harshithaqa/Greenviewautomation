package Greenview.Automation;


import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Greenview.Automation.Add_Propertypage;
import Greenview.Automation.Loginpage;
import resources.base;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;


public class AddPropertyTest1 extends base{
	
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
	public void AddProperty(String Username,String Password) throws InterruptedException, IOException
	{

		
		Loginpage ap = new Loginpage(driver);
		
		Thread.sleep(5000);

		ap.LoginClick().click();
		ap.EmailID().sendKeys(Username);
		ap.Password().sendKeys(Password);
		ap.Login().click();
		log.info("Successfully logged in");

		Add_Propertypage add = new Add_Propertypage(driver);

		Thread.sleep(5000);

		// Mouse over on Property List
		//Instantiate Action+ Class
	Actions actions = new Actions(driver); 
		Thread.sleep(5000);
		WebElement propertylist = add.propertyList();
		actions.moveToElement(propertylist).perform();
		System.out.println("Done Mouse hover on 'propertylist' from Menu");
		
		
		
		WebElement Addnewproperty = add.Addnewproperty();
		actions.moveToElement(Addnewproperty).perform();
		System.out.println("Done Mouse hover on 'Addnewproperty' from Menu");
		Addnewproperty.click();
		Thread.sleep(5000);

		add.propertytype().click();
		Thread.sleep(5000);

		add.propertytype1().click();
		add.propertyname().sendKeys("testdemo5");
		add.address().sendKeys("ABC");
		add.Country().click();
		Thread.sleep(8000);

		add.USA().click();
		Thread.sleep(5000);

		add.State().click();
		add.State1().click();
		Thread.sleep(3000);

		add.City().sendKeys("Adak");
		add.Zipcode().sendKeys("99546");
		Thread.sleep(15000);
		
		Actions act = new Actions(driver);
		   
		   act.sendKeys(Keys.TAB).build().perform();
		   
		   act.sendKeys(Keys.RETURN).build().perform();
			Thread.sleep(5000);

		   
		   act.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);

//		   act.sendKeys(Keys.RETURN).build().perform();
		   
			
			  act.sendKeys(Keys.DOWN).build().perform();
				Thread.sleep(5000);

			 //  act.sendKeys(Keys.RETURN).build().perform();
				//Thread.sleep(5000);

			   act.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(5000);

			   act.sendKeys(Keys.RETURN).build().perform();


		 
		//add.parentbrandcompany().click();
	//	Thread.sleep(15000);

		//add.parentbrandcompany1().click();
		add.Save().click();
		Thread.sleep(5000);

	//Contact Details page
		add.contact().click();
		Thread.sleep(3000);

		add.contact1().click();
		Thread.sleep(3000);

		add.contact2().click();
		add.firstname().sendKeys("Test");
		add.lastname().sendKeys("Demo");
		add.email().sendKeys("Test@gmail.com");
		add.phonenumber().sendKeys("9874563210");

		add.jobtitle().sendKeys("Tester");
		Thread.sleep(3000);

		add.Defaultcontact().click();
		Thread.sleep(3000);

		add.save().click();
		Thread.sleep(3000);

		add.continuebutton().click();
		Thread.sleep(5000);
		
//Building Details page
		
		

		add.radio().click();
		Thread.sleep(3000);

		add.save1().click();
		Thread.sleep(15000);

	//Utility Details page
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(add.element1()));
		element1.click();

		add.element2().click();
		Thread.sleep(3000);

	add.element3().click();
	Thread.sleep(3000);

		add.element4().click();
		Thread.sleep(3000);

		add.subment130().click();
		Thread.sleep(3000);

		add.subdetails().click();
		Thread.sleep(3000);

		add.subdetails1().sendKeys("sub1");
		Thread.sleep(3000);

		add.subdetails2().click();
		Thread.sleep(3000);

		add.saveandcontinue().click();
		Thread.sleep(5000);

//Floor Area Details page
		add.floorarea().click();
		Thread.sleep(3000);

		add.floorarea1().click();
		Thread.sleep(3000);

		add.floorarea2().click();
		Thread.sleep(3000);

		add.floorarea3().click();
		Thread.sleep(3000);

		add.floorarea4().click();
		Thread.sleep(3000);

		add.floorarea5().sendKeys("1000");
		Thread.sleep(3000);

		add.floorarea6().click();
		Thread.sleep(3000);

		

		WebElement propertylist2 = add.propertyList();
		actions.moveToElement(propertylist2).perform();
		System.out.println("Done Mouse hover on 'propertylist' from Menu");
		
		
		WebElement Searchproperty1 = add.SearchProperty();
		actions.moveToElement(Searchproperty1).perform();
		System.out.println("Done Mouse hover on 'Searchproperty' from Menu");
		Searchproperty1.click();
		Thread.sleep(10000);

		add.Filter().click();
		Thread.sleep(8000);

		add.newproperty().sendKeys("testdemo5");
		Thread.sleep(3000);
		
		add.search().click();
		Thread.sleep(8000);

		Assert.assertEquals(add.property().getText(), "testdemo5");
		

		//Guidance
		
		add.Guidance().click();
		Thread.sleep(8000);

		add.Edit().click();
		Thread.sleep(3000);

		add.Choosefile().sendKeys("C://Users//Harshitha TN//Downloads//351445.png");
		Thread.sleep(3000);

		add.upload().click();
		Thread.sleep(8000);
		
        
		add.Delete().click();
		Thread.sleep(8000);

		add.Confirm().click();
		Thread.sleep(8000);


		add.update().click();
		Thread.sleep(8000);
		
		WebElement propertylist1 = add.propertyList();
		actions.moveToElement(propertylist1).perform();
		System.out.println("Done Mouse hover on 'propertylist' from Menu");
		

		WebElement Searchproperty = add.SearchProperty();
		actions.moveToElement(Searchproperty).perform();
		System.out.println("Done Mouse hover on 'Searchproperty' from Menu");
		Searchproperty.click();
		Thread.sleep(10000);

		add.sort().click();
		
		List<WebElement> originalList = add.list();
		List<String> originalTextList = originalList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalTextList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalTextList.equals(sortedList));
		
		Thread.sleep(5000);

	

		
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

