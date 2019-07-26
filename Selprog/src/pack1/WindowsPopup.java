package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopup {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}  

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.seleniumhq.org/");
		d.manage().window().maximize();
	}

}
