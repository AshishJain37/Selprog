package pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://www.naukri.com");
		d.manage().window().maximize();
		String gwh=d.getWindowHandle();
		System.out.println("gwh= "+ gwh);
		Set<String> gwhs=d.getWindowHandles();
		String f1=d.getTitle();
		System.out.println("Parent titile: "+ f1);
		gwhs.remove(gwh);
		for(String f:gwhs) {
		
			System.out.println(f);
			System.out.println();
			
				
		    d.switchTo().window(f);
			d.manage().window().maximize();// to maximize child windows
			String g=d.getTitle();
			System.out.println(g);
			d.close();
			
		
		}
		
		
		

	}

}
