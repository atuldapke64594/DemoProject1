package day21Aug23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class CheckBoxUtility {

		static WebDriver driver;  // Global variable
		
		static void clickOnCheckButton(By by) throws InterruptedException
		{
			driver.findElement(by).click();  
			Thread.sleep(3000l);
		}
		
		public static void main(String[] args) throws InterruptedException  {
			
			driver = new EdgeDriver();
			driver.get("https://www.letskodeit.com/practice");
			driver.manage().window().maximize();
			
			clickOnCheckButton(By.id("hondacheck"));
			clickOnCheckButton(By.id("benzcheck"));
			clickOnCheckButton(By.id("bmwcheck"));
			
		}
	}
	
	
	
	
	
	
	
	
	
	
