package b41getOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		// Write your code here
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdownField);
		
		//getOptions() is used to retrive all the text of the options in given dropdown.
		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {

			System.out.println(option.getText());

		}

		driver.quit();

	}

}
