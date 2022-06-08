package phoenixpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BasePage 
{
	public static AndroidDriver<AndroidElement> driver;
	
//	public static AppiumDriverLocalService service;	
//
//	@BeforeTest
//	public void StartAppiumServer()
//	{
//		service=AppiumDriverLocalService.buildDefaultService();
//		service.start();
//	}
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws MalformedURLException, IOException
	{
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\confiq.properties");
	
		prop.load(fis);
		
		File appDir=new File("src/main/resources");
		File app =new File(appDir, (String) prop.get(appName));
		
		DesiredCapabilities caps =new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("deviceName"));
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		caps.setCapability("avd", "Pixel_2");
    	caps.setCapability("avdLaunchTimeout", "180000");
    	
		driver =new AndroidDriver<AndroidElement>(new URL ("http://0.0.0.0:4723/wd/hub"),caps);
		return driver;	
	}
	
//	@AfterTest
//	public void quitserver()
//	{
//		driver.close();
//		service.stop();
//	}
}