package Greenview.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchUserpage {

	WebDriver driver;
	
	public SearchUserpage(WebDriver driver) {
		
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
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div[1]/div/div[1]/table/tbody/tr/td[2]/span/a/i")
	WebElement element1;
	
	@FindBy(xpath="/html/body/div[1]/span[1]/div/div/header/div[2]/div/div/ul/li[4]/a/span[2]/i")
	WebElement track;
	
	@FindBy(xpath="/html/body/div[1]/span[1]/div/div/header/div[2]/div/div/ul/li[4]/div/ul/li[5]/span/a")
	WebElement Environmentaldata;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div/div/div/div[1]/div[1]/span/a/i")
	WebElement Add;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[1]/div/a/div/b")
	WebElement Category;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[1]/div/div/ul/li[2]")
	WebElement Energy;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[2]/div/a/div/b")
	WebElement Utility;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[2]/div/div/ul/li[2]")
	WebElement utilityname;
	
	@FindBy(xpath="//*[@id='from_date']")
	WebElement FromDate;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[4]/div[1]/div/div/table/tbody/tr[1]/td[1]/button/span")
	WebElement Date1;
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[4]/div[1]/div/div/table/tbody/tr[1]/td[4]/button/span")
	WebElement Date2;
	
	@FindBy(xpath="//*[@id='to_date']")
	WebElement ToDate;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[4]/div[2]/div/div/table/tbody/tr[1]/td[1]/button/span")
	WebElement Date3;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[4]/div[2]/div/div/table/tbody/tr[5]/td[6]/button/span")
	WebElement Date4;
	
	@FindBy(xpath="//*[@id='usage_val']")
	WebElement Usage;
	
	
	@FindBy(xpath="//*[@id='trigger_click']")
	WebElement Save;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div/div/ul/li[2]/span/a")
	WebElement BulkUpload;
	
	

	@FindBy(xpath="//div[@class='download_file custom_tooltip']//img[@class='ng-scope']")
	WebElement upload;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div/bulk-file-upload/div/div[1]/div/div[2]/button")
	WebElement button;
	

	
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
	

	public WebElement element1()
	{
		return  element1;
	}
	public WebElement track()
	{
		return  track;
	}
	public WebElement Environmentaldata()
	{
		return  Environmentaldata;
	}
	public WebElement Add()
	{
		return  Add;
	}
	public WebElement Category()
	{
		return  Category;
	}

	public WebElement Energy()
	{
		return  Energy;
	}
	public WebElement Utility()
	{
		return  Utility;
	}
	public WebElement utilityname()
	{
		return  utilityname;
	}
	public WebElement FromDate()
	{
		return  FromDate;
	}
	public WebElement Date1()
	{
		return  Date1;
	}

	public WebElement Date2()
	{
		return  Date2;
	}
	public WebElement ToDate()
	{
		return  ToDate;
	}
	public WebElement Date3()
	{
		return  Date3;
	}
	public WebElement Date4()
	{
		return  Date4;
	}
	public WebElement Usage()
	{
		return  Usage;
	}
	public WebElement Save()
	{
		return  Save;
	}

	public WebElement BulkUpload()
	{
		return  BulkUpload;
	}
	public WebElement upload()
	{
		return  upload;
	}
	
	public WebElement button()
	{
		return  button;
	}
	
	
}
	