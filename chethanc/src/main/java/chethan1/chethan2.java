package chethan1;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class chethan2 {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com//");
	driver.manage().window().maximize();
	WebElement menu=driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
	Actions actions =new Actions (driver);
	actions.moveToElement(menu).perform();
	WebElement menu1=driver.findElement(By.xpath("//span[text()='Free Tensorflow eBooks']"));
	//(By.linkText("Stay signed out")).click();
	//driver.findElement(By.partialLinkText("QlyBfb")).click();
	//driver.findElement(By.id("webstoreToast")).sendKeys("laptop");
    //driver.findElement(By.id("pass")).sendKeys("admin123");
	//driver.findElement(By.id("loginbutton")).click();
	
	//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("likith@3808");
	//driver.findElement(By.xpath("//button["QlyBfb"]")).click();

}
}