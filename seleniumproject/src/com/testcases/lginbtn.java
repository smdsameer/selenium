package com.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webpages.loginpage;
public class lginbtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\java webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail2.groupnish.com/webmail/login2/");
		
        loginpage login=new loginpage(driver);
               login.userinput();
               login.pswrd();
               login.click();
               Thread.sleep(2000);
               login.sent();
	}

}
