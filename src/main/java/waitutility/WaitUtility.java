package waitutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import phoenixpages.BasePage;

public class WaitUtility extends BasePage
{
public static void implicitwait(int time)
{
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}
public static void explicitwait(int time,WebElement web)
{
	
}
}
