package pack1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintab {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}  
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver i=new ChromeDriver();
		i.get("http://de021dxr.vfeds.com:8002/prweb/PRServlet/oO9O9iMscyJc_fy6LnBDXO9xEtRpDxfL3At36r8Aw8k%5B*/!STANDARD?pzPostData=-1485879355");
		i.manage().window().maximize();
		Thread.sleep(1000);
	   i.switchTo().activeElement().sendKeys("otto.orderentry",Keys.TAB);
	   i.switchTo().activeElement().sendKeys("Rules@123", Keys.ENTER);
	  
	   

	

	}

}
