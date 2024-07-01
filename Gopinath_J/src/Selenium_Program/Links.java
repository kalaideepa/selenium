package Selenium_Program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement dashBoard = driver.findElement(By.xpath("(//div[@class='col-12']//a)[1]"));
		dashBoard.click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WebElement destinationLink = driver.findElement(By.xpath("(//div[@class='col-12']//a)[2]"));
		System.out.println(destinationLink.getAttribute("href"));
		
		WebElement brokenLink = driver.findElement(By.xpath("(//div[@class='col-12']//a)[3]"));
		String url = brokenLink.getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		//conn.setRequestMethod("HEAD");
		//conn.connect();
		int respCode = conn.getResponseCode();
		if(respCode>200)
			System.out.println("BROKEN LINK");
		else
			System.out.println("VALID LINK");
		
		System.out.println("Link count:"+driver.findElements(By.tagName("a")).size());
		
		WebElement layout = driver.findElement(By.cssSelector("#j_idt87"));
		
		System.out.println("Link count in this layout:"+layout.findElements(By.tagName("a")).size());
		
		List<WebElement> layoutLinks = layout.findElements(By.tagName("a"));
		
		ArrayList<String> links = new ArrayList<String>();
		
		for(WebElement e:layoutLinks) {
			
		String URL = e.getAttribute("href").split(";")[0];
		if(!links.contains(URL)) {
			links.add(URL);
		}
		else
			System.out.println(e.getText()+" is a DUPLICATE LINK");
		}
		
		System.out.println(links);
	}

}
