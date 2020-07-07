package TakeScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;


public class mouse_movement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		EventFiringWebDriver mouse=new EventFiringWebDriver(driver);
		Weblistener listener=new Weblistener();
		EventFiringMouse mose=new EventFiringMouse(driver,listener);
		driver.navigate().to("http://google.com");
		Locatable howerItems=(Locatable) driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]"));
		Coordinates Cour=howerItems.getCoordinates();
		try {
			mose.mouseMove(Cour);
		}catch(Exception e) {
			
		}
	
		
	}

}
