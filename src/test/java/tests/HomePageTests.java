package tests;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.TestBase;
import listeners.TestngListener;

@Listeners(TestngListener.class)
public class HomePageTests extends TestBase{
	
	@Test
	public void verifyLogin() throws InterruptedException {
	Thread.sleep(5000);
	Assert.assertTrue(hp.verifySignInLink(),"not present");
	hp.clickSignIn();
	
	String expectedresult="ALREADY REGISTERED?";
	String actualresult=hp.getalreadyregisteredtext();
	Assert.assertEquals(actualresult, expectedresult,"not found expected result");
	
	hp.setemail(readconfig.getuseremail());
	hp.setpassword(readconfig.getpassword());
	hp.clicksiginbtn();
	
}
@Test
public void resetForgotten() {
	Assert.assertTrue(hp.verifyforgottenlink(),"forgotten link not present");
	hp.forgottenpwd();
	String expectedstatus="FORGOT YOUR PASSWORD?";
	String actuallstatus=hp.getforgottentest();
	Assert.assertEquals(actuallstatus, expectedstatus,"not matching..");
	
}
}
