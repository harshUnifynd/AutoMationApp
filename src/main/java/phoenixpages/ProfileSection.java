package phoenixpages;

import java.time.Duration;

import applicationutility.Applicationutility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ProfileSection extends BasePage
{
	public void editprofile()
	{
		try {
			Thread.sleep(4000);
		    MobileElement userbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgUser");
			userbtn.click();
		    
			Thread.sleep(2000);
		    MobileElement arrrowbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgRightArrow");
		    arrrowbtn.click();
		    
		  
		    MobileElement editbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgEditName");
		    editbtn.click();
			
		
		    MobileElement editfirstname=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/edtTxtFirstName");
		    editfirstname.clear();
		    editfirstname.sendKeys("harsh");
		    
		 
		    MobileElement editlastname=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/edtTxtLastName");
		    editlastname.clear();
		    editlastname.sendKeys("johri");
			
		    Thread.sleep(2000);
		    MobileElement savebtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnSaveDetails");
		    savebtn.click();
		    
		    Thread.sleep(2000);
		    MobileElement maileditbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgEditEmail");
		    maileditbtn.click();
		    
		    
		    MobileElement maileditbtn1=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/edtTxtEmail");
		    maileditbtn1.clear();
		    maileditbtn1.sendKeys("testing@gmail.com");
		    
		    Thread.sleep(2000);
		    MobileElement mailsavebtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnSaveDetails");
		    mailsavebtn.click();
		    
		    Thread.sleep(2000);
		    MobileElement exitmail=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/touch_outside");
		    exitmail.click();
		   
		    Thread.sleep(2000);
		    MobileElement editgenderbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgEditGender");
		    editgenderbtn.click();
		    
		    Thread.sleep(2000);
		    MobileElement selectgenderbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/tvMale");
		    selectgenderbtn.click();
		    
		    try {
		    
		    	
		    	TouchAction t =new TouchAction(driver);
			    t.press(PointOption.point(494,1666)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
			    .moveTo(PointOption.point(498,805)).release().perform();
				
			} catch (Exception e) {
				System.out.println("Exception in swipe" +e);
			}
		    
		    
		    Thread.sleep(2000);
		    MobileElement editbirthdaybtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgEditBirthday");
		    editbirthdaybtn.click();
		    
		    Thread.sleep(2000);
		    MobileElement datepickerwheel=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/llBirthdayPicker");
		   
		    MobileElement datepicker=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/daysOfMonthPicker");
		    datepicker.click();


	        MobileElement datepickermonth=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/monthPicker");
		    datepickermonth.click();
		    
		    MobileElement datepickeryear=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/yearPicker");
		    datepickeryear.click();
		    
		    MobileElement savebirthdaybtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnSaveDetails");
		    savebirthdaybtn.click();
		    
		    Thread.sleep(2000);
		    MobileElement editanniverserybtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/imgEditAnniversary");
		    editanniverserybtn.click();
		    
		    Thread.sleep(2000);
		    MobileElement anniverserypickerwheel=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/llAnniversaryPicker");
		 
		    MobileElement annidatepicker=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/daysOfMonthPicker");
		    annidatepicker.click();


	        MobileElement annidatepickermonth=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/monthPicker");
	        annidatepickermonth.click();
		    
		    MobileElement annidatepickeryear=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/yearPicker");
		    annidatepickeryear.click();
		    
		    MobileElement saveanniverserybtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/btnSaveDetails");
		    saveanniverserybtn.click();
			
		    Thread.sleep(2000);
		    MobileElement profilebackbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivProfileBack");
		    profilebackbtn.click();
			
			
			
		} catch (Exception e) {
			
			System.out.println("Exception in profileeditpages" +e);
			
		}
	}
	 public void profileelements()
	 {
		 try {
			 Thread.sleep(4000);
			    MobileElement giftcardbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clGiftCard");
			    giftcardbtn.click();
			    
			    Thread.sleep(4000);
			    MobileElement giftcardbcakbtn=(MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
			    giftcardbcakbtn.click();
			    
			    Thread.sleep(4000);
			    MobileElement scratchcardbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clScratchCardHistory");
			    scratchcardbtn.click();
			    
			    Thread.sleep(4000);
			    MobileElement scratchcardbackbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivScratchHistoryBack");
			    scratchcardbackbtn.click();
			    
			    Thread.sleep(4000);
			    MobileElement fortunewheelbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clSpinWheelHistory");
			    fortunewheelbtn.click();
			    
			    Thread.sleep(4000);
			    MobileElement fortunewheelbackbtn=(MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivScratchHistoryBack");
			    fortunewheelbackbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement offerbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clCoupons");
			    offerbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement offerbackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivBack");
			    offerbackbtn.click();
			    
			    Thread.sleep(4000);
			    Applicationutility.dragNdrop();
//			    TouchAction dragNdrop =new TouchAction(driver);
//			    dragNdrop.press(PointOption.point(450,1640)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
//			    .moveTo(PointOption.point(459,468)).release().perform();
//			    
			    Thread.sleep(2000);
			    MobileElement parkingbookingbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clParkingHistory");
			    parkingbookingbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement parkingbookingbackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivProfileBack");
			    parkingbookingbackbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement paymenthistorybtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clTransactionHistory");
			    paymenthistorybtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement paymenthistorybackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivProfileBack");
			    paymenthistorybackbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement scanhistorybtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clScanHistory");
			    scanhistorybtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement scanhistorybackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivScanHistoryBack");
			    scanhistorybackbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement favstoresbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clFavStores");
			    favstoresbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement favstoresbackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivProfileBack");
			    favstoresbackbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement activitiesbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clYourActivities");
			    activitiesbtn.click();
			    
			    Thread.sleep(2000);
			    MobileElement activitiesbackbtn = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/ivProfileBack");
			    activitiesbackbtn.click();
			    
			    MobileElement logout = (MobileElement) driver.findElementById("com.unifynd.lite.frt.pro:id/clLogout");
			    logout.click();
			    
			
		} catch (Exception e) {
			System.out.println("Exception in profileelements" +e);
		}
	 }

}
