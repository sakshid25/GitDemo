package Practice;

import org.testng.annotations.Test;

public class homeloan {
	
	@Test(groups={"Smoke"})
	public void webloginhome()
	{
		System.out.println("Webloginhome");
	}

	@Test
	public void MobileLoginhome()
	{
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void LoginAPIhome()
	{
		System.out.println("loginAPIhome");
	}

}
