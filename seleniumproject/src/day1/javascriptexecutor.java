package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://mail2.groupnish.com");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sameer");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SamNtp456@");
	    //driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
	    flash(loginbtn,driver);
	}
	public static void flash(WebElement element,WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	String bgcolor=element.getCssValue("BackgroundColor");
	for (int i=0;i<100;i++) {
		Changecolor("rgb(0,200,0)",element,driver);
		Changecolor(bgcolor,element,driver);
	}
}
	public static void Changecolor(String color,WebElement element, WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("argument[0].style.BackgroundColor="+color+"", element);
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
}
}}