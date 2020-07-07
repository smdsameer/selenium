package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenuium1stcls {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");	
	WebDriver drive=new ChromeDriver();
	drive.get("https://youtube.com/");
	System.out.println(drive.getCurrentUrl());
	System.out.println(drive.getTitle());
	drive.close();

	}

}
