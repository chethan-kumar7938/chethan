package chethan1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Demo3 {
              @Test 
			
			public void f() {
				ChromeDriver driver = new ChromeDriver();

				driver.get("https://testautomationpractice.blogspot.com/");
		    	driver.manage().window().maximize();
		    	WebElement button = driver.findElement(By.id("country"));
		    	Select select = new Select(button);
		    	select.selectByValue("germany");

				
			}
			
			
			
			
	
		

	}


