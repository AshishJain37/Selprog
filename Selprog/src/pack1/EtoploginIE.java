package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class EtoploginIE {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}  
	 public static String tpid;
	 
	 public static WebDriver i = null;
	 public static void DBC(WebElement dc,WebDriver p){
		 Actions action = new Actions(p);
		 WebElement elementLocator = dc;
		 action.doubleClick(elementLocator).perform();

	}
	public static void Selct(WebElement dc,String val, WebDriver t) {
		//WebElement w=t.findElement(By.xpath(dc));
		Select s = new Select(dc);
		s.selectByValue(val);
			
	}
	
	

	public void OE() throws InterruptedException {
		 i=new ChromeDriver();
		i.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//EtoploginIE obj =new EtoploginIE();
		i.get("http://de021dxr.vfeds.com:8002/prweb/PRServlet/oO9O9iMscyJc_fy6LnBDXO9xEtRpDxfL3At36r8Aw8k%5B*/!STANDARD?pzPostData=-1485879355");
		i.manage().window().maximize();
		Thread.sleep(3000);
		i.findElement(By.id("txtUserID")).sendKeys("otto.orderentry");
		i.findElement(By.id("txtPassword")).sendKeys("Rules@123");
		i.findElement(By.className("loginButton")).click();
		Thread.sleep(5000);
		
        //--------------Page-1-----------------
		i.switchTo().frame("PegaGadget0Ifr");
		Thread.sleep(2000);
		i.findElement(By.xpath("//div[text()='Manuelle Erfassung']")).click();
		
	     //--------------Page-2-----------------
		i.switchTo().defaultContent();
		i.switchTo().frame("PegaGadget1Ifr");
		System.out.println("2");
		Thread.sleep(2000);
		i.findElement(By.xpath("//input[@id=\"OrderID\"]")).sendKeys("PDO-0000002");
		System.out.println("3");
		i.findElement(By.className("pzbtn-mid")).click();
		i.switchTo().defaultContent();
		i.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(2000);
			
		i.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		Thread.sleep(1000);
		i.findElement(By.xpath("//button[@id=\"submitButton\"]")).click();
		Thread.sleep(2000);

	     //--------------Page-3-----------------
		i.switchTo().defaultContent();
		i.switchTo().frame( "PegaGadget1Ifr");
		Thread.sleep(4000);
		WebElement w= i.findElement(By.id("TP"));
		Selct(w, "BIC",i);
		
		 i.switchTo().defaultContent();
		 i.switchTo().frame( "PegaGadget1Ifr");
		 Thread.sleep(2000);
		 WebElement w1= i.findElement(By.id("TPT"));
		Selct(w1,"N-BIC",i);
		 Thread.sleep(2000);
		 i.findElement(By.xpath("//button[@id='submitButton']")).click();
	
		
	     //--------------Page-4- Kerniinformation Tab-----------------
		Thread.sleep(5000);
		 i.switchTo().defaultContent();
		 i.switchTo().frame( "PegaGadget1Ifr");
		 Thread.sleep(2000);
		 WebElement r=i.findElement(By.xpath("(//*[@id=\"OrderSubType\"])[1]"));
		  Selct(r,"-", i);
		 Thread.sleep(2000);
		 WebElement r1=i.findElement(By.xpath("(//*[@id=\"MainAccessType\"])[1]"));
		 Selct(r1,"Leased Line", i);
		 Thread.sleep(2000);
		 WebElement r3=i.findElement(By.xpath("(//*[@id=\"selbw\"])[1]"));
		 Selct(r3,"54", i);
		 
		 Thread.sleep(2000);
		 WebElement r4=i.findElement(By.xpath("(//*[@id=\"TechnicalSLA\"])[1]"));
		 Selct(r4,"classic", i);
		
		
		//-------------------------Double click-------------
	       
		
		//-------------Location Tab--------------------------
		i.findElement(By.xpath("(//label[text()='Lokation'])[2]")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("//input[@id='LocationCommercialLawName']")).sendKeys("Automation Test");
		
		Thread.sleep(2000);
		i.findElement(By.xpath("//input[@id='LocationHouseNumber']")).sendKeys("7");
	    Thread.sleep(2000);
	    i.findElement(By.xpath("//*[@id=\"LocationCity\"]")).sendKeys("Kempten");
	    Thread.sleep(2000);
	    i.findElement(By.xpath("//input[@id=\"LocationStreet\"]")).sendKeys("Taxisweg");
	    Thread.sleep(4000);
	    i.findElement(By.xpath("//*[@id=\"LocationPLZ\"]")).sendKeys("87439");
	    Thread.sleep(2000);
	    i.findElement(By.xpath("(//label[text()='Produktkonfiguration'])[1]")).click();
	    Thread.sleep(2000);
	    WebElement r5 = i.findElement(By.xpath("(//nobr[text()=' 1 - Fehlend'])[1]"));
	   DBC(r5,i);
	    Thread.sleep(2000);
	    i.findElement(By.xpath("//textarea[@id='EXPAND']")).sendKeys("LAge");
	    Thread.sleep(2000);
	    i.findElement(By.xpath("//button[text()='  Übernehmen ']")).click();
	    Thread.sleep(5000);
	    WebElement r6=i.findElement(By.xpath("(//nobr[text()=' 0 - Neu'])[1]"));
	   DBC(r6,i);
	    Thread.sleep(4000);
	    
		 WebElement r7=i.findElement(By.xpath("(//select[@id='ParameterValue'])[1]"));

	    Selct(r7, "Frau", i);
	    i.findElement(By.xpath("(//input[@id='ParameterValue'])[2]")).sendKeys("ashish");
	    i.findElement(By.xpath("(//input[@id='ParameterValue'])[3]")).sendKeys("Mphasis");
	    i.findElement(By.xpath("(//input[@id='ParameterValue'])[10]")).sendKeys("34343434");
	    i.findElement(By.xpath("(//input[@id='ParameterValue'])[12]")).sendKeys("ash@p.com");
	    i.findElement(By.xpath("//button[text()='  Übernehmen ']")).click();
	    Thread.sleep(2000);
	    
        tpid = i.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/table/tbody/tr/td/nobr/font/font/font/font")).getText();
		System.out.println("Pdtp value is: "+tpid);

	    i.findElement(By.xpath("//div[@id=\"RULE_KEY\"]/table/tbody/tr/td/nobr/font/font/u/a")).click();
	    Thread.sleep(5000);
	    i.switchTo().defaultContent();
	    i.switchTo().frame( "PegaGadget2Ifr");
	    Thread.sleep(1000);
	    
	    //--------------PDCP Page------------------------------

		i.findElement(By.xpath("//a[@title='Dieses Arbeitsobjekt bearbeiten']")).click();
		Thread.sleep(2000);
		i.findElement(By.xpath("//input[@id=\"CustomerNumber\"]")).sendKeys("0000000087770");
		i.findElement(By.xpath("//*[@id=\"CustomerName\"]")).sendKeys("Stephen");
		i.findElement(By.xpath("//*[@id=\"cal$PpyWorkPage$pCustomerSignatureIcon\"]")).click();
		i.findElement(By.xpath("//a[text()='Heute']")).click();
		i.findElement(By.xpath("//div[text()='Speichern']")).click();
	    i.switchTo().defaultContent();
		Thread.sleep(2000);

		i.findElement(By.xpath("(//span[@id='close'])[2]")).click();
		Thread.sleep(2000);
	    i.switchTo().defaultContent();
	    i.switchTo().frame( "PegaGadget1Ifr");
	    Thread.sleep(2000);
		
		i.findElement(By.xpath("//button[text()='  Senden '] ")).click();
		Thread.sleep(3000);
	    i.switchTo().defaultContent();
	    i.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    
	    i.switchTo().defaultContent();
	    i.findElement(By.xpath("//a[text()='Abmelden']")).click();
	    
	    
		

		
		
}
}