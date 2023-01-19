package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.DashboardPage;

@Listeners(MyList.class)

public class DashboardTest extends Base {

	WebDriver driver;
	DashboardPage dp;

	@Test
	@BeforeSuite
	public void open_Browser() {

		log.info("opening browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		log.info("opening URL");
		driver.get(
				"file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		log.info("maximizing browser");
		driver.manage().window().maximize();
		log.info("creating exxtenreport");
        reportUnit();

	}

	@Test(priority = 1)
	public void check_LogOutButton() {

		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");
		dp.check_LogOutButton();

		log.info("checking Title");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test(priority = 2)

	public void check_MoreinfoLink() {
		
		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");
		
		log.info("checking multiple link");
		dp.check_MoreInfoLink();
		
	}

	@Test(priority = 3)
	public void check_Moreinfo1() {
		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");

		log.info("checking multiple link");

		dp.check_MoreInfoLink1();

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

	@Test(priority = 4)
	public void check_userButton() {
		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");
		
		log.info("checking user button");
		dp.check_UserButton();

	}

	@Test(priority = 5)
	public void check_OperatorsButton() {
		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");

		log.info("checking Operators_button");
		dp.check_OperatorsButton();

	}

	@Test(priority = 6)
	public void check_UsefullLinkButton() {

		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");

		log.info("check usefull links");
		dp.check_UsefulLinks();
	}

	@Test(priority = 7)
	public void check_DowonloadButton() {

		log.info("calling DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");

		log.info("check downloads_Button");
		dp.check_DownloadsButton();

	}

	@Test(priority = 8)
	public void check_LogoutButton() {
		log.info("calling to DashboardPage");
		dp = new DashboardPage(driver);
		log.info("loading DashboardPage");

		log.info("check downloads_Button");
		dp.check_LogOutButton1();

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	
}
