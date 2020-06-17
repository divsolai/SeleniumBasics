package selenium.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TCS");;
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement link = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		link.click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		System.out.println(driver.findElementByXPath("(//input[@name='companyName'])[2]").getText());
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("CTS");
	driver.findElementByClassName("smallSubmit").click();
	System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
	driver.close();
		
	}

}
