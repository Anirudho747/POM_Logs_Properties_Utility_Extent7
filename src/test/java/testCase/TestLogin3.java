package testCase;

import base.BaseClass;
import testScreen.FlightsScreen;
import testSteps.RahulShettySteps;
import testSteps.StaySteps;
import testSteps.ThingsToDoSteps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestLogin3 extends BaseClass {

    public FlightsScreen fs;
    public StaySteps ss;
    public ThingsToDoSteps ttds;
    public RahulShettySteps rss;
    static Logger logger;
    

    public TestLogin3()
    {
    	super();
    	ss = new StaySteps(driver);
    	ttds =new ThingsToDoSteps(driver);
    	rss = new RahulShettySteps(driver);
    	logger = LogManager.getLogger(TestLogin3.class);
    }
    
    @Test(enabled=true)
    public void first()
    {
    	
    	ExtentTest test = extent.createTest("Pehla");
    	logger.info("This is Info");
		logger.error("This is an error");
		logger.warn("This is a warning");
		logger.fatal("This is a fatal");
        ss.stays();
        test.log(Status.PASS, "Module Passed");
        test.log(Status.INFO, "Module Info");
    }
    
    @Test(enabled=true,priority=2)
    public void second()
    {
    	
    	ExtentTest test = extent.createTest("Dooja");
        logger.info("This is Info");
		logger.error("This is an error");
		logger.warn("This is a warning");
		logger.fatal("This is a fatal");
		ttds.thingsToDo();
		test.log(Status.PASS, "Module Passed");
        test.log(Status.WARNING, "Module Warning");
    }  
    
    @Test(enabled=true,priority=3)
    public void third()
    {
    	ExtentTest test = extent.createTest("Teeja");
    	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
    	rss.selectfirstfield();
    	logger.info("This is Info");
    	test.log(Status.PASS, "Module Passed");
        test.log(Status.INFO, "Module Info");
    }
    
    @Test(enabled=true,priority=4)
    public void fourth()
    {
    	ExtentTest test = extent.createTest("fourth");
//    	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//    	rss.selectfirstfield();
    	logger.info("This is Info");
    	test.log(Status.FAIL, "Module Crashed");
        test.log(Status.INFO, "Module Info");
    }
 

}
