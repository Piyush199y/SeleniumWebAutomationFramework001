package org.piyush.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin {

    @Test
    public void testLoginPositive(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


    }

}
