package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
	WebDriver Srnsht=new ChromeDriver();
	Srnsht.get("https://www.fb.com");
    File filescr=((TakesScreenshot)Srnsht).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(filescr, new File("G:\\office\\facebook.jpg"));
    
	}

}
