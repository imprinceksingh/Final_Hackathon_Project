package testCases;

import org.testng.annotations.Test;

import factory.CrossBrowsing;
import pageObjects.InvalidGoogleLoginPage;

public class TC001_InvalidGoogleLogin extends CrossBrowsing {
	InvalidGoogleLoginPage login;
	@Test(priority =0)
	public void testing() {
		login = new InvalidGoogleLoginPage(driver);
	}

	@Test(priority=1)
	public void testclickLoginButton() {
		
		login.clickLoginButton();
		
	}
	@Test(priority=2)
	public void testclickGoogleAccount() {
		login.clickGoogleAccount();
	}
	@Test(priority=3)
	public void testenterRandomEmail() {
		login.enterRandomEmail();
		
	}
	@Test(priority=4)
	public void testprintErrorMessage() {
		login.printErrorMessage();
		
	}
		
		
	}


