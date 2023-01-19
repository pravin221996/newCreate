package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;

public class DashboardPage  extends Base{
//WebElements
	@FindBy(xpath = "/html/body/div/header/nav/div/ul/li/a")
	WebElement LogOutBtn;

	@FindBy(partialLinkText = "More")
	WebElement Moreinfo;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div[1]/div/a")
	WebElement MoreinfoLink1;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[3]/a")
	WebElement UserButton;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[4]/a")
	WebElement OperatorsButton;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[5]/a")
	WebElement UsefulLink;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[6]/a")
	WebElement DownloadsButton;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[7]/a")
	WebElement LogOutButton1;

	
	//constructor
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Methods
	public void check_LogOutButton() {

		log.info("click on LogOut button");
		
		LogOutBtn.click();

	}

	public void check_MoreInfoLink() {
		
		log.info("finding links in page and creating its list"); 

		List<WebElement> links = Moreinfo.findElements(By.partialLinkText("More"));

		
		for (WebElement link : links) {

			log.info("clicking on links");
			link.click();
			if (link.isDisplayed()) {
				
				log.info("getting text of linkText");
				String ActLinkName = link.getText();
				System.out.println(ActLinkName);
				String ExpName = "More info";
				log.info("comparing actual and expected");
				Assert.assertEquals(ActLinkName, ExpName);
			} else {
				System.out.println("syllabus is not present");
			}
		}
	}

	public void check_MoreInfoLink1() {
		log.info("clicking on moreinfo link");
		MoreinfoLink1.click();
	}

	public void check_UserButton() {
		log.info("clicking on user button");
		UserButton.click();

		log.info("getting actual text");
		String ActButtonName = UserButton.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1")).getText();
		String ExpButtonName = "Users";
		
		log.info("compairing that actual text with expected");

		Assert.assertEquals(ActButtonName, ExpButtonName);
	}

	public void check_OperatorsButton() {
        log.info("click on OperatorsButton");
		OperatorsButton.click();
		log.info("getting actual text");
		String ActButtonName = OperatorsButton.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
		String ExpButtonName = "Operator List";
		log.info("compairing actual text with expected");
		Assert.assertEquals(ActButtonName, ExpButtonName);
	}

	public void check_UsefulLinks() {
	    log.info("click on UsefulLinks");
		UsefulLink.click();
		
		log.info("getting text");
		String ActButtonName = UsefulLink
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
		String ExpButtonName = "* Internet Required";

		log.info("compairing actul text with expected");
		Assert.assertEquals(ActButtonName, ExpButtonName);
	}

	public void check_DownloadsButton() {
		log.info("click on DownloadsButton");
		DownloadsButton.click();
		log.info("getting text");
		String ActButtonName = DownloadsButton
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
		String ExpButtonName = "Downloads List";
		
		log.info("compairing actual and expected");

		Assert.assertEquals(ActButtonName, ExpButtonName);
	}

	public void check_LogOutButton1() {
		log.info("click on logOut button");
		LogOutButton1.click();
	}
}
