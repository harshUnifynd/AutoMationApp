package test;

import org.testng.annotations.Test;

import phoenixpages.BasePage;
import phoenixpages.ProfileSection;

public class Profilesectiontest extends BasePage
{
	ProfileSection obj=new ProfileSection();
	
	@Test(priority = 0)
	public void editprofilesection()
	{
		
		obj.editprofile();
	}
	@Test(priority = 1)
	public void profilesectionelements()
	{
		
		obj.profileelements();
	}
	}	

