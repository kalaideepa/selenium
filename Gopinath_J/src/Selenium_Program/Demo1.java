package Selenium_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com"); 
        driver.manage().window().maximize();
       // driver.findElement(By.id("APjFqb")).sendKeys("Salem");
       // driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Salem");
        
        WebElement google =  driver.findElement(By.cssSelector("#APjFqb"));
        int height = google.getRect().getHeight();
        int width = google.getRect().getWidth();
        int x = google.getRect().getX();
        int y = google.getRect().getY();
        System.out.println(height+" "+width+" "+x+" "+y);
        
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
        w.until(ExpectedConditions.visibilityOf(google)); 
        
	}
 }
