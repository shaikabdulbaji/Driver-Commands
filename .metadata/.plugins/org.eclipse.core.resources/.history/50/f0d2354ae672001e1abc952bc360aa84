package b64doubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com");
        
        WebElement doubleClickOption = driver.findElement(By.id("testdoubleclick"));
       
        Actions actions = new Actions(driver);
       
        actions.doubleClick(doubleClickOption).build().perform();

		driver.close();

	}

}
