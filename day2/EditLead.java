package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Test Leaf");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Cid = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		//WebElement Company = driver.findElementByXPath("(//table[@class='x-grid3-row-table']//a)[1]");
		Cid.click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement Cname = driver.findElementByXPath("(//input[@name='companyName'])[2]");
		String text1 = Cname.getAttribute("value");
		System.out.println("Current Company name is: "+text1);
		Cname.clear();
		Cname.sendKeys("Photon");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		WebElement VCname = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String text2 = VCname.getText();
		System.out.println("Updated Company name is: "+text2);
		driver.close();

	}

}
