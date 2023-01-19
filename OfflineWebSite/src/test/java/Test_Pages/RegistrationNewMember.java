package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.RegistrationPage;

@Listeners(MyList.class)

public class RegistrationNewMember extends Base {

	WebDriver driver;
	RegistrationPage rp;
	@Test(priority=1)
	@BeforeSuite
	public void open_Browser() {
		
		log.info("...open browser...");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		log.info("...opening required url...");
		driver.get(
				"file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/register.html");
		log.info("...maximizing browser...");
		driver.manage().window().maximize();
		reportUnit();
	}

	@Test(priority = 2)
	public void check_RegisPage() {
        log.info("...loading RegistrationPage...");
	    rp = new RegistrationPage(driver);
	    
	    log.info("...RegisPage is loaded sucessful...");
		rp.check_RegisPage();
		
		log.info("opening required url");
		driver.get(
				"file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/register.html");
		log.info("comparing actual and expected");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");

	}

	@Test(priority = 3)
	public void check_NameTextBox() {
		
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");

	    log.info("...checking NameTextbox..");
		rp.check_NameTextBox();
	}

	@Test(priority = 4)
	public void check_MobileTextBox() {
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");

	    log.info("...checking MobileTextbox..");
		rp.check_MobileTextBox();
	}

	@Test(priority = 5)
	public void check_emailTextBox() {
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");
	    
	    log.info("...checking EmailTextbox...");
		rp.check_EmailTextBox();

	}

	@Test(priority = 6)
	public void check_PasswordTextBox() {
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");

	    log.info("...checking PasswordTextBox...");

		rp.check_PasswordTextBox();

	}

	@Test(priority = 7)
	public void check_AddUserFunctionality() throws InterruptedException {
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");

	    log.info("...checking AddUserFunctionality...");
		rp.check_AddUserFunctionality();

		log.info("...Accepting alert...");
		driver.switchTo().alert().accept();
	}

	@Test(priority = 8)
	public void check_IfalreadyHaveMembership() {
		log.info("...opening url...");
		driver.get(
				"file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/register.html");
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");

	    log.info("...checking IfalreadyHaveMembership...");
		rp.check_IfalreadyHaveMembership();

		log.info("...checking Title...");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");

	}

	@Test(priority = 9)
	public void check_Heading() {

		log.info("...opening url...");
		driver.get("file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
        log.info("...loading RegistrationPage...");
		rp = new RegistrationPage(driver);
	    log.info("...RegisPage is loaded sucessful...");
	    
	    log.info("...check heading...");
		rp.check_Heading();

	}

}
