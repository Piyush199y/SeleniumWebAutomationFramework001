package org.piyush.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;

    }

    public static void inIt(){
        if(driver == null){
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            edgeOptions.addArguments("--guest");

            driver = new EdgeDriver(edgeOptions);
        }
    }

    public static void down(){
        if(driver!=null){
            driver.quit();
            driver = null;

        }
    }

}
