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
public class ApproachPage extends XpanxionPageTemplate {

    public ApproachPage(WebDriver driver) {
        super(driver);
    }

    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

    public String getTitleText() {
        return this.driver.findElement(By.id("u3249-4")).getText();
    }

}
