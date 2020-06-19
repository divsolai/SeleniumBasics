package selenium.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch URL "http://leaftaps.com/opentaps/control/login"
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
		
		//Click on Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		//Enter the Company name that you have given in CreateLead assignment
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TCS");
		
		//Click on Find Leads using xpath Locator and click on the first result
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement link = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		link.click();
		//Click on the edit Button
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		// Get the Text of Company Name and Print
		System.out.println(driver.findElementByXPath("(//input[@name='companyName'])[2]").getText());
		
		//Update the Company name with new value
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("CTS");
		
		// Click the Update button and verify the updated name.
	driver.findElementByClassName("smallSubmit").click();
	System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
	
	
	driver.close();
		
	}

}
