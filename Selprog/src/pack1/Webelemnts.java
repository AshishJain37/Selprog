package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelemnts {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}  

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("google");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'google')])[1]")).click();
		//driver.findElement(By.xpath(("//input[@value='Google Search' ])[1]))"))).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@id=\"menu_download\"]/a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[text()='Ruby']/../td[4]")).click();
		//List<WebElement> s=driver.findElements(By.xpath("//a"));
		//System.out.println(s.size());
		//for(WebElement link: s ) {
			//System.out.println(link.getText());
		
		

	}

}
