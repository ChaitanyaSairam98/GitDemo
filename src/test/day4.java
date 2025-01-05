package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups= {"smoke"})
	public void WebloginHomeloan() {
		System.out.println("WebloginHomeloan");
		System.out.println("WebloginHomeloan1");
	}
	
	@Test
	public void MobileloginHomeloan() {
		System.out.println("MobileloginHomeloan");
		System.out.println("MobileloginHomeloan1");
	}
	
	//@Test
	@BeforeMethod
	public void APIloginHomeloan() {
		System.out.println("APIloginHomeloan");
		System.out.println("APIloginHomeloan1");
	}

}
