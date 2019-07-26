package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("C:\\Users\\ajain388\\Desktop\\Html prog\\page1.html");
		d.findElement(By.id("t1")).sendKeys("Ashish");
		//d.switchTo().frame(0);
		d.switchTo().frame("f1");	
		d.findElement(By.id("t2")).sendKeys("Jain");
		
	}

}
