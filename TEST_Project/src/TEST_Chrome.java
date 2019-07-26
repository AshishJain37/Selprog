import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TEST_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jaashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.toolsqa.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("tp-button orange large")).click();
		//getScreenshotAs(OutputType<X> target)
		//Thread.sleep(1000);
		//driver.findElement(By.id("u_0_k")).sendKeys("Ashish");
		//String t1 = driver.getTitle();
		//printf(t1);
		//driver.findElement(By.id("u_0_m")).sendKeys("Fain");
		//Select s = new Select(driver.findElement(By.id("day")));
		//s.selectByIndex(3);
		//Select s1 = new Select(driver.findElement(By.name("month")));
		//s1.selectByVisibleText("Mar");
		//Select s2 = new Select(driver.findElement(By.id("year")));
		//s2.selectByValue("2013");
		

	}

	private static void printf(String t1) {
		
	}

}
