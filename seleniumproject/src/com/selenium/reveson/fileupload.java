package com.selenium.reveson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		WebDriver fb=new ChromeDriver();
		fb.manage().deleteAllCookies();
		fb.manage().window().maximize();
		fb.get("https://gofile.io/uploadFiles");
	
		fb.findElement(By.xpath("//button[@id='btnChooseFiles']")).sendKeys("C:\\Users\\sam\\Desktop\\JAVA NOTES.docx");
		
		
		
		
		
		

	}

}
