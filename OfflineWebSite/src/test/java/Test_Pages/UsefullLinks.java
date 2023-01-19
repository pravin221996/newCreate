package Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.Base;
import Listners.MyList;
import Pages.UsefulLinksPage;

@Listeners(MyList.class)

public class UsefullLinks extends Base {
	WebDriver driver;
	UsefulLinksPage ut;

	@Test(priority = 1)
	@BeforeSuite
	public void open_Browser() {
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

	@Test(priority = 2)
	public void check_UsefullLinksTablePresent() {
		log.info("...loading UsefulLinksPage...");
		ut = new UsefulLinksPage(driver);
		log.info("...UsefulLinksPage succesfully Loaded...");

		log.info("...check UsefullLinksTablePresent...");

		ut.check_UsefullLinksTablePresent();

	}

	@Test(priority = 3)
	public void Print_UsefulLinksTable() {
		log.info("...loading UsefulLinksPage...");
		ut = new UsefulLinksPage(driver);
		log.info("...UsefulLinksPage succesfully Loaded...");

		log.info("...Print UserfulLinktable...");
		ut.Print_UsefulLinksTable();
	}

	@Test(priority = 4)
	public void Check_TableHeader_Click() {
		log.info("...loading UsefulLinksPage...");
		ut = new UsefulLinksPage(driver);
		log.info("...UsefulLinksPage succesfully Loaded...");
		
		log.info("...Print UserfulLinktable...");
		ut.Print_UsefulLinksTable();
	}

	@Test(priority = 5)
	public void Check_ColumnClickLink() {
		log.info("...loading UsefulLinksPage...");
		ut = new UsefulLinksPage(driver);
		log.info("...UsefulLinksPage succesfully Loaded...");
		
		log.info("...Check ColumnClickLink...");
		ut.Check_ColumnClickLink();
	}

	@Test(priority = 6)
	public void Check_ContentTable() {
		log.info("...loading UsefulLinksPage...");
		ut = new UsefulLinksPage(driver);
		log.info("...UsefulLinksPage succesfully Loaded...");
		
		log.info("...Check ContentTable...");
		ut.Check_ContentTable();
	}

//	@Test(priority = 7)
//	public void Check_FirstGoLink() throws Exception {
//
//		ut = new UsefulLinksPage(driver);
//		ut.Check_FirstGoLink();
//
//		driver.navigate().to("https://javabykiran.com/news");
//		String ActText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/section/div/header/h1"))
//				.getText();
//		String ExpText = "This page doesn't seem to exist.";
//
//		Assert.assertEquals(ActText, ExpText);
//
//	}

	@Test(priority = 8)
	public void Check_SecondGoLink() throws Exception {
		log.info("...opening required url...");

		driver.navigate().to("https://javabykiran.com/java-by-kiran-videos/");
		
		log.info("...checking Title...");
		Assert.assertEquals(driver.getTitle(), "Live Videos | javabyKiran");
	}
	
	

}
