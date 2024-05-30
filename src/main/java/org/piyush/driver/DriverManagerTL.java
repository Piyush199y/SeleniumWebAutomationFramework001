package org.piyush.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.util.Objects;

public class DriverManagerTL {

    public static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    // public static WebDriver driver;  // Local/static variable

    public static void setDriver(WebDriver driverRef){
        dr.set(driverRef);
    }

    public static WebDriver getDriver(){
        return dr.get();
    }

    // Unload
    public static void unload(){
        dr.remove();
    }


    public static void init() {
        if (Objects.isNull(getDriver())) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--start-maximized");
            edgeOptions.addArguments("--guest");
            WebDriver driver = new EdgeDriver(edgeOptions);
            setDriver(driver);
        }
    }

    public static void down() {
        if(Objects.nonNull(getDriver())){
            getDriver().quit();
            unload();
        }
    }


}
