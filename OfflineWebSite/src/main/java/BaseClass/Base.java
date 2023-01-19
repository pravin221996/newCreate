package BaseClass;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import freemarker.log.Logger;

public class Base {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	public static Logger log = Logger.getLogger("Base");

	public Base() {
		driver = new ChromeDriver();
	}

	public String readProperty(String key) throws Exception {

		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";
		fis = new FileInputStream(path);
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public void Login() {
		
		driver.findElement(By.xpath("//div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"w13\"]/li[2]/a")).click();
        driver.findElement(By.xpath("//input[@id='loginform-username']")).sendKeys("pravin");
        driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("Pro@13248167");
        driver.findElement(By.xpath("//button[@id='savebutton']")).click();
		
	}

	public WebDriver startApplication() throws Exception {
		driver.get(readProperty("url"));
		log.info(" ******Maxmizing window******");

		driver.manage().window().maximize();
		log.info(" ******Applying Waits******");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		log.info("..User log in JBKofiline Apllication..");
		return driver;
	}

	public WebDriver initialization() throws Exception {
		
		log.info("Reading Property file for getting browser name");

		if (readProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			startApplication();
			log.info("Opening Browser as found in file");
			log.info("Opening Chrome Browser");
			return driver;
		} else {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new ChromeDriver();
			startApplication();
			log.info("Opening Browser as found in file");
			log.info("Opening Chrome Browser");

			return driver;
		}
	}

	public void reportUnit() {
		
		report = new ExtentReports();
		String path = System.getProperty("user.dir") + "/target/Extentreport.html";
		spark = new ExtentSparkReporter(path);
		report.attachReporter(spark);

	}

}
