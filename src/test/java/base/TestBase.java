package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePageObjects;
import utilities.ReadConfiguration;

public class TestBase {
	public static ReadConfiguration readconfig;
	protected static WebDriver driver;
	public  HomePageObjects hp;
	
	public static void SelectBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirfoxPath());
			driver=new FirefoxDriver();
		}
	}
	
	
	
	@BeforeClass
	public void SetupBrowser() throws IOException {
		readconfig=new ReadConfiguration();
		System.out.println("setup browser");
		SelectBrowser(readconfig.getdriveroption());
	driver.manage().window().maximize();
	driver.get(readconfig.getQaUrl());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//implicitwait for web pages
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	 
	 hp=new HomePageObjects();
}
	@AfterClass
	public void CloseBowser() {
		//driver.close();
		
		System.out.println("close the browser");
	}
}
