package org.piyush.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.piyush.pages.pageObjectModel.loginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOM {
    @Test
    public void testLoginPositive(){

        loginPage_POM loginPagePom = new loginPage_POM();
        String errorMsgtext = loginPagePom.loginVWOInvalidCreds();
        Assert.assertEquals(errorMsgtext, "Your email, password, IP address or location did not match");

    }

}
