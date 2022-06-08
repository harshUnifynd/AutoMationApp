package phoenixpages;

import io.appium.java_client.MobileElement;
import waitutility.WaitUtility;

public class HomePage extends BasePage
{
	public void clickonnotification()
	{
		try { 
			Thread.sleep(2000);
			MobileElement notificationbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgNotifications");
			notificationbtn.click();
			
			Thread.sleep(2000);
			MobileElement notificationbackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivProfileBack");
			notificationbackbtn.click();
			
		} catch (Exception e) {
			System.out.println("Exception in Notofication Element" +e);
		}
		
		
	}

	public void serachboxelements()
	{
		try {
			
			WaitUtility.implicitwait(2);
			MobileElement tapserachbox = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView");
			tapserachbox.click();
			
			Thread.sleep(2000);
			MobileElement serachallstore = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/etStoreSearch");
			serachallstore.sendKeys("nike");
			
			Thread.sleep(2000);
			MobileElement enterstore = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgStorePic1");
			enterstore.click();
			
			Thread.sleep(2000);
			MobileElement backonallstore = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivSIBack");
			backonallstore.click();
			
			Thread.sleep(2000);
			MobileElement exitserchbox = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/txtCancel");
			exitserchbox.click();
		}
		catch (Exception e) 
		{
			System.out.println("Exception in Serachboxelements" +e);
		}	
	}
	
	public void payNowElements()
	{
		try {
			
			MobileElement el1 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/cvPN");
			el1.click();
			
			MobileElement el2 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
			el2.click();
				
		} catch (Exception e) 
		{
			System.out.println("Exception in payNowElements " +e);
		}
		
	}
	
	public void planvisit()
	{
		try {
			
			MobileElement el1 = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/cvPL");
			el1.click();
			
			
		} catch (Exception e) {
			
		}
			
	}
	
	
}
