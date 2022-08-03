package testSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Generics;
import testScreen.RahulShettyScreen;

public class RahulShettySteps extends RahulShettyScreen{
	
public WebDriver driver;
	
	public RahulShettySteps(WebDriver driver)
	{
        PageFactory.initElements(driver, this);
	}
	
	public void selectfirstfield()
	{
		Generics.selectDropDownValue(dropDown, "index", "1");
	}

}
