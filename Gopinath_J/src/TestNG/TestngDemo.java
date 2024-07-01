package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngDemo {
	
	@Test(priority=1)
	public void bus() {
		System.out.println("I am the BUS");
	}
	
	@Test(priority=2)
	public void car() {
		System.out.println("I am the Car");
	}
	
	@Test(priority=3)
	public void bicycle() {
		System.out.println("I am the Bicycle");
	}
	
	@Test(priority=4)
	public void bike() {
		System.out.println("I am the Bike");
		
		SoftAssert s = new SoftAssert();
		
	}

 }
