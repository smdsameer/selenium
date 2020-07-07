package com.selenium.reveson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		WebDriver fk=new ChromeDriver();
		fk.get("https://www.flipkart.com");
		
		fk.manage().deleteAllCookies();
		fk.manage().window().maximize();
		
		fk.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		fk.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		fk.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//span[contains(text(),'Electronics')]
		Actions fks=new Actions(fk);
		fks.moveToElement(fk.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
		fks.moveToElement(fk.findElement(By.xpath("//a[contains(text(),'OPPO')]"))).click().build().perform();
	}

}
