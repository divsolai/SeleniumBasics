package selenium.assignments;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		//Click on Email and Enter the Email that you have given in CreateLead assignment
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyz@tcs.com");
		
		//Click on Find Leads using xpath Locator 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Get the first result LeadId in a variable and click on it
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement link = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(link.getText());
		String temp = link.getText();
		link.click();
		
		//Click on the Delete Button
		driver.findElementByLinkText("Delete").click();
		
		//Click on Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		//Enter the Deleted LeadID and click Find Leads
		driver.findElementByName("id").sendKeys(temp);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Verify the "No records to display" message.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement msg = driver.findElementByXPath("//div[text()='No records to display']");
		System.out.println(msg.getText());
		String text1= msg.getText();
		String requiredtext= "No records to display";
		if(text1.equals(requiredtext))
			
		{
			System.out.println("The text matches");
		}
		else
		{
			System.out.println("The text does not match");
		}
		
		driver.close();
	
	}
	

}
