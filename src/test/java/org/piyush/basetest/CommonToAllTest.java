package org.piyush.basetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.piyush.driver.selenoid.DriverManagerSelenoid;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class CommonToAllTest {

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DriverManagerSelenoid.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManagerSelenoid.down();
    }

}
