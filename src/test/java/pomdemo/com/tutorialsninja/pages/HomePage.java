package pomdemo.com.tutorialsninja.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.extentReport.ExtentReportUtils;

import pomdemo.com.tutorialsninja.test.BaseTest;

public class HomePage {
	
	//locate adminlink btn
	@FindBy(xpath = "//i[@class='fa fa-home']") //need to write expath here, right now orangeHRM server is down/not openiing
	WebElement homeLinkBtn;
	
	//locate My Account
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement myAccountLinkBtn;
	
	//locate logout btn
	@FindBy(linkText = "Logout")
	WebElement logoutBtn;
	
	//constructor to initialize the aboce elements
	public HomePage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	//create the object of logger class
	Logger log = LogManager.getLogger(HomePage.class);
	
	//create methods
	
	public void clickOnAdminLink() {
		homeLinkBtn.click();
		log.info("Admin button is clicked");
	}
	
	public void logoutFromApplication() {
		myAccountLinkBtn.click();
		log.info("Myaccount button is clicked");
		ExtentReportUtils.addStep("Mayaccount is clicked");
		logoutBtn.click();
		log.info("Logout button is clicked");
		ExtentReportUtils.addStep("Logout is clicked");
	}
}
