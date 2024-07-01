package Selenium_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 WebElement conformButton = driver.findElement(By.id("j_idt88:j_idt90"));
		conformButton.click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement disabledBox = driver.findElement(By.name("j_idt88:j_idt92"));
		System.out.println(disabledBox.isEnabled());
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		int x = submitButton.getRect().getX();
		int y = submitButton.getRect().getY();
		System.out.println("Position of submitButton is "+x+" "+y); 
		WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
		String buttonColor = saveButton.getCssValue("color");
		System.out.println(buttonColor);  //rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box
		//java.awt.Color hex = Color.fromString(buttonColor).getColor(); //ashex,asrgba,asrgb,as color 
		//System.out.println(hex); 
		WebElement submitButton2 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int height = submitButton2.getRect().getHeight();
		int width = submitButton2.getRect().getWidth();
		System.out.println("Submit Button Height is:"+height+" Width is:"+width);
		WebElement successButton = driver.findElement(By.xpath("//span[contains(text(),'Success')]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(successButton).build().perform();
		Thread.sleep(2000);
		WebElement imageButton = driver.findElement(By.xpath("//span[text()='Image']"));
		imageButton.click();
		Thread.sleep(2000);
		imageButton.click();
		System.out.println("Buttons in the page:"+driver.findElements(By.tagName("button")).size());
		driver.close();
		
		

	}

}
