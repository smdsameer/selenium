package com.selenium.reveson;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takingScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
		WebDriver tks=new ChromeDriver();
		tks.get("https://www.google.com");
		tks.manage().window().maximize();
		tks.manage().deleteAllCookies();
		tks.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		tks.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		File filescr=((TakesScreenshot)tks).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(filescr, new File("G:\\office\\gle.jpg"));

	}

}
