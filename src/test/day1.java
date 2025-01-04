package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void Afsuite() {
		System.out.println("After suite");
	}
	
	@Test(groups= {"smoke"})
	public void SecondTest() {
		System.out.println("Bye");
		Assert.assertTrue(false);
	}
	

}
