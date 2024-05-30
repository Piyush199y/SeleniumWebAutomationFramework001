package org.piyush.pages.pageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.piyush.base.CommonToAllPage;
import org.piyush.pages.pageObjectModel.dashboardPage_POM;
import org.piyush.utils.PropertyReader;

public class loginPage_PF extends CommonToAllPage {
    WebDriver driver;

    public loginPage_PF (WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }// THIS IS A CONSTRUCTOR


    // Page locators
    @FindBy (id = "login-username")
            private WebElement username;
    @FindBy(id = "login-password")
            private WebElement password;
    @FindBy(id = "js-login-btn" )
            private WebElement submitButton;
    @FindBy(id="js-notification-box-msg")
            private WebElement errorMsg;


    public String loginVWOInvalidCreds(){
//        enterInput(username, PropertyReader.readyKey("username"));
//        enterInput(password, "admin");
//        clickElement(submitButton);
//       presenceOfElement(errorMsg);
//        visibilityOfElement(errorMsg);
        return getElement(null).getText();

    }

    // Test 2
    public void loginToVWOWithValidCreds() {
//        enterInput(username, PropertyReader.readyKey("username"));
//        enterInput(password, PropertyReader.readyKey("password"));
//        clickElement(submitButton);
        // Redirect to Dashboard
    }

    public dashboardPage_POM afterLoginVWOValidCreds(){
        return new dashboardPage_POM();
    }

}
