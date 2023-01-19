package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Base;

public class UsefulLinksPage extends Base {

	// WebElements
	@FindBy(xpath = "/html/body/div/aside[1]/section/ul/li[5]/a")
	WebElement UsefuLinkButton;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a")
	WebElement FirstGoLink;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]/a")
	WebElement SecondGoLink;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/section/div/header/h1")
	WebElement FirstGoLinkclick;

	// Parameterized Constructor
	public UsefulLinksPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Methods

	public void check_UsefullLinksTablePresent() {
	    log.info("click on UsefuLinkButton");
		UsefuLinkButton.click();

		String ActTableName = UsefuLinkButton.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a"))
				.getText();
		String ExpTableName = "Useful Links";
		log.info("compairing actual and expected");

		Assert.assertEquals(ActTableName, ExpTableName);

	}

	public void Print_UsefulLinksTable() {
        log.info("click on UsefuLinkButton ");
		UsefuLinkButton.click();
		
		log.info("applying for loopto Print_UsefulLinksTable");

		for (int i = 1; i < 4; i++) {
			String Text1 = UsefuLinkButton
					.findElement(By.xpath(
							"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"))
					.getText();
			System.out.println(Text1 + "   ");
		}
		for (int j = 2; j < 7; j++) {
			for (int k = 1; k < 4; k++) {
				String Text2 = UsefuLinkButton.findElement(By.xpath(
						"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + j + "]/td[" + k + "]"))
						.getText();
				System.out.println(Text2 + "   ");
			}
		}
		System.out.println();
	}

	public void Check_TableHeader_Click() {
        log.info("click on UsefuLinkButton");
		UsefuLinkButton.click();
        log.info("creating list of links");
		List<WebElement> list = UsefuLinkButton
				.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[3]"));

		boolean status = false;

		for (WebElement web : list) {
			log.info("getting text");
			String value = web.getText();
			log.info("checking condition");
			if (value.contains("Click")) {

				status = true;
				break;

			}
		}
		log.info("wheather status is true or false");
		Assert.assertTrue(status);
	}

	public void Check_ColumnClickLink() {
        log.info("click on UsefuLinkButton ");
		UsefuLinkButton.click();
        log.info("getting first go link");
		List<WebElement> Ele_Go = FirstGoLink.findElements(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a"));

		for (WebElement ele : Ele_Go) {
          log.info("click on links");
			ele.click();
		}
	}

	public void Check_ContentTable() {
        log.info("click on UsefuLinkButton ");

		UsefuLinkButton.click();

		String ActText = UsefuLinkButton
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[2]"))
				.getText();
		String ExpText = "Content";
		log.info("compairing actual and expected");
		Assert.assertEquals(ActText, ExpText);

		for (int i = 2; i < 8; i++) {

			String elements = UsefuLinkButton
					.findElement(By.xpath(
							"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[2]\r\n"))
					.getText();
			System.out.println(elements);
		}
	}

	public void Check_FirstGoLink() throws Exception {
        log.info("click on UsefuLinkButton ");
		UsefuLinkButton.click();
        log.info("click on FirstGoLink ");
		FirstGoLink.click();

		Thread.sleep(10000);

	}

	public void Check_SecondGoLink() throws InterruptedException {
        log.info("click on UsefuLinkButton ");
		UsefuLinkButton.click();
        log.info("click on SecondGoLink ");
		SecondGoLink.click();

		Thread.sleep(10000);

	}

}
