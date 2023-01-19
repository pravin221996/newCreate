package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;

public class RegistrationPage extends Base {
	
	@FindBy(xpath="/html/body/div/div[2]/a")
	WebElement NewMemberLink;
	
	@FindBy(id="name")
	WebElement Email;
	
	@FindBy(xpath="/html/body/div/div[2]/form/div[5]/div/button")
	WebElement SignInButton;
	
	@FindBy(id="mobile")
	WebElement MobileNum;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="email")
	WebElement ValidEmail;
	

	@FindBy(xpath="/html/body/div/div[1]/a/b")
	WebElement JbkHeading;
	


	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void check_RegisPage(){
        log.info("click on NewMemberLink");
		NewMemberLink.click();
	
	} 
	public void check_NameTextBox(){
		
		log.info("giving input to email textbox");
		Email.sendKeys("2893289");
		log.info("click on SignInButton ");
		SignInButton.click();
		log.info("getting Text");
		String ActMsg = Email.getText();
		String ExpMsg = "user should enter name only in letters";
		
		log.info("compairing actual and expected");
		Assert.assertEquals(ActMsg, ExpMsg);

	}
	public void check_MobileTextBox(){
		log.info("giving input to mobile textbox");
	    MobileNum.sendKeys("pravin");
		log.info("click on SignInButton");
		SignInButton.click();
		String ActMsg1 = MobileNum.getText();
		String ExpMsg1 = "user should give input in digit";
		log.info("compairing actual and expected");
		Assert.assertEquals(ActMsg1, ExpMsg1);
	}

	public void check_EmailTextBox(){
		log.info("giving wronginput to email textbox");
		MobileNum.sendKeys("pravingmail.com");
		log.info("click on SignInButton");
		SignInButton.click();

		String ActMsg2 = MobileNum.getText();
		String ExpMsg2 = "user should enter email in valid form";
		log.info("compairing actual and expected");
		Assert.assertEquals(ActMsg2, ExpMsg2);

	}
	public void check_PasswordTextBox() {
		log.info("giving wronginput to password textbox");
		Password.sendKeys("Pravin123");
		log.info("click on SignInButton");
		SignInButton.click();
		
		String ActMsg3 = Password.getText();
		String ExpMsg3 = "user should enter valid password";
		log.info("compairing actual and expected");
		Assert.assertEquals(ActMsg3, ExpMsg3);

	}
	public void check_AddUserFunctionality() throws InterruptedException {
		
		log.info("feeling all the details and click on sign in button");
        Email.sendKeys("Pravin");
        MobileNum.sendKeys("77865426");
        ValidEmail.sendKeys("pravinpingle2@gmail.com");
        Password.sendKeys("Pravin@1234");
		SignInButton.click();

		Thread.sleep(5000);	
	}

	public void check_IfalreadyHaveMembership() {
		log.info("click on NewMemberLink ");
		NewMemberLink.click();
	}

	public void check_Heading() {
        log.info("getting text");
		String AcctHeading = JbkHeading.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		String ExpHeading = "Java By Kiran";
        log.info("compairing actual and expected");
		Assert.assertEquals(AcctHeading, ExpHeading);

	}
	
}
