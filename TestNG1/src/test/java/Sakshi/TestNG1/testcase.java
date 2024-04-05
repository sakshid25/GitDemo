package Sakshi.TestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase {
	
	@BeforeTest
	public void bftest()
	{
		System.out.println("before testcases in that folder");
	}
	
	@AfterTest
	public void aftest()
	{
		System.out.println("after testcases in that folder");
	}
	
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("before testcases across all test folders");
	}
	
	@AfterSuite
	public void afsuite()
	{
		System.out.println("after testcases across all test folders");
	}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("before every test method in a class");
	}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("after every test method in a class");
	}
	@Test
	public void Method1()
	{
		System.out.println("Method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method2");
	}
	

}
