package Practice;

import org.testng.annotations.Test;

public class carloan {
	@Test(groups={"Smoke"})
	public void WebLogincar()
	{
		System.out.println("Weblogincar");
	}
	
	@Test
	public void MobileLogincar()
	{
		System.out.println("Mobilelogincar");
	}
	
	@Test
	public void MobileSignIncar()
	{
		System.out.println("MobileSignIncar");
	}
	
	@Test
	public void MobileSignOutcar()
	{
		System.out.println("MobileSignOutcar");
	}
	@Test
	public void LoginAPIcar()
	{
		System.out.println("loginAPIcar");
	}

}
