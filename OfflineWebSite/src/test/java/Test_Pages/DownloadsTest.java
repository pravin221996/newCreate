package Test_Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.DownloadsPage;
import Pages.DownloadsPage;

@Listeners(MyList.class)

public class DownloadsTest extends Base {

	WebDriver driver = null;
	DownloadsPage dp;

	@Test
	@BeforeSuite
	public void openBrowser() {
		
		log.info("opening browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		log.info("opening url");
		driver.get(
				"file:///C:/selenium%20Start/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		log.info("maximizing browser");
		driver.manage().window().maximize();
		reportUnit();
	}

	@Test(priority = 1)
	public void check_TableName() {
        log.info("Calling DownloadsPage");
		DownloadsPage dp = new DownloadsPage(driver);
		log.info("check name Downlist");
		dp.check_TableName();

	}

	@Test(priority = 2)
	public void print_Downloads_ListTable() {
        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
		log.info("printing Download_ListTable");
		dp.print_Downloads_ListTable();
	}

	@Test(priority = 3)
	public void check_OfficialWebSite1() {
        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");
		dp.check_OfficialWebSite1();
		driver.get("https://www.oracle.com/java/technologies/downloads/#java8");
		Assert.assertEquals(driver.getTitle(), "Java Downloads | Oracle");

	}

	@Test(priority = 4)
	public void check_OfficialWebSite2() throws Exception {
        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");
		dp.check_OfficialWebSite2();
		driver.get("http://selenium-release.storage.googleapis.com/index.html");

		log.info("applying waits for 5 sec");
		Thread.sleep(5000);

		String ActText = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[3]")).getText();
		String ExpText = "Last modified";
        log.info("comaparing actual with expected");
		Assert.assertEquals(ActText, ExpText);

	}

	@Test(priority = 5)
	public void check_OfficialWebSite3() throws Exception {
        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");

		dp.check_OfficialWebSite3();

		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		log.info("applying waits for 5 sec");
		Thread.sleep(5000);

		String ActText = driver.findElement(By.xpath("/html/body/main/div/table/caption/span[1]")).getText();
		String ExpText = "Packages";
        log.info("comaparing actual with expected");

		Assert.assertEquals(ActText, ExpText);
	}

	@Test(priority = 6)
	public void check_OfficialWebSite4() throws Exception {
        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");
		dp.check_OfficialWebSite4();

		driver.navigate().to("https://chromeenterprise.google/browser/download/#windows-tab");
		log.info("applying waits for 5 sec");

		Thread.sleep(5000);

		String ActText = driver.findElement(By.xpath("/html/body/header/div[2]/a/p")).getText();
		String ExpText = "chrome enterprise";
        log.info("comaparing actual with expected");
        
		Assert.assertEquals(ActText, ExpText);
	}

	@Test(priority = 7)
	public void check_OfficialWebSite5() throws Exception {
        log.info("Calling DownloadsPage");

		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");

		dp.check_OfficialWebSite5();
		driver.navigate().to("https://chromedriver.chromium.org/downloads");
		log.info("applying waits for 5 sec");

		Thread.sleep(5000);

		String ActText = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/header/div/div[2]/div[1]/div[1]/a/span"))
				.getText();
		String ExpText = "ChromeDriver - WebDriver for Chrome";
        log.info("comaparing actual with expected");
		Assert.assertEquals(ActText, ExpText);
	}

	@Test(priority = 8)
	public void check_OfficialWebSite6() throws Exception {

        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");
		dp.check_OfficialWebSite6();

		driver.navigate().to("https://ftp.mozilla.org/pub/firefox/releases/");
		log.info("applying waits for 5 sec");

		Thread.sleep(5000);

		String ActText = driver.findElement(By.xpath("/html/body/h1")).getText();
		String ExpText = "Index of /pub/firefox/releases/";
        log.info("comaparing actual with expected");
		Assert.assertEquals(ActText, ExpText);
	}

	@Test(priority = 9)
	public void check_OfficialWebSite7() throws Exception {
        log.info("Calling DownloadsPage");
		dp = new DownloadsPage(driver);
        log.info("checking Official Website Link");
		dp.check_OfficialWebSite7();

		driver.navigate().to("https://github.com/mozilla/geckodriver/releases");
		log.info("applying waits for 5 sec");
		Thread.sleep(5000);
		String ActText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div[2]/a"))
				.getText();
		String ExpText = "Sign in";
        log.info("comaparing actual with expected");

		Assert.assertEquals(ActText, ExpText);
	}

	
	//LogOutButttonTest
	
	@Test

	public void check_LogOutButton() {

		
		DownloadsPage lp = new DownloadsPage(driver);
		lp.check_LogOutButton();

	}

}
