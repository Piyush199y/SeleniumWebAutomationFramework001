package org.piyush.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class dashboardPage_POM {

    WebDriver driver;

    public dashboardPage_POM(){
        driver = new EdgeDriver();

    }

    By userNameOnDashboard = By.cssSelector("[data-qa='lufexuloga']");

    public String loggedInUserName(){
        driver.findElement(userNameOnDashboard);

        return null;
    }


}
