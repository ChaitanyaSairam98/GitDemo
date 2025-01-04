package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"smoke"})
	public void ploan() {
		System.out.println("good");
	}
	
	@BeforeTest
	public void presequite() {
		System.out.println("i will Execute first");
	}
	@AfterTest
	public void endsequite() {
		System.out.println("i will Execute last");
	}
		
	

}
