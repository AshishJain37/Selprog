package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selct {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}  
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-form/");
         d.manage().window().maximize();
         Thread.sleep(3000);
         d.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Ashish");
         d.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Jain");
         d.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
         d.findElement(By.xpath("//*[@id=\"exp-1\"]")).click();
         d.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("Jan 10 2019");
         d.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
         d.findElement(By.xpath("//*[@id=\"tool-1\"]")).click();
         Select sc =new Select(d.findElement(By.xpath("//*[@id=\"continents\"]")));
         sc.selectByVisibleText("Africa");
         Select sc1 =new Select(d.findElement(By.xpath("//*[@id=\"selenium_commands\"]")));
         sc1.selectByVisibleText("Switch Commands");
         
	}

}
