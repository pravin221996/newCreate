package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.LogInPage;

@Listeners(MyList.class)
public class LogInTest extends Base {

	LogInPage lp;
	WebDriver driver;


	@Test(priority = 1)
	@BeforeSuite
	public void openBrowser() {

		log.info("..Oenning Browser..");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		log.info("Opening required url");
		
		driver.navigate()
				.to("file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		log.info("maxmizing Browser");
		
		driver.manage().window().maximize();
		log.info("create an report");
        reportUnit();

	}

	@Test(priority = 2)
	public void check_EmailFirstLetterUpperCase() throws Exception {
		
		log.info("loading LogInPage");
		lp = new LogInPage(driver);
		log.info("loginpage is displayed");
		
		log.info("checking email firstletter is uppercase or not");
		lp.check_Email("Pravinpingle@gmail.com");
	}

	@Test(priority = 3)
	public void check_Password() throws Exception {
		log.info("loading LogInPage");
		lp = new LogInPage(driver);
		log.info("LogInPage is displayed");

		log.info("checking password_error massage");
		lp.check_Password("1234234");

	}

	@Test(priority = 4)
	public void check_BlankEmail() throws Exception {
		log.info("loading LogInPage");
		lp = new LogInPage(driver);
		log.info("LogInPage is displayed");
		log.info("checking blank_error massage");
		lp.check_BlankEmail("");
	}

	@Test(priority = 5)
	public void check_BlankPassword() throws Exception {
		log.info("loading LogInPage");
		lp = new LogInPage(driver);
		log.info("LogInPage is displayed");

		log.info("checking blankpassword_error massage");

		lp.check_Password("");
	}

	@Test(priority = 6)
	public void check_LogInFiction1() {
		log.info("loading LogInPage");
		lp = new LogInPage(driver);
		log.info("LogInPage is displayed");
		lp.logInToAplication("kiran@gmail.com", "123456");

		log.info("Checking Title");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

	}

	@Test(priority = 7)
	public void check_WrongEmailAsInput() {
		log.info("loading LogInPage");

		lp = new LogInPage(driver);
		log.info("LogInPage is displayed");

		log.info("check LoginToApllication");
		lp.logInToAplication("Kartik@gamil.com", "1323287");

	}

	@Test(priority = 8)
	public void check_RegistrationNewMember() {
		log.info("loading LogInPage");

		lp = new LogInPage(driver);
		log.info("LogInPage is displayed");
 
		log.info("check newMembership");
		lp.check_NewMemberShip();

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");
	}
	


}
