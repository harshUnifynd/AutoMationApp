package test;

import org.testng.annotations.Test;

import phoenixpages.BasePage;
import phoenixpages.HomePage;

public class HomePageTest extends BasePage
{
	HomePage ob=new HomePage();

@Test(priority = 0)
public void editprofilesection()
{
	
	ob.clickonnotification();
}
@Test(priority = 1)
public void profilesectionelements()
{
	
	ob.serachboxelements();
}
}	