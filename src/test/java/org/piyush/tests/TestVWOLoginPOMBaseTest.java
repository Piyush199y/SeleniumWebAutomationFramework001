package org.piyush.tests;
import org.piyush.basetest.CommonToAllTest;
import org.piyush.pages.pageObjectModel.loginPage_POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLoginPOMBaseTest extends CommonToAllTest {
    @Test
    public void testLoginNegative(){
        loginPage_POM loginPagePom = new loginPage_POM();
        loginPagePom.openVWOUrl();
        String errorMsgtext = loginPagePom.loginVWOInvalidCreds();
        Assert.assertEquals(errorMsgtext, "Your email, password, IP address or location did not match");

    }
}
