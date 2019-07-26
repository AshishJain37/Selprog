import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class appaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.ie.driver","C:\\Users\\jaashish\\Downloads\\IEDriverServer.exe");
          WebDriver driver = new InternetExplorerDriver();
          driver.get("https://www.toolsqa.com");
          driver.manage().window().maximize();
          //driver.findElement(By.id("email")).sendKeys("ashishjainjbp2011@gmail.com");
          //driver.findElement(By.name("firstname")).sendKeys("Ashish");
          //driver.findElement(By.name("lastname")).sendKeys("Jain");
          //driver.findElement(By.name("lastname")).sendKeys("Jain");
          //driver.findElement(By.name("sex")).click();
          //WebElement el = driver.findElement(By.name("firstname"));
          //String a = el.getAttribute("id");
          //System.out.println(el.getAttribute("name"));
          //System.out.println(a);
         driver.
          
    
          
	}

}
