package b33tagName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		 driver.get( "http://omayo.blogspot.com/");
         
         //Write code here
         List<WebElement> elements = driver.findElements(By.tagName("button"));
        
         for(WebElement element : elements) {
               
               System.out.println(element.getText());
               
        }

		driver.close();

	}

}
