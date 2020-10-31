package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
Properties prop=new Properties();
//System.getProperty("user.dir")
	//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	FileInputStream fis = new FileInputStream("D:\\AutomationSelenium\\src\\main\\java\\resources\\data.properties");

	prop.load(fis);
	
//String browsername = System.getProperty("browser");

	String browsername = prop.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src\\main\\java\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D://SeleniumSoftware//chromedriver.exe");

		 driver = new ChromeDriver();
		}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D://SeleniumSoftware//geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	
	}

public String getScreenShotPath(String testmethodName, WebDriver driver) throws IOException
{
TakesScreenshot ts=	(TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);

String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testmethodName+".png";

FileUtils.copyFile(source,new File(destinationFile));
 
String newImageString = "http://localhost:8080/job/CIP/ws/reports/" + testmethodName + "_" +".png";
return destinationFile;

}


}
