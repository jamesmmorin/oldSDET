package com.xpanxion.sdet;

import com.xpanxion.sdet.XpanxionPageTemplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends XpanxionPageTemplate {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

    public String getTitleText() {
        return this.driver.findElement(By.cssSelector("#pgc-578-0-0 .widget-title")).getText();

    }
}