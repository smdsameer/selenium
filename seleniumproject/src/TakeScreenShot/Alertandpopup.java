package TakeScreenShot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertandpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		WebDriver fb=new ChromeDriver();
		fb.manage().deleteAllCookies();
		fb.manage().window().maximize();
		fb.get("https://www.fb.com/");
		
		fb.findElement(By.id("email")).sendKeys("7799807713");
		fb.findElement(By.id("pass")).sendKeys("najiaji");
		fb.findElement(By.xpath("//input[@value='Log In']")).click();
		Alert obj= fb.switchTo().alert();
		String text=obj.getText();
		System.out.println((text));
		fb.quit();
	}

}
