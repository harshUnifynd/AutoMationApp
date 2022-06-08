package pageobject;

import java.io.IOException;
import java.net.MalformedURLException;

import phoenixpages.BasePage;

public class basics extends BasePage
{
public static void main(String[] args) throws MalformedURLException, IOException 
{
	driver=capabilities("PhoenixAppLocation");
}
}
