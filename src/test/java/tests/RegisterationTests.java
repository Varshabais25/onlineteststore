package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
import listeners.TestngListener;
import pages.RegistrationPageObjects;

@Listeners(TestngListener.class)
public class RegisterationTests extends TestBase {
	@Test
	public void verifyRegistration() {
		Assert.assertTrue(hp.verifySignInLink(),"not present");
		hp.clickSignIn();
		String expectedpagetitle="CREATE AN ACCOUNT";
		String actaualpagetitle=hp.getcreateaccount();
		Assert.assertEquals(actaualpagetitle, expectedpagetitle,"create account not found");
		hp.setemailcreate("dcqadevops@gmail.com");
		hp.clickSignIn();
		RegistrationPageObjects rp=new RegistrationPageObjects();
		
		
		String expectedtitle="YOUR PERSONAL INFORMATION";
		String actualtitle=rp.getpersonaltext();
		Assert.assertEquals(actualtitle, expectedtitle,"not present personal info not found..");
	}

}
