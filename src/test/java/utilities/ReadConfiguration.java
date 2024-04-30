package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	Properties prop;
	public ReadConfiguration() throws IOException {
	File f=new File("D:\\Java project\\OnlineTestStore\\Configuration\\config.properties");
	FileInputStream fis=new FileInputStream(f);
	 prop=new Properties();
	prop.load(fis);
	

}
	public String getChromePath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirfoxPath() {
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getdriveroption() {
		String driveroption=prop.getProperty("browseroption");
		return driveroption;
}
	public String getuseremail() {
		String useremail=prop.getProperty("testuseremail");
		return useremail;}
	public String getpassword() {
		String pwd=prop.getProperty("password");
		return pwd;
		}
	public String getQaUrl() {
		String qaurl=prop.getProperty("qa_env");
		return qaurl;
}}