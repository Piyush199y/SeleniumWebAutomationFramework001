package org.piyush.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;

    }

    public static void inIt(){
        if(driver == null){
            driver = new EdgeDriver();
        }
    }

    public static void down(){
        if(driver!=null){
            driver.quit();
            driver = null;

        }
    }

}
