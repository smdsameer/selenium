package TakeScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class Weblistener extends AbstractWebDriverEventListener{

	public void afterClickOn(WebElement element,WebDriver driver) {
		System.out.println(" Clicked Performed");
		
	}
	
public void afterNavigateForward(WebDriver driver) {
	System.out.println("Forword is done");
}
	
	
	
}
