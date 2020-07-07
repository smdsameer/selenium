package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunitdriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
		WebDriver Html=new ChromeDriver();
	//WebDriver Html=new HtmlUnitDriver();
	System.out.println("Before Login  :"+Html.getTitle());
	Html.get("https://mail2.groupnish.com");
	Html.manage().window().maximize();
	Html.manage().deleteAllCookies();
	Html.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	Html.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Html.findElement(By.xpath("//input[@id='username']")).sendKeys("sameer");
	Html.findElement(By.xpath("//input[@id='password']")).sendKeys("SamNtp876@");
	Html.findElement(By.xpath("//input[@id='login-button']")).click();
	System.out.println("Afer Login  :"+Html.getTitle());
	
	}

}
