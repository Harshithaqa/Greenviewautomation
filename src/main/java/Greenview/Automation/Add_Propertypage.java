package Greenview.Automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Propertypage {

	WebDriver driver;
	
	public Add_Propertypage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/span[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement propertyList;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement SearchProperty;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/span[1]")
	WebElement sort;
	
	@FindBy(xpath="//tbody//tr//td[2]")
	List<WebElement> list;
	
	
	
	@FindBy(xpath="/html/body/div[1]/span[1]/div/div/header/div[2]/div/div/ul/li[1]/div/ul/li[3]/a")
	WebElement Addnewproperty;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div/a/div/b")
	WebElement propertytype;
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]")
	WebElement propertytype1;
	
	@FindBy(xpath="//input[@id='textfield']")
	WebElement propertyname;
	
	@FindBy(xpath="//textarea[@id='textfield5']")
	WebElement address;

	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/span[1]")
	WebElement Country;

	@FindBy(xpath="//li[contains(text(),'United States')]")
	WebElement USA;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/a[1]/span[1]")
	WebElement State;
	
	@FindBy(xpath="//li[contains(text(),'Alabama')]")
	WebElement State1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[4]/input[1]")
	WebElement City;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[5]/input[1]")
	WebElement Zipcode;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/div[1]/a[1]")
	WebElement Currency;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/div[1]/a[1]/span[1]")
	WebElement value;
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/a[1]/span[1]")
	WebElement parentbrandcompany;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement parentbrandcompany1;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div/div/div[2]/form/div[3]/div/div[3]/div/span/a")
	WebElement Save;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div[1]/div/div[2]/div[4]/div[1]/div[1]/span/a/i")
	WebElement contact;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div/div/a/div/b")
	WebElement contact1;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div/div/div/ul/li[2]")
	WebElement contact2;
	
	@FindBy(xpath="//*[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='textfield4']")
	WebElement phonenumber;
	
	@FindBy(xpath="//*[@id='job_title']")
	WebElement jobtitle;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[5]/div[2]/div/label/span")
	WebElement Defaultcontact;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[7]/input")
	WebElement save;
	
	@FindBy(xpath="/html/body/div[1]/span[2]/div[2]/div/div[1]/div/div[2]/div[4]/div[2]/div/span/a")
	WebElement continuebutton;
	
	@FindBy(xpath="//*[@id='total_guestrooms']")
	WebElement guestroom;
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	WebElement radio;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/a[1]")
	WebElement save1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/p[1]/a[1]")
	WebElement element1;
	@FindBy(xpath="//tr[2]//td[5]//input[1]")
	WebElement element2;
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/a[1]/span[1]")
	WebElement element3;
	@FindBy(xpath="//li[contains(text(),'Kilowatt-Hours')]")
	WebElement element4;
	
	@FindBy(xpath="//input[@id='submeter130']")
	WebElement subment130;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[8]/i[1]")
	WebElement subdetails;
	@FindBy(xpath="//input[contains(@placeholder,'Sub-meter Name/ID')]")
	WebElement subdetails1;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	WebElement subdetails2;
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/a[1]")
	WebElement saveandcontinue;
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span[1]/a[1]/i[1]")
	WebElement floorarea;
	@FindBy(xpath="//input[contains(@placeholder,'Select year')]")
	WebElement floorarea1;
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[1]/div/div/table/tbody/tr[1]/td[4]/button/span")
	WebElement floorarea2;
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[2]/div/a/div/b")
	WebElement floorarea3;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[2]/div[2]/div/div/ul/li[2]")
	WebElement floorarea4;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[3]/div[1]/input")
	WebElement floorarea5;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/input[1]")
	WebElement floorarea6;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/span[1]/a[1]")
	WebElement continue1;
	
	/*@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/span[1]/a[1]")
	WebElement certification;
	
	@FindBy(xpath="//span[contains(text(),'Select certification company')]")
	WebElement certification1;
	
	@FindBy(xpath="//li[contains(text(),'ASEAN Green Hotel Standard')]")
	WebElement certification2;
	
	@FindBy(xpath="//span[contains(text(),'Select status')]")
	WebElement certification3;
	@FindBy(xpath="//li[contains(text(),'ASEAN Green Hotel Award')]")
	WebElement certification4;
	
	@FindBy(xpath="//input[@placeholder='Version']")
	WebElement certification5;
	@FindBy(xpath="//input[@id='from_date']")
	WebElement certification6;
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/button/span")
	WebElement certification7;
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[3]/div[2]/div/div/table/tbody/tr[5]/td[6]/button/span")
	WebElement certification8;
	@FindBy(xpath="/html/body/div[4]/div/div/div/form/div/div/div[6]/input")
	WebElement certification9;*/
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement Filter;
	
	@FindBy(xpath="//input[@id='textName']")
	WebElement newproperty;
	
	@FindBy(xpath="//button[1]")
	WebElement Search;
	
	@FindBy(xpath="//p[contains(text(),'test12')]")
	WebElement property;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/span[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]")
	WebElement Guidance;
	
	@FindBy(xpath="//tr[1]//td[6]//a[3]//span[1]//img[1]")
	WebElement Edit;
	
	@FindBy(xpath="//input[@placeholder='Upload Document']")
	WebElement Choosefile;
	
	@FindBy(xpath="//a[@class='upload_file']")
	WebElement upload;
	
	
	@FindBy(xpath="//button[@class='btn green_bg comment waves-effect waves-light ng-binding']")
	WebElement update;
	
	@FindBy(xpath="//span[@class='cross ng-isolate-scope']//img")
	WebElement Delete;
	
	@FindBy(xpath="//button[@class='btn green_bg waves-effect waves-light']")
	WebElement Confirm;
	
	
	
	
	public WebElement propertyList()
	{
		return  propertyList;
	}
	
	public WebElement SearchProperty()
	{
		return  SearchProperty;
	}

	public WebElement sort()
	{
		return  sort;
	}

	public List<WebElement> list()
	{
		return  list;
	}
	
	
	public WebElement Addnewproperty()
	{
		return  Addnewproperty;
	}

	public WebElement propertytype()
	{
		return  propertytype;
	}
	public WebElement propertytype1()
	{
		return  propertytype1;
	}
	public WebElement propertyname()
	{
		return  propertyname;
	}

	public WebElement address()
	{
		return  address;
	}

	public WebElement Country()
	{
		return  Country;
	}
	public WebElement USA()
	{
		return  USA;
	}
	public WebElement State()
	{
		return  State;
	}
	public WebElement State1()
	{
		return  State1;
	}
	public WebElement City()
	{
		return  City;
	}
	public WebElement Zipcode()
	{
		return  Zipcode;
	}
	public WebElement parentbrandcompany()
	{
		return  parentbrandcompany;
	}
	
	public WebElement parentbrandcompany1()
	{
		return  parentbrandcompany1;
	}
	public WebElement Save()
	{
		return  Save;
	}
	public WebElement contact()
	{
		return  contact;
	}
	public WebElement contact1()
	{
		return  contact1;
	}
	public WebElement contact2()
	{
		return  contact2;
	}
	public WebElement firstname()
	{
		return  firstname;
	}
	public WebElement lastname()
	{
		return  lastname;
	}
	public WebElement email()
	{
		return  email;
	}
	public WebElement phonenumber()
	{
		return  phonenumber;
	}
	public WebElement jobtitle()
	{
		return  jobtitle;
	}
	public WebElement Defaultcontact()
	{
		return  Defaultcontact;
	}
	public WebElement save()
	{
		return  save;
	}
	public WebElement continuebutton()
	{
		return  continuebutton;
	}
	public WebElement guestroom()
	{
		return  guestroom;
	}
	public WebElement radio()
	{
		return  radio;
	}
	
	public WebElement save1()
	{
		return  save1;
	}
	public WebElement element1()
	{
		return  element1;
	}
	public WebElement element2()
	{
		return  element2;
	}
	public WebElement element3()
	{
		return  element3;
	}
	public WebElement element4()
	{
		return  element4;
	}
	public WebElement subment130()
	{
		return  subment130;
	}
	public WebElement subdetails()
	{
		return  subdetails;
	}
	public WebElement subdetails1()
	{
		return  subdetails1;
	}
	public WebElement subdetails2()
	{
		return  subdetails2;
	}
	public WebElement saveandcontinue()
	{
		return  saveandcontinue;
	}
	public WebElement floorarea()
	{
		return  floorarea;
	}
	
	//
	
	public WebElement floorarea1()
	{
		return  floorarea1;
	}

	public WebElement floorarea2()
	{
		return  floorarea2;
	}

	public WebElement floorarea3()
	{
		return  floorarea3;
	}

	public WebElement floorarea4()
	{
		return  floorarea4;
	}

	public WebElement floorarea5()
	{
		return  floorarea5;
	}
	public WebElement floorarea6()
	{
		return  floorarea6;
	}
	public WebElement continue1()
	{
		return  continue1;
	}
	public WebElement Filter()
	{
		return  Filter;
	}
	public WebElement newproperty()
	{
		return  newproperty;
	}
	public WebElement search()
	{
		return  Search;
	}
	public WebElement property()
	{
		return  property;
	}
	
	
	

	
	public WebElement Guidance()
	{
		return  Guidance;
	}
	public WebElement Edit()
	{
		return  Edit;
	}
	public WebElement Choosefile()
	{
		return  Choosefile;
	}
	public WebElement upload()
	{
		return  upload;
	}
	public WebElement update()
	{
		return  update;
	}
	
	public WebElement Delete()
	{
		return  Delete;
	}
	public WebElement Confirm()
	{
		return  Confirm;
	}
	
	public WebElement Currency()
	{
		return  Currency;
	}
	public WebElement value()
	{
		return  value;
	}
	
}

