package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class online_capatches {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver capt=new ChromeDriver();
	capt.get("https://retail.onlinesbi.com/retail/login.htm");
	capt.findElement(By.xpath("//div//a[contains(text(),'CONTINUE TO LOGIN')]")).click();
	String Textcap=capt.findElement(By.xpath("//*[@id='refreshImgCaptcha']")).getText();
	System.out.println(Textcap);
	
	
	}

}
