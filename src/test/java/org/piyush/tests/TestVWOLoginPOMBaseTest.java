package org.piyush.tests;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.piyush.basetest.CommonToAllTest;
import org.piyush.pages.pageObjectModel.dashboardPage_POM;
import org.piyush.pages.pageObjectModel.loginPage_POM;
import org.piyush.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {


    @Test (groups = "Sanity", priority = 1)
    public void testLoginNegative(){
        loginPage_POM loginPagePom = new loginPage_POM();
        loginPagePom.openVWOUrl();
        String errorMsgtext = loginPagePom.loginVWOInvalidCreds();
        Assert.assertEquals(errorMsgtext, "Your email, password, IP address or location did not match");
        Assertions.assertThat(errorMsgtext).isNotNull().isNotBlank().contains(PropertyReader.readyKey("error_message"));


    }

    @Test (groups = "Sanity", priority = 2)
    public void testLoginPositive(){
        loginPage_POM loginPagePom = new loginPage_POM();
        loginPagePom.openVWOUrl();
        loginPagePom.loginToVWOWithValidCreds();

        dashboardPage_POM dashboardPagePom = loginPagePom.afterLoginVWOValidCreds();
        dashboardPagePom.loggedInUserName();
        String expected_username = dashboardPagePom.loggedInUserName();

        Assert.assertEquals(expected_username, PropertyReader.readyKey("expected_username"));

        Assertions.assertThat(expected_username).isNotNull().isNotBlank().contains(PropertyReader.readyKey("expected_username"))
        ;


    }

    @Test (groups = "Sanity" , priority = 3)
    public void testDashboardPage(){
        System.out.println("Selenoid test");

    }


}
