package b28getTagName;

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
        
        //Write your code here
       String tagName = driver.findElement(By.id("alert1")).getTagName();
       
       System.out.println(tagName);

		driver.quit();

	}

}
