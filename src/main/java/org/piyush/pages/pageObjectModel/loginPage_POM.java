package org.piyush.pages.pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.piyush.base.CommonToAllPage;
import org.piyush.utils.PropertyReader;

import static org.piyush.driver.DriverManager.getDriver;

public class loginPage_POM extends CommonToAllPage {

    WebDriver driver;

    public loginPage_POM (){    // THIS IS A CONSTRUCTOR
        super();

    }

    By username = By.id("login-username");
    By password = By.id("login-password");
    By submitButton = By.id("js-login-btn");
    By errorMsg = By.id("js-notification-box-msg");


    public String loginVWOInvalidCreds(){
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, "admin");
        clickElement(submitButton);
        presenceOfElement(errorMsg);
        visibilityOfElement(errorMsg);
        return getElement(errorMsg).getText();

    }

    // Test 2
        public void loginToVWOWithValidCreds() {
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, PropertyReader.readyKey("password"));
        clickElement(submitButton);
        // Redirect to Dashboard
    }

    public dashboardPage_POM afterLoginVWOValidCreds(){
        return new dashboardPage_POM();
    }


}