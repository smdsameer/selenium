package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver google=new ChromeDriver();
	google.get("https://www.google.com");
	google.manage().window().maximize();
	google.manage().deleteAllCookies();
	
	google.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	google.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	google.navigate().to("https://www.flipkart.com"); //to launch the external url
	google.navigate().back();
	google.navigate().forward();
	
	

	}

}
