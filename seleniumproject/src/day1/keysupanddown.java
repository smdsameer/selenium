package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysupanddown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver fb=new ChromeDriver();
	fb.get("https://www.facebook.com/legal/terms/update");
	/*Thread.sleep(3000);
	fb.findElement(By.xpath("//*[@id='terms-link']")).click();*/
	/*Thread.sleep(10000);*/
	fb.findElement(By.id("email")).sendKeys("778890991");
	fb.findElement(By.id("email")).sendKeys(Keys.PAGE_DOWN);
	Thread.sleep(3000);
	fb.findElement(By.id("email")).sendKeys(Keys.PAGE_UP);
	fb.findElement(By.id("email")).sendKeys(Keys.BACK_SPACE);
	
	}

}
