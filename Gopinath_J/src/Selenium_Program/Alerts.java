package Selenium_Program;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.leafground.com/alert.xhtml"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement simpleAlert = driver.findElement(By.name("j_idt88:j_idt91"));
		simpleAlert.click();
		Alert a =  driver.switchTo().alert();
		a.accept();
		System.out.println(driver.findElement(By.id("simple_result")).getText());

		WebElement ConfirmationAlert = driver.findElement(By.id("j_idt88:j_idt93"));
		ConfirmationAlert.click();
		a.dismiss();
		System.out.println(driver.findElement(By.id("result")).getText());

		WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
		promptAlert.click();
		System.out.println(a.getText()); 
		a.sendKeys("Gopinath");
		a.accept();
		System.out.println(driver.findElement(By.id("confirm_result")).getText().split(":")[1].trim()); 

		WebElement sweetSimple = driver.findElement(By.id("j_idt88:j_idt95"));
		sweetSimple.click();
		driver.findElement(By.cssSelector("[id='j_idt88:j_idt98'] span[class*='ui-button-text']")).click();


		WebElement sweetConfirmationAlert = driver.findElement(By.id("j_idt88:j_idt100"));
		sweetConfirmationAlert.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101']//a//span")).click();  

		WebElement sweetConfirmation = driver.findElement(By.id("j_idt88:j_idt106"));
		sweetConfirmation.click();
		driver.findElement(By.id("j_idt88:j_idt108")).click(); 

		WebElement minMax = driver.findElement(By.name("j_idt88:j_idt111"));
		minMax.click();

		WebElement min_Max = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[3]/span"));
		min_Max.click();
		Thread.sleep(2000);
		min_Max.click();
		driver.findElement(By.cssSelector("[id='j_idt88:j_idt112'] a[aria-label='Close']")).click();

	}

}
