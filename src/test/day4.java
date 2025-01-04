package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups= {"smoke"})
	public void WebloginHomeloan() {
		System.out.println("WebloginHomeloan");
	}
	
	@Test
	public void MobileloginHomeloan() {
		System.out.println("MobileloginHomeloan");
	}
	
	//@Test
	@BeforeMethod
	public void APIloginHomeloan() {
		System.out.println("APIloginHomeloan");
	}

}
