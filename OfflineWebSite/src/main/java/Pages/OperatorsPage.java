package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;

public class OperatorsPage extends Base {
	
	//WebElement
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/aside[1]/section/ul/li[4]/a")
	WebElement OperatorButton;
	
	@FindBy(xpath="	/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3\r\n")
	WebElement OperatorTable;
	
	
	
	//Constructor
	public OperatorsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Methods

	public void print_OperatorsTableIfPresent() {
		log.info("click on OperatorButton");
		OperatorButton.click();
		
		log.info("getting text");
		
		String ActOperatorTaleName = OperatorTable.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
		System.out.println(ActOperatorTaleName);
		String ExpName = "Operator List";
		
		log.info("compairing actual and expected");

		Assert.assertEquals(ActOperatorTaleName, ExpName);

		log.info("applying for loops to print table");
		for (int i = 1; i < 7; i++) {
			String AllHeaderName = OperatorButton.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"))
					.getText();
			System.out.println(AllHeaderName);
		}
		for (int j = 3; j < 7; j++) {
			for (int k = 1; k < 7; k++) {
				String ElementsName = OperatorButton.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + j + "]/td[" + k + "]"))
						.getText();
				System.out.println(ElementsName);
			}
		}
	}
	
	public void check_TableElement() {
		log.info("click on OperatorButton");
		OperatorButton.click();
		
		log.info("getting text");

		String ActualPreferdWay = OperatorButton.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[4]"))
				                  .getText();
		String ExpctedPreferdWay = "Whats App Only";
		
		log.info("compairing actual and expected");


		Assert.assertEquals(ActualPreferdWay, ExpctedPreferdWay,"We can contact kiran and Darshit using Whats App Only");

	}
	
	public void check_TableElement1() {
		log.info("click on OperatorButton");
		OperatorButton.click();

		log.info("applying loop");
		for (int i = 2; i < 7; i++) {
			
			String ActNumber = OperatorButton.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[5]"))
					.getText();
			String ExpectedNumber = "7066885937";
			
			log.info("compairing actual and expected");

			Assert.assertEquals(ActNumber, ExpectedNumber, "comparing both result");

			log.info("checking condition");
			if (ActNumber == "7066885937") {

				System.out.println("only person you contact with is Neelam");
			}
		}
		
	}
	
	public void check_TableColumnCount() {
	    	log.info("click on OperatorButton");
		    OperatorButton.click();
		
		    log.info("creating List of all headers");
			List<WebElement> AllHeaders = OperatorButton.findElements(
					By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[6]"));
			System.out.println(AllHeaders.size());
			
			log.info("checking size");

			Assert.assertEquals(AllHeaders.size(), 6, "Column count is not same");

			for (WebElement header : AllHeaders) {
                log.info("getting all hedertext");
				String value = header.getText();
				System.out.print(value + "    ");

		}
	}
	
public void check_TableHeaderNames() {
	log.info("click on OperatorButton");
	OperatorButton.click();
	
	log.info("applying for loop");
		for (int i = 6; i <= 9; i++) {

			log.info("getting all the headerlist");
			List<WebElement> AllHeaders = OperatorButton.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[" + i + "]"));

			boolean status = true;

			for (WebElement header : AllHeaders) {

				String value = header.getText();
				// System.out.print(value + " ");
				log.info("checking condition");
				if (value.contains("Timings")) {
					status = true;
					break;
				}
			}
			log.info("checking wheather status is true or false");
			Assert.assertTrue(status);

		}
	}



}
