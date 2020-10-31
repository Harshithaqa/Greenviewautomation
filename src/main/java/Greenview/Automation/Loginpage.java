package Greenview.Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement Login;
	
	@FindBy(xpath="//input[@id='usernameId']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='passwordId']")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/span/div[2]/div/div/div[3]/form/div[5]/button")
	WebElement Loginbutton;
	
	//By Login = By.xpath("/html[1]/body[1]/div[1]/span[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]");

	//By Username = By.xpath("//input[@id='usernameId']");
	//By Password = By.xpath("//input[@id='passwordId']");
	
	//By LoginButton = By.xpath("/html/body/div[1]/span/div[2]/div/div/div[3]/form/div[5]/button"); // Login button

	
	public WebElement LoginClick()
	{
		return Login;
	}
	
	public WebElement EmailID()
	{
		return  username;
	}
	
	public WebElement Password()
	{
		return  password;
	}
	
	public WebElement Login()
	{
		return  Loginbutton;
	}
	
	
	
	
	
	
}
