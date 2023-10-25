package b38selectByIndex;

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

		Thread.sleep(3000);

		// Write code here
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		Select select1 = new Select(dropdownField);

		select1.selectByIndex(1);

		WebElement multiselectionBoxField = driver.findElement(By.id("multiselect1"));
		Select select2 = new Select(multiselectionBoxField);

		select2.selectByIndex(0);

		driver.close();

	}

}
