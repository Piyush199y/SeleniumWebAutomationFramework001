package org.piyush.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.piyush.driver.DriverManager;
import org.piyush.utils.PropertyReader;

import java.time.Duration;
import static org.piyush.driver.DriverManager.getDriver;

public class CommonToAllPage {

    public CommonToAllPage(){
    }

    public void openVWOUrl(){
        getDriver().get(PropertyReader.readyKey("url"));
    }


    public void clickElement(By by){
        getDriver().findElement(by).click();

    }

    public void enterInput(By by, String key){
        getDriver().findElement(by).sendKeys(key);

    }

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }

}
