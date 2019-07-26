package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dispatcher_etop extends EtoploginIE{
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}  
	

	public void DP() throws InterruptedException {
	//WebDriver i=new ChromeDriver();
    i.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Dispatcher_etop d =new Dispatcher_etop();
		//i.get("http://de021dxr.vfeds.com:8002/prweb/PRServlet/oO9O9iMscyJc_fy6LnBDXO9xEtRpDxfL3At36r8Aw8k%5B*/!STANDARD?pzPostData=-1485879355");
		
		//i.manage().window().maximize();
		Thread.sleep(3000);
		i.findElement(By.xpath("//span[@class='loginButtonText']")).click();
		Thread.sleep(2000);
		i.findElement(By.id("txtUserID")).sendKeys("dieter.dispatcher");
		i.findElement(By.id("txtPassword")).sendKeys("Rules@123");
		i.findElement(By.className("loginButton")).click();	
		Thread.sleep(5000);
		i.switchTo().defaultContent();
		i.switchTo().frame("PegaGadget0Ifr");
		
		i.findElement(By.xpath("//td[text()='TP Planning']")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("//div[text()='Start Planning Process']")).click();
		Thread.sleep(2000);
		i.switchTo().defaultContent();
		i.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(2000);
		
		i.findElement(By.xpath("(//*[@id=\"pui_filter\"])[3]")).click();
		Thread.sleep(4000);
		i.findElement(By.id("pySearchText")).sendKeys(tpid);
		Thread.sleep(2000);

		i.findElement(By.xpath("//*[@id=\"pob0\"]/div/button[1]")).click();
		Thread.sleep(4000);
		i.findElement(By.xpath("//input[@id='pyRowSelected1']")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("(//*[@id=\"submitButton\"])[2]")).click();
		Thread.sleep(3000);
		i.findElement(By.xpath("//*[@id=\"AutoDispatchFlag1\"]")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
		Thread.sleep(3000);
		WebElement r8=i.findElement(By.xpath("//select[@id='SelectedImplementer']"));
		Selct(r8, "ingo.implementer", i);
		Thread.sleep(2000);
		i.findElement(By.xpath("(//button[text()='  Assign '])[1]")).click();
	}

}
