package pomdemo.com.tutorialsninja.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

import pomdemo.com.tutorialsninja.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginWithValidUserNameAndPassword() throws InvalidFormatException, IOException {
		
		LoginPage loginPage = new LoginPage();
		//loginPage.loginToApplication(ExcelUtility.getTestData(1, 0), ExcelUtility.getTestData(1, 1));
		loginPage.loginToApplication(PropertiesUtility.getDataFromPropertyFile("username"), PropertiesUtility.getDataFromPropertyFile("password"));
	}
	
}
