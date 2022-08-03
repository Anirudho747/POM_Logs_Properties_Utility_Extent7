package testScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FlightsScreen {

	@FindBy(xpath = "//span[text()='One-way']")
	@CacheLookup
	public WebElement oneWay;
	
	@FindBy(xpath = "//button[@aria-label='Leaving from']")
	@CacheLookup
	public WebElement leavingFrom;
	
	@FindBy(xpath = "//*[@id='location-field-leg1-origin']")
	@CacheLookup
	public WebElement origin;
}
