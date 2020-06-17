package selenium.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElementById("username").sendKeys("Demosalesmanager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Laya");
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Solai");
WebElement drop1 = driver.findElementById("createLeadForm_dataSourceId");
Select opt1 =new Select (drop1);
opt1.selectByValue("LEAD_EMPLOYEE");
driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("100000");
WebElement drop2 = driver.findElementById("createLeadForm_industryEnumId");
Select opt2= new Select(drop2);
opt2.selectByValue("IND_SOFTWARE");
WebElement drop3 = driver.findElementById("createLeadForm_ownershipEnumId");
Select opt3 =new Select(drop3);
opt3.selectByVisibleText("S-Corporation");
driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
WebElement drop4 = driver.findElementById("createLeadForm_marketingCampaignId");
Select opt4 = new Select( drop4);
opt4.selectByIndex(6);
WebElement drop5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
Select opt5 = new Select(drop5);
opt5.selectByValue("TX");
driver.findElementById("createLeadForm_primaryEmail").sendKeys("xyz@tcs.com");
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876543265");

driver.findElementByXPath("//input[@class='smallSubmit']").click();
driver.close();
	}

}
