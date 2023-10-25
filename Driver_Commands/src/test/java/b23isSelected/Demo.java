package b23isSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");
        
		 //Write code here
        System.out.println(driver.findElement(By.id("checkbox1")).isSelected());

		driver.quit();

	}

}
