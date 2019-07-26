package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		}

	public static void main(String[] args) {
		int r=0;
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> rows = d.findElements(By.tagName("tr"));
		System.out.println("rows: " +rows.size());
		List<WebElement> coloms = d.findElements(By.tagName("td"));
		System.out.println("coloms: "+coloms.size());
		
		String w = d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]")).getText();
		System.out.println(w);
		
		for(int i=0;i<rows.size();i++) {
						
		List<WebElement> coloms1 = rows.get(i).findElements(By.tagName("td"));
				
		for(int j=0;j<coloms1.size();j++) {
			if(coloms1.get(j).getText().contains("UCO")) {
				System.out.println("pass1");
				r=i;
				System.out.println(r);
				break;
			}
		}
		
		}
		//System.out.println(r);
		
			
			
			
		
			
		//	if(coloms.get(j).getText().equalsIgnoreCase("Cera")) {
//				r=i;
//				System.out.println("r:"+ r);
//				break;
//			}
		}
			
			
		}
		
	


