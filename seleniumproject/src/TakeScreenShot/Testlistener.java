package TakeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Testlistener {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	EventFiringWebDriver d= new EventFiringWebDriver(driver);
	Weblistener listner=new Weblistener();
	d.register(listner);
	d.navigate().to("https://www.google.com");
	d.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
	d.navigate().back();
	d.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
	d.navigate().back();
	d.navigate().forward();
	}

}
