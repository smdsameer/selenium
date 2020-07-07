package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailattachingfile {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
WebDriver sam=new ChromeDriver();
sam.get("https://www.gmail.com");
sam.manage().window().maximize();
sam.findElement(By.xpath("//input[(@class='whsOnd zHQkBf')]")).sendKeys("sameer");
sam.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

sam.findElement(By.xpath("//input[@type='password']")).sendKeys("gani");
//sam.findElement(By.xpath("//span[contains(text(), 'Next')]")).click(); Thread.sleep(3000);
//sam.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
//sam.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();


	}

}
