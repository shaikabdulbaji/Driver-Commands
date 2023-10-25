package b70build_and_perform;

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

		WebElement searchTextField = driver.findElement(By.name("q"));

		searchTextField.sendKeys("Arun");

		Actions actions = new Actions(driver);

		/*
		 * build() method in Actions class is use to create chain of action or operation you want to 
		   perform. perform() this method in Actions Class is use to execute chain of action which 
		   are build using Action build method.
		 */
		
		actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

		driver.close();

	}

}
