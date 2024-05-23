package org.piyush.basetest;

import org.piyush.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommanToAllTest {

    @BeforeMethod
    public void setUp(){
        DriverManager.inIt();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }

}
