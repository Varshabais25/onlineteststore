package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObjects {
	WebElement driver=null;
	public RegistrationPageObjects() {
		PageFactory.initElements(driver, RegistrationPageObjects.class);
	}
	@FindBy(how = How.XPATH, using="//h3[text()='Your personal information']")
	WebElement personalinfo;
	
	

	public String getpersonaltext() {
		// TODO Auto-generated method stub
		
		String text=personalinfo.getText();	
		return text;
	}



}
