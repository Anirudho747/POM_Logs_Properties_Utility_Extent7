package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonDriver {
	
	private static WebDriver driver;
	
	private SingletonDriver(){
		
	}

	public static WebDriver getSingleInstance()
	{
		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
		}
		return driver;
	}
	
}
