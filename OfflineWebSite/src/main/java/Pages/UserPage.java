package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;

public class UserPage extends Base {

	// WebElements

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[3]/a")
	WebElement User;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[1]/h1")
	WebElement UserTableName;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[3]/a")
	WebElement UserTableelement;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[4]")
	WebElement UserTableElement1;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[4]")
	WebElement UserTableElement2;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[4]")
	WebElement UserTableElement3;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[4]")
	WebElement UserTableElement4;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]")
	WebElement Users;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]")
	WebElement UserTableEle ;

	
	// Constructor
	public UserPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Methods
	public void check_UserTableElement() {
        log.info("click on UserTableelement");
		UserTableelement.click();
		log.info("getting text");
		String ActSagarEmailPattern = UserTableEle.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]"))
				.getText();
		String ExpSagarEmailPattern = "sagar@gmail.com";
        log.info("compairing actual and expected");
		Assert.assertEquals(ActSagarEmailPattern, ExpSagarEmailPattern);

	}

	public void check_UserTableElement1() {
        log.info("click on UserTableelement1");
		UserTableelement.click();
		List<WebElement> web = UserTableElement1.findElements(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[4]"));
        log.info("checking sizes");
		Assert.assertEquals(web.size(), 1);

	}

	public void check_UserTableElement2() {
        log.info("click on UserTableelement");
		UserTableelement.click();
		List<WebElement> web = UserTableElement2.findElements(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[4]"));
        log.info("checking sizes");
		Assert.assertEquals(web.size(), 1);

	}

	public void check_UserTableElement3() {
        log.info("click on UserTableelement");
		UserTableelement.click();
		List<WebElement> web = UserTableElement3.findElements(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[4]"));
        log.info("checking sizes");
		Assert.assertEquals(web.size(), 1);

	}

	public void check_UserTableElement4() {
        log.info("click on UserTableelement");
		UserTableelement.click();
		List<WebElement> web = UserTableElement4.findElements(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[4]"));
        log.info("checking sizes");
		Assert.assertEquals(web.size(), 9);

	}

	public void verifyTableColumnCount() {
        log.info("click on UserTableelement");
		UserTableelement.click();
		log.info("applying for loop");
		for (int i = 1; i <= 9; i++) {

			List<WebElement> AllHeaders = UserTableelement.findElements(
					By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"));
			System.out.println(AllHeaders.size());

	        log.info("checking number of columns");

			Assert.assertEquals(AllHeaders.size(), 9, "Column count is not same");

			for (WebElement header : AllHeaders) {

				String value = header.getText();
				System.out.print(value + "    ");

			}

		}
	}

	public void verifyTableElement_MaharastraIsPresent() {
        log.info("click on UserTableelement");
		UserTableelement.click();
        log.info("ceating list all headers");
		List<WebElement> AllHeaders = UserTableelement.findElements(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[7]"));

		boolean status = false;

		for (WebElement header : AllHeaders) {

			String value = header.getText();
			// System.out.print(value + " ");
			log.info("checking condition");
			if (value.contains("Maharashtra")) {
				status = true;
				break;
			}
		}
		log.info("checking status is true or false");
		Assert.assertTrue(status);
	}

	public void verifyTableELement_CountryIsPresent() {
        log.info("click on UserTableelement");
		UserTableelement.click();
        log.info("applying for loop");
		for (int i = 8; i <= 9; i++) {
            log.info("creating list of allheaders");
			List<WebElement> AllHeaders = Users.findElements(
					By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"));

			System.out.println(AllHeaders.size());

			log.info("checking number of columns");
			Assert.assertEquals(AllHeaders.size(), 9, "Column count is not same");

			boolean status = false;

			for (WebElement header : AllHeaders) {

				String value = header.getText();
				log.info("checking condition");
				if (value.contains("country")) {
					status = true;
					break;
				}
			}
			log.info("checking status is true or false");
			Assert.assertTrue(status);
		}

	}

	public void print_UserTable() {
		log.info("click on user button");
		User.click();
		log.info("aapplying for loops to print the table");
		for (int i = 1; i < 8; i++) {
			String TableHeader = Users
					.findElement(By.xpath(
							"/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"))
					.getText();
			System.out.println(TableHeader + "  ");

			for (int j = 2; j < 6; j++) {
				for (int k = 1; k < 8; k++) {
					String name = Users.findElement(
							By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + j
									+ "]/td[" + k + "]"))
							.getText();
					System.out.println(name + "   ");
				}
			}
		}
	}
}
