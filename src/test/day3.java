package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void Weblogincarloan() {
		System.out.println("Weblogincarloan");
		System.out.println("Weblogincarloan1");
	}
	@BeforeMethod
	public void Bfmethod() {
		System.out.println("Excute before every method");
	}
	@AfterMethod
	public void Afmethod() {
		System.out.println("Excute After every method");
	}
	
	@Parameters({"URL","APIKEY"})
	@Test
	public void Mobilesignincarloan(String urlname,String key) {
		System.out.println("Mobilesignincarloan");
		System.out.println("Mobilesignincarloan1");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dependsOnMethods= {"Weblogincarloan"})
	public void APIcarloan() {
		System.out.println("APIcarloan");
	}
	@Test(dataProvider="getData")
	public void Mobilelogincarloan(String username, String Password) {
		System.out.println("Mobilelogincarloan");
		System.out.println(username);
		System.out.println(Password);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		//1set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		//3rdset
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
