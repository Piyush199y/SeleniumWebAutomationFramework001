package org.piyush.basetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.piyush.driver.DriverManager;
import org.piyush.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    @BeforeMethod
    public void setUp(){
        DriverManagerTL.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManagerTL.down();
    }

}
