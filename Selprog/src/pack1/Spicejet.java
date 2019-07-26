package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.spicejet.com/");
		WebElement l = d.findElement(By.xpath("(//a[text()='Login / Signup'])[1]"));
		WebElement l2 = d.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		WebElement l1 = d.findElement(By.xpath("(//a[text()='Member Login'])[2]"));
		Actions ac= new Actions(d);
		ac.moveToElement(l).perform();
		Thread.sleep(2000);
		
		ac.moveToElement(l2).build().perform();
		System.out.println("dfsdf");
		Thread.sleep(2000);
		ac.moveToElement(l1).click().build().perform();
		
		System.out.println("adad");
		//Thread.sleep(3000);

	//WebElement l1 = d.findElement(By.xpath("(//a[text()='Member Login'])[2]"));
//		System.out.println(l1.isEnabled());
		//ac.moveToElement(l1).click().perform();;
//		//ac.clic();
		//Thread.sleep(1000);
//	ac.moveToElement(target)
//		l1.click();
//		d.navigate().back();
//		d.findElement(By.xpath("(//label[text()='Round Trip'])[1]")).click();
//		//d.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();
//		//d.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]")).click();
//		
//		Select s= new Select(d.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//		System.out.println("sdfsd");
//		s.selectByValue("USD");
//		System.out.println("dfsdf");
//		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		d.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]")).click();
//		d.findElement(By.xpath("(//a[text()=' Jabalpur (JLR)'])[2]")).click();
//		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a")).click();
			}

}
