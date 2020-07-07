package day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pupupswindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		WebDriver r= new ChromeDriver();
		r.get("https://mail.rediff.com/cgi-bin/login.cgi");
		r.manage().window().maximize();
		r.findElement(By.name("proceed")).click();
		 
		Alert wit=r.switchTo().alert();
		System.out.println(wit.getText());
		wit.accept(); //click on ok button
		//wit.dismiss(); //click on cancel button
		//important topic 
		r.close();
	}

}
