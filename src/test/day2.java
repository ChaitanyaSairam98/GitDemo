package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"smoke"})
	public void ploan() {
		System.out.println("good");
		System.out.println("good1");
		
	}
	
	@BeforeTest
	public void presequite() {
		System.out.println("i will Execute first");
		System.out.println("i will Execute first1");
		
	}
	@AfterTest
	public void endsequite() {
		System.out.println("i will Execute last");
		System.out.println("i will Execute last1");
		
	}
		
	

}
