/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpanxion.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author james
 */
public class CareersPage extends XpanxionPageTemplate {

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

    public String getTitleText() {
        return this.driver.findElement(By.id("u15574-4")).getText();

    }

}