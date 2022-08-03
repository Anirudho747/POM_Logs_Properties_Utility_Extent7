package testSteps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Generics;
import testScreen.StaysScreen;

public class StaySteps extends StaysScreen{

	public WebDriver driver;
	
	public StaySteps(WebDriver driver)
	{
        PageFactory.initElements(driver, this);
	}
	
	public void stays()
	{
		Generics.clickElement(destination);
		Generics.typeText(cityName,"Daman");
		Generics.typeKeys(cityName, Keys.ENTER);
		Generics.clickElement(flights);

	}
	
}
