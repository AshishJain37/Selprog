import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class toolsqa{
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\jaashish\\Downloads\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		
		//Here we are storing the value from the cell in to the string variable
		String sCellValue = driver.findElement(By.xpath(".//*[@class='content']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(sCellValue);
		
		// Here we are clicking on the link of first row and the last column
		//driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		//System.out.println("Link has been clicked otherwise an exception would have thrown");
		//driver.close();
	}
}