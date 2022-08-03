package testSteps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Generics;
import testScreen.FlightsScreen;

public class FlightSteps extends FlightsScreen{

	public WebDriver driver;
	
	public FlightSteps(WebDriver driver)
	{
        PageFactory.initElements(driver, this);
	}
	
	public void flight()
	{
		oneWay.click();
		leavingFrom.click();
	//	origin.sendKeys("Ahmedabad");
		Generics.typeText(origin, "Ahmedabad");
		origin.sendKeys(Keys.ENTER);
	}
}
