package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.OperatorsPage;

@Listeners(MyList.class)

public class OpratersTable extends Base {

	WebDriver driver;
	OperatorsPage ot;

	@Test
	@BeforeSuite
	public void Open_Browser() {
		log.info("...open browser...");
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
	public void print_OperatorsTableIfPresent() {
		log.info("...loading OperatorsPage...");
		ot = new OperatorsPage(driver);
		log.info("...OperatorsPage succesfully Loaded...");

		log.info("...print OperatorsTable...");
		ot.print_OperatorsTableIfPresent();

	}

	@Test
	public void check_TableElement() {
		log.info("...loading OperatorsPage...");
		ot = new OperatorsPage(driver);
		log.info("...OperatorsPage succesfully Loaded...");

		log.info("...checking TableElement...");
		ot.check_TableElement();
	}

	@Test
	public void check_TableElement1() {
		log.info("...loading OperatorsPage...");
		ot = new OperatorsPage(driver);
		log.info("...OperatorsPage succesfully Loaded...");
		
		log.info("...checking TableElement...");
		ot.check_TableElement1();

	}

	@Test
	public void check_TableCoumnCount() {
		log.info("...loading OperatorsPage...");
		ot = new OperatorsPage(driver);
		log.info("...OperatorsPage succesfully Loaded...");

		log.info("...checking TableColumCount...");
		ot.check_TableColumnCount();

	}

	@Test
	public void check_TableHeaderNames() {
		log.info("...loading OperatorsPage...");
		ot = new OperatorsPage(driver);
		log.info("...OperatorsPage succesfully Loaded...");
		
		log.info("...checking TableHeaderNames...");
		ot.check_TableHeaderNames();
	}

}
