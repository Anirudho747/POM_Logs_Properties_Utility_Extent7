package testSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Generics;
import testScreen.ThingToDoScreen;

public class ThingsToDoSteps extends ThingToDoScreen{

	public WebDriver driver;
	
	public ThingsToDoSteps(WebDriver driver)
	{
        PageFactory.initElements(driver, this);
	}
	
	public void thingsToDo()
	{
		Generics.clickElement(thingsToDo);
		Generics.clickElement(submit);
	}
	
}
