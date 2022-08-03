package testScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThingToDoScreen {
	
	public WebDriver driver;

	@FindBy(xpath = "//span[text()='Things to do']")
	@CacheLookup
	public WebElement thingsToDo;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	public WebElement submit;
	
	

}
