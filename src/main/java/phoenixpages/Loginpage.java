package phoenixpages;

import java.util.concurrent.TimeUnit;

import applicationutility.Applicationutility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;

public class Loginpage extends BasePage
{
  public void getapplaunch()
  {
	try {
		
		driver=capabilities("PhoenixAppLocation");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
		
		MobileElement PickLocation = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnPickMall");
		PickLocation.click();
		
		MobileElement Locate = (MobileElement) driver.findElementByClassName("android.widget.Button");
		Locate.click();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		MobileElement SelectCity = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clCity");
		SelectCity.click();
		
		
		MobileElement SelectMall = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/mall_2");
		SelectMall.click();
		
		
	} catch (Exception e) 
	{
		System.out.println("Exception in Getlaunch");
	}
	
	
}

public void signinbymobile()
{
	try {
		
		MobileElement Mobno = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnContinue");
		Mobno.click();
		
		
		
		MobileElement Mobno1 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/etMobileNumber");
		Mobno1.click();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Mobno1.sendKeys("9717445211");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Applicationutility.tapelement(944,1647);
		
//		TouchAction tc= new TouchAction(driver);
//		tc.tap(PointOption.point(944, 1647)).perform();

		
		MobileElement verifybtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnVerify");
		verifybtn.click();
		
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		MobileElement verifyotp1 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_1");
		verifyotp1.sendKeys("4");
		
		MobileElement verifyotp2 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_2");
		verifyotp2.sendKeys("4");
		
		MobileElement verifyotp3 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_3");
		verifyotp3.sendKeys("5");
		
		MobileElement verifyotp4 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_4");
		verifyotp4.sendKeys("2");
		
		MobileElement verifyotp5 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_5");
		verifyotp5.sendKeys("1");
		
		MobileElement verifyotp6 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/et_otp_6");
		verifyotp6.sendKeys("1");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		MobileElement verifyotpbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnVerify");
		verifyotpbtn.click();
		
		
	} catch (Exception e) {
		System.out.println("Exception in LoginByMobile" +e);
		
	}
}

}



