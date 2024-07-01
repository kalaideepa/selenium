package Selenium_Program;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.leafground.com/window.xhtml"); 
        
        WebElement clickAndConfirm = driver.findElement(By.id("j_idt88:new"));
        clickAndConfirm.click();
        
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it =  window.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        
        WebElement email = driver.findElement(By.id("email")); 
        email.sendKeys("infomats@email.com"); 
        driver.close();
        
        driver.switchTo().window(parentWindow);
        WebElement multipleWindow = driver.findElement(By.id("j_idt88:j_idt91"));
        multipleWindow.click();
        int windowCount = driver.getWindowHandles().size();
        System.out.println("Opened Windows:"+windowCount);
        
        WebElement closeWindows = driver.findElement(By.id("j_idt88:j_idt93"));
        closeWindows.click();
        
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Opened Windows:"+windowCount);
        for(String e:allWindows) {
        	if(!e.equals(parentWindow)) {
        		driver.switchTo().window(it.next());
        		Thread.sleep(1500);
        		driver.close();
        	}
        }
       
 }

 }
