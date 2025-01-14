package Selenium_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		/* driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println(frame1.getText());
		driver.switchTo().defaultContent(); */
		
		driver.switchTo().frame(2); 
		driver.switchTo().frame("frame2"); 
		WebElement frame2 = driver.findElement(By.id("Click"));	
		frame2.click();
		System.out.println(frame2.getText());
		driver.switchTo().defaultContent();
		
		
	/*	int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frames count:"+frameCount);  */
	}

}
