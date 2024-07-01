package Selenium_Program;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileHandling {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //driver.get("https://www.leafground.com/file.xhtml");
        
        driver.get("https://www.ilovepdf.com/pdf_to_word");
        
       /* WebElement basicUpload = driver.findElement(By.id("j_idt88:j_idt89_input"));   
        basicUpload.sendKeys("C:\\Users\\Gopi\\Documents\\New folder\\Demo2.java");
        
        WebElement advancedUpload = driver.findElement(By.id("j_idt97:j_idt98_input"));
        advancedUpload.sendKeys("D:\\Gopi\\Gopi1.jpg");
        driver.findElement(By.xpath("//span[text()='Upload']")).click();
        
       WebElement downloadButton = driver.findElement(By.xpath("//span[text()='Download']"));
       downloadButton.click();
       
       //Thread.sleep(3000);
       File f = new File("C:\\Users\\Gopi\\Downloads\\TestLeaf Logo.png");
      
       if(f.exists()) {
    	   System.out.println("FILE IS PRESENT");
       }
       else
    	   System.err.println("FILE IS NOT PRESENT"); */
        
        WebElement upload = driver.findElement(By.id("html5_1i012v6de16bbr80d40k4bihu4"));
       
        upload.sendKeys("C:\\Users\\Gopi\\Downloads\\241a gopi white.pdf");
        

	}

}
