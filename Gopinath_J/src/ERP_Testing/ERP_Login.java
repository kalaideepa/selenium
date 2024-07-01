package ERP_Testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ERP_Login {

	WebDriver driver;

	@BeforeSuite
	public void applicationLaunch() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("http://brm.tremplintech.in");
		String userName = "sylix";
		String password = "admin";

		WebElement user = driver.findElement(By.cssSelector("[name='txt_unam']"));
		user.sendKeys(userName);
		WebElement passwrd = driver.findElement(By.cssSelector("[name='txt_pass']"));
		passwrd.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		login.click();
		
	}

	@AfterSuite
	public void tearDown() {
		WebElement logout = driver.findElement(By.cssSelector("[id='LinkButton1']"));
		logout.click();
		driver.close();
	}

}
