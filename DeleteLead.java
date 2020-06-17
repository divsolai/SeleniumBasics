package selenium.assignments;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyz@tcs.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
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
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(temp);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
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
