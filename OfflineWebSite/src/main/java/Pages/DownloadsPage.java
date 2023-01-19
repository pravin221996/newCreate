package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;

public class DownloadsPage extends Base {

	// WebElements
	
	@FindBy(xpath = "/html/body/div/aside[1]/section/ul/li[6]/a")
	WebElement DownloadsButton;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")
	WebElement CheckText;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a")
	WebElement OfficialWebSiteLink1;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a")
	WebElement OfficialWebSiteLink2;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[8]/a")
	WebElement OfficialWebSiteLink3;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a")
	WebElement OfficialWebSiteLink4;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[6]/td[8]/a")
	WebElement OfficialWebSiteLink5;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[7]/td[8]/a")
	WebElement OfficialWebSiteLink6;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[8]/td[8]/a")
	WebElement OfficialWebSiteLink7;
	

	@FindBy(xpath = "/html/body/table/tbody/tr[1]/th[3]")
	WebElement OfficialWebSiteLi2;
	
	@FindBy(xpath="/html/body/div/aside[1]/section/ul/li[7]/a")
	WebElement LogOutButn;
	
	
	// Parameterized Constructor
	public DownloadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Methods
	public void check_TableName() {

		DownloadsButton.click();

		String ActTableName = CheckText.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String ExpName = "Downloads List";
		log.info("Compairing Actual and Expected");
		
		Assert.assertEquals(ActTableName, ExpName);
	}

	public void print_Downloads_ListTable() {

		DownloadsButton.click();
        log.info("applying for loop to print table");
		for (int i = 1; i < 9; i++) {
			String TableHeaderName = DownloadsButton
					.findElement(By.xpath(
							"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"))
					.getText();
			System.out.println(TableHeaderName);
		}
		for (int j = 2; j < 9; j++) {
			for (int k = 2; k < 9; k++) {
				String TableElements = DownloadsButton.findElement(By.xpath(
						"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + j + "]/td[" + k + "]"))
						.getText();
				System.out.println(TableElements);
			}
		}
	}

	public void check_OfficialWebSite1() {
		
		DownloadsButton.click();
		log.info("click on link");
		OfficialWebSiteLink1.click();

	}

	public void check_OfficialWebSite2() throws Exception {

		DownloadsButton.click();
		log.info("click on link");

		OfficialWebSiteLink2.click();
		
	}

	public void check_OfficialWebSite3() throws Exception {

		DownloadsButton.click();
		log.info("click on link");

		OfficialWebSiteLink3.click();

	}

	public void check_OfficialWebSite4() throws Exception {

		DownloadsButton.click();
		log.info("click on link");
		OfficialWebSiteLink4.click();
	}

	public void check_OfficialWebSite5() throws Exception {

		DownloadsButton.click();
		log.info("click on link");
		OfficialWebSiteLink5.click();
	}

	public void check_OfficialWebSite6() throws Exception {

		DownloadsButton.click();
		log.info("click on link");
		OfficialWebSiteLink6.click();
	}

	public void check_OfficialWebSite7() throws Exception {

		DownloadsButton.click();
		log.info("click on link");
		OfficialWebSiteLink7.click();
	}
	public void check_LogOutButton() {
		LogOutButn.click();
		
		
	}


}
