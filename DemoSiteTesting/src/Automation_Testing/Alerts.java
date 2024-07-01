package Automation_Testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver(); 
        driver.get("https://demo.automationtesting.in/Alerts.html"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
       
        WebElement alert1 = driver.findElement(By.cssSelector("a[href='#OKTab']"));
        WebElement alertButton = driver.findElement(By.cssSelector("button[class*='btn-danger']"));
        alertButton.click();
        Alert a = driver.switchTo().alert();
        a.accept();
        
        WebElement alert2 = driver.findElement(By.cssSelector("a[href='#CancelTab']"));
        alert2.click();
        WebElement alertButton2 = driver.findElement(By.cssSelector("[class*=btn-primary]"));
        alertButton2.click();
        a.dismiss();
        System.out.println(driver.findElement(By.cssSelector("[id='demo']")).getText());
        
        WebElement alert3 = driver.findElement(By.cssSelector("a[href='#Textbox'"));
        alert3.click();
        WebElement alertButton3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        alertButton3.click();
        a.sendKeys("Gopinath J");
        a.accept();
        String[] name = driver.findElement(By.cssSelector("[id='demo1']")).getText().split(" ");
        System.out.println(name[1]+" "+name[2]);
        
        
        
        

	}

}
