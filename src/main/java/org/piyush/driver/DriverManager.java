package org.piyush.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class DriverManager {

    static WebDriver driver;

    @BeforeMethod
    static void inIt(){
        if(driver == null){
            driver = new EdgeDriver();
        }
    }

    @AfterMethod
    static void down(){
        if(driver!=null){
            driver.quit();
            driver = null;

        }
    }

}
