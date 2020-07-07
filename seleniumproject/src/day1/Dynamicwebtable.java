package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtable {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.crmpro.com");
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("sameer405");
	driver.findElement(By.name("password")).sendKeys("Sameer@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().frame("mainpanel");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	System.out.println(driver.findElements(By.tagName("frame")));
	
	//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
	//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
	//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
	//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a
	//Method -1
	//String Before_xpath ="//*[@id='vContactsForm']/table/tbody/tr[";
	//String After_xpath="]/td[2]/a";
	//for (int i=4;i<=7; i++) {
		//String name=driver.findElement(By.xpath(Before_xpath +i+ After_xpath)).getText();
		//System.out.println(name);
	driver.findElement(By.xpath("//a[contains(text(),'ameena shaik')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'naziya mulla')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//a[contains(text(),'Timeline')]")).click();
	}
	
	
	
	}


