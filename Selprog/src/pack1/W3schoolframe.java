package pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolframe {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.w3schools.com/html/default.asp");
		d.findElement(By.xpath("//a[contains(text(), 'Try it Yourself' )]")).click();
		String parent = d.getWindowHandle();
		Thread.sleep(3000);
		
        
		Set<String> childs = d.getWindowHandles();
         for(String q: childs) {
        	 if(!q.equalsIgnoreCase(parent))
        		 d.switchTo().window(q);
         }

		//d.switchTo().defaultContent();
		d.switchTo().frame("iframeResult");
		String e = d.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(e);
		
		d.switchTo().defaultContent();
		String r = d.findElement(By.xpath("//div[@class='CodeMirror-code']/pre[1]/span/span")).getText();
		
		System.out.println(r);
		
		d.close();
		d.switchTo().window(parent);
		d.close();

	}

}
