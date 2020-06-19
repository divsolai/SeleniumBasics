package selenium.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Launch URL "http://leaftaps.com/opentaps/control/login"	
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();

//Enter UserName and Password Using Id Locator
driver.findElementById("username").sendKeys("Demosalesmanager");
driver.findElementById("password").sendKeys("crmsfa");

//Click on Login Button using Class Locator
driver.findElementByClassName("decorativeSubmit").click();

//Click on CRM/SFA Link
driver.findElementByLinkText("CRM/SFA").click();

//Click on Leads Button
driver.findElementByLinkText("Leads").click();

//Click on Create Leads
driver.findElementByLinkText("Create Lead").click();

//Enter Company Name Field Using Xpath Locator
driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");

//Enter First Name Field Using Xpath Locator
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Laya");

// Enter Last Name Field Using Xpath Locator
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Solai");

// Select Source as Employee using SelectByValue
WebElement drop1 = driver.findElementById("createLeadForm_dataSourceId");
Select opt1 =new Select (drop1);
opt1.selectByValue("LEAD_EMPLOYEE");

//Enter value for AnnualRevenue Field using Xpath Locator
driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("100000");

// Select Industry as ComputerSoftware
WebElement drop2 = driver.findElementById("createLeadForm_industryEnumId");
Select opt2= new Select(drop2);
opt2.selectByValue("IND_SOFTWARE");

//Select OwnerShip as S-Corporation using SelectByVisibletext
WebElement drop3 = driver.findElementById("createLeadForm_ownershipEnumId");
Select opt3 =new Select(drop3);
opt3.selectByVisibleText("S-Corporation");

//Enter Description as "Selenium Automation Tester"
driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");

//Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
WebElement drop4 = driver.findElementById("createLeadForm_marketingCampaignId");
Select opt4 = new Select( drop4);
opt4.selectByIndex(6);

//Select State/Province as Texas using SelectByValue 
WebElement drop5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select opt5 = new Select(drop5);
opt5.selectByValue("TX");

//Enter E-Mail Address 
driver.findElementById("createLeadForm_primaryEmail").sendKeys("xyz@tcs.com");

//Enter Phone Number 
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876543265");

// Click Create Lead button using Xpath Locator
driver.findElementByXPath("//input[@class='smallSubmit']").click();
driver.close();
	}

}
