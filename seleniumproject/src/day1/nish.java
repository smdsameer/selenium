package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nish {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver Nish=new ChromeDriver();
	Nish.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&next=https%3A%2F%2Fwww.facebook.com%2F&lwv=120&lwc=1348028");
	Nish.findElement(By.name("login")).click();
	Alert nish=Nish.switchTo().alert();
	System.out.println(nish.getText());
	Nish.get("https://www.myntra.com");

`
	}

}
