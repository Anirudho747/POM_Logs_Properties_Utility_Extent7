package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderUtil {

    Properties prop;
    FileInputStream fis;
    String brwser;
    FileOutputStream fos;
    String projectPath = System.getProperty("user.dir");

    public String getBrowser()
    {

        try {
            prop = new Properties();
            fis = new FileInputStream(projectPath+"/src/test/resources/cnfg.properties");
            prop.load(fis);
            brwser = prop.getProperty("browser");
        }
        catch (FileNotFoundException e) {
            e.getCause();
            e.getMessage();
            System.out.println("File Not Found");
        } catch (IOException e) {
            e.getCause();
            e.getMessage();
            System.out.println("File Not Loaded");
        }
        return brwser;
    }

    public String setBrowserChrome()
    {

        try {
            prop = new Properties();
            fos = new FileOutputStream(projectPath+"/src/test/resources/cnfg.properties");
            prop.setProperty("browser", "Chrome");
            prop.store(fos, null);
        }
        catch (FileNotFoundException e) {
            e.getCause();
            e.getMessage();
            System.out.println("File Not Found");
        } catch (IOException e) {
            e.getCause();
            e.getMessage();
            System.out.println("File Not Loaded");
        }
        return brwser;
    }

    public String setBrowserMozilla()
    {

        try {
            prop = new Properties();
            fos = new FileOutputStream(projectPath+"/src/main/resources/cnfg.properties");
            prop.setProperty("browser", "Mozilla");
            prop.store(fos, null);
        }
        catch (FileNotFoundException e) {
            e.getCause();
            e.getMessage();
            System.out.println("File Not Found");
        } catch (IOException e) {
            e.getCause();
            e.getMessage();
            System.out.println("File Not Loaded");
        }
        return brwser;
    }
}
