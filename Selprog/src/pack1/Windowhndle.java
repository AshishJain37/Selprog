package pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhndle {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
		String p = d.getWindowHandle();
		
		//Login
		System.out.println(d.switchTo().window(p).getTitle());
		Set<String> p1 = d.getWindowHandles();
		
		d.switchTo().window(p);
		Thread.sleep(3000);
		//d.findElement(By.xpath("//span[text()='Later']")).click();
		//d.switchTo().frame(0);
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
		d.findElement(By.id("eLoginNew")).sendKeys("ashish");
		
		// switching btw windows
//		for(String p2:p1) {
//			if(d.switchTo().window(p2).getTitle().contains("Genpact")) {
//				d.switchTo().window(p2);
//				d.manage().window().maximize();
//			d.switchTo().window(p2);
//			d.manage().window().maximize();
			
			}
		}

	


