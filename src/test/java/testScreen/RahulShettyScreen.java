package testScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RahulShettyScreen {
	
	@FindBy(id = "dropdown-class-example")
	@CacheLookup
	public WebElement dropDown;

}
