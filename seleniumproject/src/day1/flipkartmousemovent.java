package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartmousemovent {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	Actions fk=new Actions(driver);
	fk.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
	Thread.sleep(2000);
	fk.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Samsung')]"))).click().build().perform();
	fk.click(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[6]/div/div[4]/div[1]/div[2]/a/div[1]/div"))).sendKeys(Keys.DOWN);
	}

}
