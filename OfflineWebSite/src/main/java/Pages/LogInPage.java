package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import freemarker.log.Logger;

public class LogInPage {
	
	public static Logger log = Logger.getLogger("LogInPage");
	
	
	//WebElemnets
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement LogInBtn;

	@FindBy(xpath="/html/body/div/div[2]/a")
	WebElement Text_Center;
	
	@FindBy(xpath="/html/body/div/div[2]/form/div[1]/div")
	WebElement Email_Error;
	
	@FindBy(xpath="/html/body/div/div[2]/form/div[1]/div")
	WebElement Password_Error;
	
	@FindBy(xpath="//*[@id=\"email_error\"]")
	WebElement Wrong_Email;
	
	//parameterized Constructor
    public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    //Methods
    public void logInToAplication(String uname,String pass) {
    	username.sendKeys(uname);
    	password.sendKeys(pass);
    	LogInBtn.click();	
    }
    
    public boolean check_Email(String uname) throws Exception {
    	username.sendKeys(uname);
    	LogInBtn.click();
    	
        String ActualText = Email_Error.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
 		String expected_Text = "Enter email in valid format";

 		if(ActualText.equals(expected_Text)) {
 	       log.info(" Email_Error massage is displayed");
 	    return  true;
 		}else {
 			log.info("Email_Error massage is not displayed");
 			return false;
 		}
    }
	
    public boolean check_Password(String pass) throws Exception {
    	password.sendKeys(pass);
    	LogInBtn.click();
    	log.info("applying waits for 5 sec");
 		Thread.sleep(5000);

    	String ActualPassowrdmsg = Password_Error.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		String ExpectedPasswordMsgIs = "Please enter email";
        if(ActualPassowrdmsg.equals(ExpectedPasswordMsgIs)) {
        	log.info("Password_Error massage is displayed");
        	return true;
        }else {
        	log.info("Password_Error massage is not displayed");
        	return false;
        }

    }
   
    public boolean check_BlankEmail(String uname) throws Exception{
    	
    	username.sendKeys(uname);
    	LogInBtn.click();
    	log.info("applying waits for 5 sec");

 		Thread.sleep(5000);

    	String ActualEmailMsgIs = Email_Error.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		String ExpMsgForBlank = "Please enter email.";
		if(ActualEmailMsgIs.equals(ExpMsgForBlank)) {
        	log.info("BlankPassword_Error_Error massage is displayed");
        	return true;
        }else {
        	log.info("BlankPassword_Error_Error massage is not displayed");
        	return false;
        }

    }
    
    public boolean check_BlankPassword(String pass) throws Exception {
    	password.sendKeys(pass);
    	LogInBtn.click();
    	
    	log.info("applying waits for 5 sec");
 		Thread.sleep(5000);

    	
    	String ActualPassowrdmsg = Password_Error.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		String ExpectedPasswordMsgIs = "Please enter email";
		if(ActualPassowrdmsg.equals(ExpectedPasswordMsgIs)) {
        	log.info("BlankPassword_Error massage is displayed");
        	return true;
        }else {
        	log.info("BlankPassword_Error massage is not displayed");
        	return false;
        }
    }
    public boolean check_WrongEmailAsInput() throws Exception{
		
		logInToAplication("Kartik@gamil.com","1323287");
    	log.info("applying waits for 5 sec");

 		Thread.sleep(5000);
 		
		String ActResult = Wrong_Email.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		String Expresult = "Please enter email as kiran@gmail.com";
		if(ActResult.equals(Expresult)) {
        	log.info("Wrong_Email massage is displayed");
        	return true;
        }else {
        	log.info("Wrong_Email massage is not displayed");
        	return false;
        }
	}
    
    public void  check_NewMemberShip() {
    	Text_Center.click();
    }

}
