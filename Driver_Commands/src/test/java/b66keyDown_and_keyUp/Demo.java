package b66keyDown_and_keyUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

		driver.get("http://omayo.blogspot.com/");
        
        WebElement compediumDevLink = driver.findElement(By.linkText("compendiumdev"));
       
        Actions actions = new Actions(driver);
       
        actions.moveToElement(compediumDevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

		driver.quit();

	}

}
