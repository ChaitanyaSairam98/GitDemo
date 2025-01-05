package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void Demo() {
		System.out.println("Hello");
		System.out.println("Hello1");
		System.out.println("Hello2");
		System.out.println("Hello3");
		
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("before suite");
		System.out.println("before suite1");
		System.out.println("before suite2");
	}
	@AfterSuite
	public void Afsuite() {
		System.out.println("After suite");
		System.out.println("After suite1");
	}
	
	@Test(groups= {"smoke"})
	public void SecondTest() {
		System.out.println("Bye");
		Assert.assertTrue(false);
	}
	

}
