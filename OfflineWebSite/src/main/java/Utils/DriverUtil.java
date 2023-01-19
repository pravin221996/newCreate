package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DriverUtil {
	public static WebDriver driver;
	
	public static  String getScreenshot(String name) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("C:\\EclipseIDE\\AutomationTesting\\OfflineWebSite\\target"+name+".jpg");
		File dest =new File(path);
	
		FileUtils.copyFile(src, dest);

		return path;
	}	


}