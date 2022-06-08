package test;

import org.testng.annotations.Test;

import phoenixpages.BasePage;
import phoenixpages.Loginpage;

public class LoginTest extends BasePage
{
Loginpage obj=new Loginpage();

@Test(priority = 1)
public void getlaunch()
{
	obj.getapplaunch();
}
@Test(priority = 2)
public void loginbymobile()
{
	
	obj.signinbymobile();
}
}