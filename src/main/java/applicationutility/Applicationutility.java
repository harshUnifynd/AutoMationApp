package applicationutility;

import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import phoenixpages.BasePage;

public class Applicationutility extends BasePage
{
 public static void tapelement(int x, int y)
 {
	 TouchAction tc= new TouchAction(driver);
		//tc.tap(PointOption.point(944, 1647)).perform();
	 tc.tap(PointOption.point(x, y)).perform();

}
 public static void dragNdrop()
 {
	 TouchAction slide= new TouchAction(driver);
	 slide.press(PointOption.point(450,1640)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
	    .moveTo(PointOption.point(459,468)).release().perform(); }
}