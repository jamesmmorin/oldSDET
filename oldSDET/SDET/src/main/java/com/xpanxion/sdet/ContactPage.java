/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpanxion.sdet;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author james
 */
public class ContactPage extends XpanxionPageTemplate {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

    public String getTitleText() {
        return this.driver.findElement(By.id("u8906-4")).getText();
    }

    public WebElement getSubmitLink() {
        return this.driver.findElement(By.id("u1679-17"));
    }

    public ContactPage clickSubmitButton() {
        this.getSubmitLink().click();
        return new ContactPage(this.driver);
    }

    public String getNameColor() {
        return this.driver.findElement(By.id("widgetu1680_input")).getCssValue("color");
    }

    public String getEmailColor() {
        return this.driver.findElement(By.id("widgetu1684_input")).getCssValue("color");
    }

    public String getCellphoneColor() {
        return this.driver.findElement(By.id("widgetu1691_input")).getCssValue("color");
    }
}
