package TakeScreenShot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\eclipse\\selenium webdriver\\chromedriver.exe");
		WebDriver gmail=new ChromeDriver();
		gmail.manage().deleteAllCookies();
		gmail.manage().window().maximize();
		gmail.get("https://www.fb.com/");
		gmail.findElement(By.id("email")).sendKeys("7799807713");
		gmail.findElement(By.id("pass")).sendKeys("Naziya");
		
		gmail.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		gmail.findElement(By.xpath("//div[@class='kr520xx4 pmk7jnqg n7fi1qx3']")).click();
		
		/*Thread.sleep(2000);
		gmail.findElement(By.xpath("//*[@id=\"jsc_c_3g\"]/div/div/span")).click();*/
		/*gmail.quit();*/
		

	}

}
