package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
	WebDriver flipkart= new ChromeDriver();
	flipkart.get("https://www.flipkart.com");
	flipkart.findElement(By.xpath("//button[contains(@class,'_2AkmmA _1LctnI _7UHT_c')]")).click();
	String sg=flipkart.findElement(By.xpath("//span[@class='ZAtlA-']")).getText();
	System.out.println(sg);
	

	}

}
