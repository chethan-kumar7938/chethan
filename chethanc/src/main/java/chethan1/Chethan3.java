package chethan1;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Chethan3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		//WebElement button= driver.findElement(By.xpath("//input[@type='button']"));
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions =new Actions (driver);
		actions.contextClick(button).perform();
		Thread.sleep(5000);
		WebElement Copy =driver.findElement(By.xpath("//span[text()='Copy']"));
		actions.moveToElement(Copy).click().perform();
	}

}