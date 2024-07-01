package Selenium_Program;

import java.time.Duration;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); //String name ="";
        driver.get("https://www.leafground.com/select.xhtml"); 
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
       // driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
       
        WebElement firstDropDown = driver.findElements(By.cssSelector(".ui-selectonemenu")).get(0);
        Select favoriteTool = new Select(firstDropDown);
        favoriteTool.selectByVisibleText("Selenium");
        WebElement countryDropDown = driver.findElement(By.cssSelector("#j_idt87\3acountry_label"));
        countryDropDown.click();
        List<WebElement> countriesList = driver.findElements(By.cssSelector("[id='j_idt87:country_items'] li"));
        for(WebElement e:countriesList) {
        	 String Countryname=e.getText();
            // System.out.println(Countryname);
             if(Countryname.equalsIgnoreCase("india")) {
            	 e.click();
            	 break;
        }
        }
        Thread.sleep(2000);
        WebElement cityDropDown = driver.findElement(By.id("j_idt87:city_label")); 
        cityDropDown.click();
        List<WebElement> cityOptions = driver.findElements(By.cssSelector("[id='j_idt87:city_items'] li"));
        for(WebElement s:cityOptions) {
        	String cityName = s.getText();
        	if(cityName.equalsIgnoreCase("chennai")) {
        		s.click();
        		break;
        	}
        } 
        
        WebElement courseDropDown = driver.findElement(By.cssSelector(".ui-autocomplete-dropdown"));
        courseDropDown.click();
        List<WebElement> courseOptions = driver.findElements(By.cssSelector("[id='j_idt87:auto-complete_panel'] li"));
        for(WebElement e:courseOptions) {
        	String name = e.getText();
        	if(name.equalsIgnoreCase("Selenium WebDriver")) {
        		e.click();
        		break;
        	}
        } 
        
         Thread.sleep(2000);
        driver.findElement(By.cssSelector("[data-token-value='Selenium WebDriver'] .ui-icon-close")).click(); 
        WebElement LanguageDropDown = driver.findElement(By.id("j_idt87:lang_label"));
        LanguageDropDown.click();
        List<WebElement> languageOptions = driver.findElements(By.cssSelector("[id='j_idt87:lang_items'] li"));
        for(WebElement e:languageOptions) {
        	String name = e.getText();
        	if(name.equalsIgnoreCase("tamil")) {
        		e.click();
        		break;
        	}
        	
        }
        Thread.sleep(2000);
        WebElement langValues = driver.findElement(By.id("j_idt87:value_label"));
        langValues.click();
        List<WebElement> langOptions = driver.findElements(By.cssSelector("[id='j_idt87:value_items'] li"));
        for(WebElement e:langOptions) {
        	System.out.println(e.getText());
        }
        
        langOptions.get(1).click();
        driver.close(); 

        
        	

	}

}
