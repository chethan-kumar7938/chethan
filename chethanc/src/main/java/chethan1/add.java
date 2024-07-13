package chethan1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class add {


	
	
			public static void main(String[] args) throws InterruptedException {
				Scanner sc=new Scanner(System.in);
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        driver.manage().window().maximize();
		        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		        for(WebElement Option: checkboxes)
		        if(!Option.isSelected()) {
		        	Option.click();
		            try {
		                // Pause for 1 second between each checkbox click
		                Thread.sleep(1000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		         }
		        
		        Select objSelect = new Select(driver.findElement(By.name("dropdown-class-example")));
		        
		       List <WebElement> elementCount = objSelect.getOptions();
		        for(int i=1;i<=elementCount.size();i++) {
		        	objSelect.selectByIndex(i);
		        	Thread.sleep(1000); 
		        	break;
		        }
		        
		        
		        WebElement countries=driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		        System.out.println(countries);
		        /*System.out.println("enter the country name");
		        String s=sc.next();*/
		        countries.sendKeys("xyz");
		       
		        WebElement radio1=driver.findElement(By.className("radioButton"));
		        radio1.click();
		        
		        WebElement openWindowButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("openwindow")));
		        openWindowButton.click();
		        Thread.sleep(5000);
		        //driver.close();

		        String originalWindowHandle = driver.getWindowHandle();
		        driver.switchTo().window(originalWindowHandle);
		        

		        WebElement openTabButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("opentab")));
		        openTabButton.click();
		        Thread.sleep(5000);
		        driver.switchTo().window(originalWindowHandle);
		        
		        WebElement myname=driver.findElement(By.name("enter-name"));
		        myname.sendKeys("akarsh");
		        
		        WebElement openAlert=wait.until(ExpectedConditions.elementToBeClickable(By.id("alertbtn")));
		        openAlert.click();
		        Thread.sleep(5000);
		        driver.switchTo().alert().accept();
		        
		        //WebElement myname1=driver.findElement(By.name("enter-name"));
		        myname.sendKeys("sb");
		        
		        WebElement openConfirm=wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmbtn")));
		        openConfirm.click();
		        Thread.sleep(5000);
		        driver.switchTo().alert().accept();
		        
		}
		

	}


