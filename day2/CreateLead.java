package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//input[contains(@id,'companyName')]").sendKeys("Photon");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Muruganandam");
		driver.findElementByXPath("(//input[contains(@id,'createLeadForm')])[4]").sendKeys("Velu");
		
		WebElement Sel = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(Sel);
		dd.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("100000");
		
		WebElement Sel2 = driver.findElementByName("industryEnumId");
		Select dd1 = new Select(Sel2);
		dd1.selectByIndex(2);
		
		WebElement Sel3 = driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(Sel3);
		dd2.selectByVisibleText("S-Corporation");
		
		driver.findElementById("createLeadForm_description").sendKeys("Selenium Automation Tester");
		
		WebElement Sel4 = driver.findElementByName("marketingCampaignId");
		Select dd3 = new Select(Sel4);
		dd3.selectByIndex(6);
		
		WebElement Sel5 = driver.findElementByName("generalStateProvinceGeoId");
		Select dd4 = new Select(Sel5);
		dd4.selectByValue("TX");
		
		driver.findElementByXPath("(//input[@name='primaryEmail'])[4]").sendKeys("muruga.velu@gmail.com");
		driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("8334957900");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		driver.close();
	}

}
