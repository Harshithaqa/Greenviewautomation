package Greenview.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformanceReportpage {

	WebDriver driver;
	
	public PerformanceReportpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath="/html/body/div[1]/span[1]/div/div/header/div[2]/div/div/ul/li[2]/a/span[2]/i")
	WebElement UserManagement;
	
	
	@FindBy(xpath="/html/body/div[1]/span[1]/div/div/header/div[2]/div/div/ul/li[2]/div/ul/li[2]/a")
	WebElement searchuser;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div[1]/div/div[1]/div[1]/div/a")
	WebElement Filter;
	
	@FindBy(xpath="//input[@id='textfield']")
	WebElement Input;
	
	@FindBy(xpath="//*[@id='imageField']")
	WebElement Search;
	
	@FindBy(xpath="//tbody/tr[3]/td[2]/span[1]/a[1]/i[1]")
	WebElement Dashboard;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/span[2]/i[1]")
	WebElement Reports;
	
	@FindBy(xpath="/html/body/div[1]/span[1]/div/div/header/div[2]/div/div/ul/li[5]/div/ul[1]/li[6]/span/a")
	WebElement Performance;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[1]/div[1]/div/a/div/b")
	WebElement Category;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[1]/div[1]/div/div/ul/li[3]")
	WebElement Category1;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[1]/div[2]/div/a/div/b")
	WebElement Subtype;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[1]/div[2]/div/div/ul/li[4]")
	WebElement Subtype1;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[2]/div[1]/span[1]/label")
	WebElement Categorygrouping;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[2]/div[1]/div[2]/div[1]/div/a/div/b")
	WebElement Categorygrouping1;
	
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[9]")
	WebElement name;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[2]/div[2]/div/a/div/b")
	WebElement unit;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[2]/div[2]/div/div/ul/li[3]")
	WebElement unit1;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div[1]/div/div/div/div[1]/div[3]/div[1]/div/form/div[2]/div[4]/div/div/div[3]/table/tbody/tr/td/span[1]")
	WebElement Date;
	
	@FindBy(xpath="//*[@id='run_report_btn']")
	WebElement runreport;
	

	@FindBy(xpath="//a[contains(text(),'Download Report')]")
	WebElement Download;
	
	
	
	public WebElement UserManagement()
	{
		return  UserManagement;
	}

	public WebElement searchuser()
	{
		return  searchuser;
	}
	
	public WebElement Filter()
	{
		return  Filter;
	}
	public WebElement Input()
	{
		return  Input;
	}
	public WebElement Search()
	{
		return  Search;
	}
	
	public WebElement Dashboard()
	{
		return  Dashboard;
	}

	public WebElement Reports()
	{
		return  Reports;
	}
	public WebElement Performance()
	{
		return  Performance;
	}

	public WebElement Category()
	{
		return  Category;
	}
	public WebElement Category1()
	{
		return  Category1;
	}

	public WebElement Subtype()
	{
		return  Subtype;
	}
	public WebElement Subtype1()
	{
		return  Subtype1;
	}

	public WebElement Categorygrouping()
	{
		return  Categorygrouping;
	}
	public WebElement Categorygrouping1()
	{
		return  Categorygrouping1;
	}

	public WebElement name()
	{
		return  name;
	}
	
	public WebElement unit()
	{
		return  unit;
	}

	public WebElement unit1()
	{
		return  unit1;
	}
	public WebElement Date()
	{
		return  Date;
	}

	public WebElement runreport()
	{
		return  runreport;
	}
	public WebElement Download()
	{
		return  Download;
	}
	
}