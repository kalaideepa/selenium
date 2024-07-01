package Selenium_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		 // WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml"); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
        nameBox.sendKeys("Gopinath");
        WebElement cityBox = driver.findElement(By.id("j_idt88:j_idt91"));
        cityBox.sendKeys(",Potheri");
        WebElement textBox = driver.findElement(By.id("j_idt88:j_idt93"));
        boolean flag = textBox.isEnabled();
        System.out.println(flag);
        WebElement clearBox = driver.findElement(By.id("j_idt88:j_idt95"));
        clearBox.clear();
        WebElement typedText = driver.findElement(By.name("j_idt88:j_idt97"));
        String text = typedText.getAttribute("value");
        System.out.println(text);
        WebElement emailBox = driver.findElement(By.cssSelector("input[name='j_idt88:j_idt99']"));
        emailBox.sendKeys("infomats@cbe.com"+Keys.TAB);
        WebElement yourselfBox = driver.findElement(By.cssSelector("[placeholder='About yourself']"));
        yourselfBox.sendKeys("I am Gopinath J, lives in Namakkal");
        WebElement errorBox = driver.findElement(By.id("j_idt106:thisform:age"));
        errorBox.sendKeys(Keys.ENTER);
        System.out.println(driver.findElement(By.cssSelector(".ui-message-error-detail")).getText());
        WebElement positionBox=driver.findElement(By.xpath("//input[@name='j_idt106:float-input']"));
        positionBox.click();
        WebElement optionBox = driver.findElement(By.id("j_idt106:auto-complete_input"));
        optionBox.sendKeys("Gopi");
        driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[3]")).click();
        WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
        dob.sendKeys("08/12/1990");
        driver.findElement(By.xpath("//a[@class=' ui-state-default ui-state-active']")).click();
        WebElement spinnerBox = driver.findElement(By.cssSelector(".ui-spinner-input"));
        spinnerBox.sendKeys("100");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".ui-spinner-up")).click(); 
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".ui-spinner-down")).click();
        WebElement slideMover = driver.findElement(By.name("j_idt106:slider"));
        slideMover.sendKeys("150"); //bug
        WebElement uiKeyboard = driver.findElement(By.cssSelector(".ui-keyboard-input"));
        uiKeyboard.click();
        driver.findElement(By.xpath("/html/body/div[4]/div[4]/button[5]")).click();
        driver.findElement(By.cssSelector(".keypad-close")).click();
        WebElement textEditorBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]"));
        textEditorBox.sendKeys("Gopinath");
        Actions a = new Actions(driver); ////*[@id="j_idt88:j_idt103_editor"]/div[1]
        a.moveToElement(textEditorBox).click().doubleClick().build().perform(); //div[id='j_idt88:j_idt103_editor'] [class='ql-editor ql-blank']
        driver.findElement(By.cssSelector("[id='j_idt88:j_idt103_toolbar'] [class='ql-font ql-picker']")).click();
        driver.findElement(By.cssSelector("[data-value='monospace']")).click();
        driver.findElement(By.cssSelector("[aria-controls='ql-picker-options-1']")).click();
        driver.findElement(By.xpath("//span[@data-value='huge']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[class='ql-bold']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[class='ql-italic']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[class='ql-underline']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[class='ql-strike']")).click();
        Thread.sleep(1000); 
        
        WebElement toolBar = driver.findElement(By.cssSelector("[id='j_idt106:j_idt124'] [class='ql-editor ql-blank']"));
        toolBar.sendKeys("Virat");
        a.moveToElement(toolBar).click().doubleClick().build().perform();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [class='ql-bold']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [class='ql-italic']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [class='ql-underline']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [class='ql-strike']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [class='ql-picker-label']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [data-value='monospace']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [class='ql-picker-label']")).click();
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("[id='j_idt106:j_idt124_toolbar'] [data-value='huge']")).click();
      //  System.out.println(textEditorBox.getText());
       // System.out.println(toolBar.getText());
        driver.close();
        
		  
		  
	}

}
