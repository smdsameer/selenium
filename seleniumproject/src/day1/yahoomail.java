package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoomail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver yahoo=new ChromeDriver();
		yahoo.manage().window().maximize();
		yahoo.get("https://login.yahoo.com/account/create");

		WebElement bhai=yahoo.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));

		bhai.sendKeys("gani");
		bhai=yahoo.findElement(By.xpath("//button[@id='reg-submit-button']"));
		bhai.click();
		bhai=yahoo.findElement(By.xpath("//div[@id='reg-error-password']"));   
		System.out.println(bhai.getText());
		yahoo.quit();
		
}
	
	
	
	
}



