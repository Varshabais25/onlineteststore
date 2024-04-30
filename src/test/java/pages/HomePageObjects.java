package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	 WebDriver driver=null;
	public HomePageObjects() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH, using="//a[@class=\"login\"]")
	WebElement signIN;
	
	@FindBy(how = How.XPATH, using="//h3[text()='Already registered?']")
	WebElement alreadyregistered;
	 
	@FindBy(how = How.XPATH, using="//input[@id=\"email\"]")
	WebElement emailaddressforlogin;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"passwd\"]")
	WebElement passwordforlogin;
	
	@FindBy(how = How.XPATH, using="//button[@id=\"SubmitLogin\"]")
	WebElement siginbtn;
	
	@FindBy(how = How.XPATH, using="//a[@title=\"Recover your forgotten password\"]")
	WebElement forgettenpassword;
	
	@FindBy(how = How.XPATH, using="//h3[text()=\"Create an account\"]")
	WebElement Createaccount;
	
	@FindBy(how = How.XPATH, using="//input[@id=\"email_create\"]")
	WebElement emailcreate;
	
	@FindBy(how = How.XPATH, using="//button[@id=\"SubmitCreate\"]")
	WebElement subtbtn;
	
	public boolean verifySignInLink() {
		boolean status=signIN.isDisplayed();
		return status;
	}
	
	public void clickSignIn() {
		signIN.click();
	}
	
	public String getalreadyregisteredtext()
	{
		String text=alreadyregistered.getText();	
		return text;
		}
	
	public void setemail(String email) {
		emailaddressforlogin.clear();
		emailaddressforlogin.sendKeys(email);
	}
	
	public void setpassword(String pwd) {
		passwordforlogin.clear();
		passwordforlogin.sendKeys(pwd);
	}
	
	public void clicksiginbtn() {
		siginbtn.click();
	}
	
	public boolean verifyforgottenlink() {
		boolean forgotstatus=forgettenpassword.isDisplayed();
		return forgotstatus;
	}
	public void forgottenpwd() {
		forgettenpassword.click();
	}
	public String getforgottentest()
	{
		String forgettentext=forgettenpassword.getText();	
		return forgettentext;
		}
	public String getcreateaccount()
	{
		String createacc=Createaccount.getText();	
		return createacc;
		}
	
	public void setemailcreate(String ecreate) {
		emailcreate.clear();
		emailcreate.sendKeys(ecreate);

	}
	public void submitbutton() {
		subtbtn.click();
	}
	
}
