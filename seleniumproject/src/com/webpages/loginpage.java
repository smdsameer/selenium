package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  loginpage {
	
	WebDriver driver;
    By userid=By.id("username");
	By pass= By.name("kerio_password");
    By logbtn=By.xpath("//input[@type='submit']");
	By Sentmsg=By.xpath("//div[@id='ext-gen1332']");
	
	public loginpage(WebDriver driver) {
	
		this.driver=driver;
	}
	public void userinput() {
		driver.findElement(userid).sendKeys("sameer");
	}
		public void pswrd() {
			driver.findElement(pass).sendKeys("SamNtp876@");
		}
		
		public void click() {
			driver.findElement(logbtn).click();
		}
			public void sent() {
				driver.findElement(Sentmsg).click();
			}
		}