package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		
		File fsrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fsrc, new File("G:\\Screenshot\\facebook.jpg"));
		
		
		try {
			driver.findElement(By.name("email"));
		}catch(Throwable t) {
			FileUtils.copyFile(fsrc, new File("G:\\Screenshot\\errorrfacebook.jpg"));	
		}
	}
	
	
	}


