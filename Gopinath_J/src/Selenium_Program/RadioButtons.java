package Selenium_Program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) { 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); //String name ="";
        driver.get("https://www.leafground.com/radio.xhtml"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        WebElement browserRB = driver.findElement(By.cssSelector("[id='j_idt87:console1'] label"));
        browserRB.click();
        
        WebElement cityRB = driver.findElement(By.cssSelector("[id='j_idt87:city2'] label"));
        cityRB.click();
        cityRB.click(); 
        
        List<WebElement> defaultRB = driver.findElements(By.xpath("//table[@id='j_idt87:console2']//span"));
        for(int i=0;i<defaultRB.size();i++) {
        	String attr = defaultRB.get(i).getAttribute("class");
        	if(attr.contains("bullet")) {
        		String browserName = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//label)["+(i+1)+"]")).getText();
        		//System.out.println(i+1);
        		System.out.println("Default radio button is:"+browserName);
        		break;
                }
         }
        
        WebElement ageRB = driver.findElement(By.cssSelector("[id='j_idt87:age'] label"));
        ageRB.click();
        
        

} }
