package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver google=new ChromeDriver();
		google.get("https://www.facebook.com");
		File hai=((TakesScreenshot)google).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(hai, new File("/Users/sam/eclipse-workspace/seleniumproject/google.png"));

		
	}

}
