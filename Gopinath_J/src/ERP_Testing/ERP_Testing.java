package ERP_Testing;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ERP_Testing extends ERP_Login {

	WebElement companyName;
	WebElement mobileNumber;
	WebElement email;
	WebElement name;
	WebElement billingEmail;

	@Test(priority = 1)

	public void customer_Management() {

		WebElement customerManagement = driver.findElement(By.xpath("(//a[@href='Customer.aspx'])[2]"));
		customerManagement.click();

		WebElement searchBox = driver.findElement(By.id("ContentPlaceHolder1_txt_src"));
		searchBox.sendKeys("CUS001165");
		WebElement searchButton = driver.findElement(By.cssSelector("[value='Search']"));
		searchButton.click();
		String ActualCompanyName = "MRL posnet";
		String ActualMobileNumber = "1234567899";
		String ActualEmail = "aishwaryamuthusannu@gmail.com";
		String ActualName = "aishwarya";
		String ActualBillingEmail = "chriz@gmail.com";

		companyName = driver.findElement(By.id("ContentPlaceHolder1_txt_compname"));
		Assert.assertEquals(ActualCompanyName, companyName.getAttribute("value"));
		mobileNumber = driver.findElement(By.id("ContentPlaceHolder1_txt_compmbl"));
		Assert.assertEquals(ActualMobileNumber, mobileNumber.getAttribute("value"));
		email = driver.findElement(By.id("ContentPlaceHolder1_txt_compemail"));
		Assert.assertEquals(ActualEmail, email.getAttribute("value"));
		name = driver.findElement(By.id("ContentPlaceHolder1_txt_cntname"));
		Assert.assertEquals(ActualName, name.getAttribute("value"));
		billingEmail = driver.findElement(By.id("ContentPlaceHolder1_txt_bllemail"));
		Assert.assertEquals(ActualBillingEmail, billingEmail.getAttribute("value"));

	}

	@Test(priority = 2)
	public void supplier_Management() {

		WebElement supplierManagement = driver.findElement(By.xpath("(//a[@href='supplier.aspx'])[2]"));
		supplierManagement.click();

		WebElement searchBox = driver.findElement(By.id("ContentPlaceHolder1_txt_src"));
		searchBox.sendKeys("SUP00548");
		WebElement searchButton = driver.findElement(By.cssSelector("[value='Search']"));
		searchButton.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@Test(priority = 3)
	public void Inventory_Management() {
		WebElement inventoryManagement = driver.findElement(By.xpath("//a[@href='Check_Availability.aspx']"));
		inventoryManagement.click();

		WebElement stocksRB = driver.findElement(By.id("ContentPlaceHolder1_Radiobutton_1"));
		stocksRB.click();

		WebElement productCtgry = driver.findElement(By.id("ContentPlaceHolder1_txt_pcat"));
		productCtgry.sendKeys("Sarees");
		WebElement productName = driver.findElement(By.id("ContentPlaceHolder1_txt_pname"));
		productName.sendKeys("Silks");
		WebElement date = driver.findElement(By.id("ContentPlaceHolder1_txt_idate"));
		date.click();
		driver.findElement(By.cssSelector("div[id*='today']")).click();
		WebElement itemName = driver.findElement(By.id("ContentPlaceHolder1_txt_iname"));
		itemName.sendKeys("silk saree");
		WebElement itemNumber = driver.findElement(By.id("ContentPlaceHolder1_txt_inum"));
		itemNumber.sendKeys("ss5012");
		WebElement quantity = driver.findElement(By.id("ContentPlaceHolder1_txt_qua"));
		quantity.sendKeys("502");
		WebElement costPrice = driver.findElement(By.id("ContentPlaceHolder1_txt_cprice"));
		costPrice.sendKeys("800");
		WebElement retailPrice = driver.findElement(By.id("ContentPlaceHolder1_txt_rprice"));
		retailPrice.sendKeys("1050");
		WebElement totalCost = driver.findElement(By.id("ContentPlaceHolder1_txt_tcost"));
		totalCost.sendKeys("401600");
		WebElement totalRetailCost = driver.findElement(By.id("ContentPlaceHolder1_txt_trcost"));
		totalRetailCost.sendKeys("527100");

		WebElement addButton = driver.findElement(By.cssSelector("input[value='Add']"));
		addButton.click();

		List<WebElement> products = driver
				.findElements(By.cssSelector("#ContentPlaceHolder1_GridView1 td:nth-child(2)"));
		for (WebElement e : products) {
			String name = e.getText();
			if (name.equals("Sarees"))
				System.out.println("Present");
				break;
		}

		WebElement searchBox = driver.findElement(By.id("ContentPlaceHolder1_txt_srch"));
		searchBox.sendKeys("ss5012");
		WebElement searchButton = driver.findElement(By.cssSelector("[value='Search']"));
		searchButton.click();
		WebElement delete = driver.findElement(By.cssSelector("input[value='Delete']"));
		delete.click(); // bug

	}

}
