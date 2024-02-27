package pomdemo.com.tutorialsninja.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.extentReport.ExtentReportUtils;

import pomdemo.com.tutorialsninja.test.BaseTest;

public class LoginPage {
	//locating elements start here
	
	//locate username
	@FindBy(name = "email") //no semicolon is needed here
	WebElement eMailAddressTextBox;
	
	//locate password
	@FindBy(name = "password")
	WebElement passwordTextBox;
	
	//locate login button
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	//locating elements ends here
	
	//To initilaize these elements we need to call iniTelements() method inside the constructor of this (current class) class
	//create  constuctor of this class to initialize elements
	
	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//create object of Logger class
	Logger log = LogManager.getLogger(LoginPage.class);
	//write method to automate login page
	public void loginToApplication(String username, String password) {
		
		eMailAddressTextBox.sendKeys(username);
		log.info("Username is entered in username text box");
		ExtentReportUtils.addStep("Username is entered");
		passwordTextBox.sendKeys(password);
		log.info("Password is entered in username text box");
		ExtentReportUtils.addStep("Password is entered");
		loginBtn.click();
		log.info("Login button is Clicked");
		ExtentReportUtils.addStep("CLicked Login Button");

		
	}
	
}
