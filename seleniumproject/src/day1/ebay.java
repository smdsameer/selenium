package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
WebDriver ebay=new ChromeDriver();
ebay.get("https://www.flipkart.com");
//ebay.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
//ebay.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("new mobiles");
//ebay.findElement(By.xpath("//button[@class='vh79eN']")).click();
//ebay.findElement(By.xpath("//input[contains(@class,'LM6RPg')]")).sendKeys("samsung");
//ebay.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
ebay.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

	}

}
