package pomdemo.com.tutorialsninja.test;

import org.testng.annotations.Test;

import pomdemo.com.tutorialsninja.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test
	public void logout() {
		
		HomePage logoutPage = new HomePage();
		logoutPage.logoutFromApplication();
		 
	}
	
}
