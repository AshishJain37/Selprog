import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class www {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jaashish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("u_0_k")).sendKeys("ashish");
			driver.findElement(By.id("u_0_m")).sendKeys("Jain");
			Select s1 = new Select(driver.findElement(By.name("month")));
			System.out.println("month");
			s1.selectByValue("3");
	
	}

}
