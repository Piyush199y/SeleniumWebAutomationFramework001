package org.piyush.pages.pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginPage_POM {

    WebDriver driver;

    public loginPage_POM (){    // THIS IS A CONSTRUCTOR
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

    }

    By username = By.id("login-username");
    By password = By.id("login-password");
    By submitButton = By.id("js-login-btn");
    By errorMsg = By.id("js-notification-box-msg");

    public String loginVWOInvalidCreds(){
        driver.findElement(username).sendKeys("admin");
        driver.findElement(password).sendKeys("admin");
        driver.findElement(submitButton).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return driver.findElement(errorMsg).getText();

    }

}