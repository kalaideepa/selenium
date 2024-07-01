package Selenium_Program;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); //String name ="";
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        Files.copy(src, new File("C:\\Users\\Gopi\\eclipse-workspace2\\New folder\\Gopinath_J\\image.png")); 
        
        
	
	}

}
