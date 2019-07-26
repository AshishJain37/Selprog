import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TEST_projct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jaashish\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.quit();
		//driver.get("http://www.google.com");
		//driver.manage().window().maximize();
		//driver.findElement(By.id("lst-ib")).sendKeys("Mphasis");
		//driver.findElement(By.name("btnK")).click();
		//driver.navigate().back();

	}

}


