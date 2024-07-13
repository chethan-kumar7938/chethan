package chethan1;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class demo1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//span[text()='searchDropdownDescription']"));
		Select select =new Select (button);
		select.selectByIndex(9);


	}

}
