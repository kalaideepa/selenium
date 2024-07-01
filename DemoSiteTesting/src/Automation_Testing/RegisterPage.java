package Automation_Testing;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement firstName = driver.findElement(By.cssSelector("[ng-model='FirstName']"));
		firstName.sendKeys("Gopinath");
		WebElement lastName = driver.findElement(By.cssSelector("[ng-model='LastName']"));
		lastName.sendKeys("J");
		WebElement fileUpload = driver.findElement(By.id("imagesrc"));
		fileUpload.sendKeys("C:\\Users\\Gopi\\Downloads\\241a gopi white.jpg");
		WebElement address = driver.findElement(By.cssSelector("[ng-model='Adress']"));
		address.sendKeys("1/17-3,Kattur road,Namakkal-637401,TN");
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("infomatsslm@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9766382621");

		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		WebElement hobbies = driver.findElement(By.id("checkbox1"));
		hobbies.click();
		String[] lang = { "English", "Hindi" };
		List<String> langList = Arrays.asList(lang);
		WebElement languages = driver.findElement(By.cssSelector("#msdd"));
		languages.click();
		List<WebElement> languagesList = driver.findElements(By.cssSelector("[class='ng-scope'] a"));
		for (WebElement e : languagesList) {
			String name = e.getText();
			if (langList.contains(name)) {
				e.click();
			}
		}

		WebElement skills = driver.findElement(By.id("Skills"));
		Select dropDown = new Select(skills);
		dropDown.selectByValue("Java");
		WebElement country = driver.findElement(By.cssSelector("span[role='presentation']"));
		country.click();
		List<WebElement> countryList = driver.findElements(By.cssSelector("[id='select2-country-results'] li"));
		for (WebElement e : countryList) {
			if (e.getText().equalsIgnoreCase("india")) {
				e.click();
				break;
			}

		}

		String year = "1996", month = "August", day = "12";
		WebElement yearDropDown = driver.findElement(By.cssSelector("select[id='yearbox']"));
		Select yeardd = new Select(yearDropDown);
		yeardd.selectByValue(year);
		WebElement monthDropDown = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select monthdd = new Select(monthDropDown);
		monthdd.selectByValue(month);
		WebElement dayDropdown = driver.findElement(By.id("daybox"));
		Select daydd = new Select(dayDropdown);
		daydd.selectByValue(day);

		WebElement password = driver.findElement(By.id("firstpassword"));
		password.sendKeys("Gopi@5012");
		WebElement cnfrmPassword = driver.findElement(By.id("secondpassword"));
		cnfrmPassword.sendKeys("Gopi@5012");
		WebElement submit = driver.findElement(By.cssSelector("#submitbtn"));
		submit.click();

	}

}
