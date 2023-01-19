package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.UserPage;

@Listeners(MyList.class)

public class UserTest extends Base{

	WebDriver driver;
	UserPage ut;

	@Test
	@BeforeSuite
	public void open_Browser() {
		log.info("...opening browser...");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		log.info("...opening required url...");
		driver.get(
				"file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		log.info("...maximizing browser...");
		driver.manage().window().maximize();
		reportUnit();
	}

	@Test

	public void check_UsertableElement() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");

		log.info("...check UserTableElement...");
		ut.check_UserTableElement();

	}

	@Test
	public void check_UserTableElement1() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");

		log.info("...check UserTableElement1...");
		ut.check_UserTableElement1();

	}

	@Test(priority = 3)
	public void check_UserTableElement2() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");
		
		log.info("...check UserTableElement2...");
		ut.check_UserTableElement2();

	}

	@Test(priority = 4)
	public void check_UserTableElement3() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");

		log.info("...check UserTableElement3...");

		ut.check_UserTableElement3();

	}

	@Test(priority = 5)
	public void check_UserTableElement4() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");

		log.info("...check UserTableElement4...");
		ut.check_UserTableElement4();
	}

	@Test(priority = 6)
	public void verifyTableColumnCount() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");

		log.info("...check verifyTableColumnCount...");

		ut.verifyTableColumnCount();

	}

	@Test(priority = 7)
	public void verifyTableElement_MaharastraIsPresent() {
		
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");

		log.info("...check verifyTableElement_MaharastraIsPresent...");

		ut.verifyTableElement_MaharastraIsPresent();
	}

	@Test(priority = 8)
	public void verifyTableELement_CountryIsPresent() {
        log.info("...loading UserPage...");
		ut = new UserPage(driver);
		log.info("..userpage is loaded sucessfully ...");
		
		log.info("...check verifyTableELement_CountryIsPresent ...");

		ut.verifyTableELement_CountryIsPresent();
	}

//	@Test
//	public void print_UserTableIfPresent() {
//
//		UserTable ut = new UserTable(driver);
//		ut.print_UserTable();
//
//	}

	
}
