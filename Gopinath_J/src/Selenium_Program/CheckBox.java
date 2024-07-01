package Selenium_Program;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); //String name ="";
        driver.get("https://www.leafground.com/checkbox.xhtml"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        WebElement basicCheckBox = driver.findElement(By.id("j_idt87:j_idt89"));
        basicCheckBox.click();
        
        WebElement ajaxCheckBox = driver.findElement(By.id("j_idt87:j_idt91"));
        ajaxCheckBox.click();
        
        WebElement message = driver.findElement(By.cssSelector(".ui-growl-title")); ////*[@id="j_idt87:multiple_panel"]/div[2]/ul/li[1]/label
        System.out.println(message.getText());
        ajaxCheckBox.click(); 
        
        String neededProgrammingLanguages[] = {"Java","Python"};
        List neededLanguages = Arrays.asList(neededProgrammingLanguages);
        List<WebElement> programmingLanguages = driver.findElements(By.cssSelector("[id='j_idt87:basic'] label"));
        for(WebElement e:programmingLanguages) {
        	String languagesOptions = e.getText();
        	if(neededLanguages.contains(languagesOptions)) {
        		e.click();
        	}
         }
        
        WebElement triState = driver.findElement(By.id("j_idt87:ajaxTriState"));
        triState.click();
        
        WebElement Message = driver.findElement(By.tagName("p"));    
        //System.out.println(Message.getText());
        triState.click();
        triState.click();
        
        WebElement toggleSwitch = driver.findElement(By.cssSelector(".ui-toggleswitch-slider"));
        toggleSwitch.click();
        
        WebElement disabledBox = driver.findElement(By.id("j_idt87:j_idt102"));
        System.out.println(disabledBox.isEnabled());  //bug
        
        WebElement multipleSelect = driver.findElement(By.cssSelector("ul[data-label='Cities']"));
        multipleSelect.click();
        
        String[] neededOptions = {"Miami","Istanbul","Rome"};
        List<String> neededList = Arrays.asList(neededOptions);
        List<WebElement> multipleSelectOptions = driver.findElements(By.cssSelector(".ui-selectcheckboxmenu-items-wrapper label"));
        for(WebElement e:multipleSelectOptions) {
        	String name = e.getText();
        	if(neededList.contains(name)) {
        		e.click();
        	}
        }
        
       
       
        
        
        
        
        
        

	}

}
