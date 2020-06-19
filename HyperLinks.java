package selenium.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//Go to Home Page
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		String curURL = driver.getCurrentUrl();
		String home ="http://leafground.com/home.html";
		if(curURL.equals(home))
				{
			System.out.println("The home page navigation is verified");
				}
		else
		{
			System.out.println("It failed");
		}
		driver.findElementByXPath("//img[@alt='Link']").click();
		
		//Find where am supposed to go without clicking me?

	String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
	System.out.println(attribute);
	
	//Verify am I broken?
	String broken = driver.findElementByXPath("//a[text()='Verify am I broken?']").getAttribute("href");
	String errorURL= "http://leafground.com/pages/error.html";
	if(broken.equals(errorURL))
	{
		System.out.println("The page is broken");
	}
	else
	{
		System.out.println("The page is not broken");
	}
	
	
	//	Go to Home Page (Interact with same link name)
	
	driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
	String curURL1 = driver.getCurrentUrl();
	String home1 ="http://leafground.com/home.html";
	if(curURL1.equals(home1))
			{
		System.out.println("The home page navigation is verified");
			}
	else
	{
		System.out.println("It failed");
	}
	driver.findElementByXPath("//img[@alt='Link']").click();
	
	

	//How many links are available in this page?

	String linkingroup = driver.findElementByXPath("//a[text()='How many links are available in this page?']").getAttribute("href");
	System.out.println(linkingroup);
	List<WebElement> countlinks= driver.findElementsByTagName("a");
	System.out.print("The number of links in the page is " + countlinks.size());
	
	
	}


}
