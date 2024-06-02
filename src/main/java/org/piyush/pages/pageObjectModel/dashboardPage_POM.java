package org.piyush.pages.pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.piyush.base.CommonToAllPage;

public class dashboardPage_POM extends CommonToAllPage {

    public dashboardPage_POM(){
    }

    By userNameOnDashboard = By.cssSelector("[data-qa='lufexuloga']");

    public String loggedInUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();

    }


}
