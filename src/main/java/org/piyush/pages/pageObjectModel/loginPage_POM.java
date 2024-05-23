package org.piyush.pages.pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.piyush.base.CommonToAllPage;

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
        enterInput(username, "admin");
        enterInput(password, "admin");
        clickElement(submitButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return driver.findElement(errorMsg).getText();

    }

}