package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class mousemovementconcept {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ceoandhra.nic.in/ceoap_new/ceo/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//dynamic wait
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);// Page loading
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//Elements loading
	Actions action=new Actions(driver);
	//action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'About Us')]"))).build().perform();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[contains(text(),'Organization')]")).click();
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),' PDF Electoral Rolls')]"))).build().perform();
    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Council Constituency')]"))).build().perform();
    Thread.sleep(3000);
    action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Teachers')]"))).click().build().perform();
	
	}

}
