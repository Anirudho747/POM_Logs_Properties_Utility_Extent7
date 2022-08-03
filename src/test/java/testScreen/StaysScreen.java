package testScreen;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.Generics;

public class StaysScreen{

    @FindBy(xpath = "//button[@aria-label='Going to']")
    @CacheLookup
	public WebElement destination;
	
	@FindBy(xpath = "//input[@id='location-field-destination']")
	@CacheLookup
	public WebElement cityName;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-in')]")
	@CacheLookup
	public WebElement check_In;
	
	@FindBy(xpath = "//span[text()='Flights']")
	@CacheLookup
	public WebElement flights;
}
