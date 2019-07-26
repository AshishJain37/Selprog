package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitim {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver e = new ChromeDriver();
		e.manage().window().maximize();
		e.get("https://online.actitime.com/fsd1/login.do");
        e.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(1000);
        e.findElement(By.id("loginButton")).click();
        Thread.sleep(3000);

        e.switchTo().defaultContent();
        Thread.sleep(1000);
        e.findElement(By.id("username")).sendKeys("admin");
        e.findElement(By.name("pwd")).sendKeys("manager");
        e.findElement(By.id("loginButton")).click();
        

	}

}
