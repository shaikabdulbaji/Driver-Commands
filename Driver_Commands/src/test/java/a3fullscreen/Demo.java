package a3fullscreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	 public static void main(String[] args) throws InterruptedException {
         
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.manage().window().fullscreen();
         driver.get("http://tutorialsninja.com/demo/");  
         
         Thread.sleep(2000);
         
         driver.close();
         
  }


}
