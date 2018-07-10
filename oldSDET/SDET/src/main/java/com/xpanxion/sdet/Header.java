package com.xpanxion.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header extends PgeObject {

    public Header(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutLink() {
        return this.driver.findElement(By.id("menu-item-1077"));
    }

    public WebElement getApproachLink() {
        return this.driver.findElement(By.id("menu-item-2026"));
    }

    public WebElement getServicesLink() {
        return this.driver.findElement(By.id("menu-item-1092"));
    }

    public WebElement getCareersLink() {
        return this.driver.findElement(By.id("menu-item-1081"));
    }

    public WebElement getContactLink() {
        return this.driver.findElement(By.id("menu-item-2657"));
    }

    public AboutPage navToAboutPage() {
        this.getAboutLink().click();
            (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-1077")));
        return new AboutPage(this.driver);
    }

    public ApproachPage navToApproachPage() {
        this.getApproachLink().click();
            (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-2026")));
        return new ApproachPage(this.driver);
    }

    public ServicesPage navToServicesPage() {
        this.getServicesLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-1092")));
        return new ServicesPage(this.driver);
    }

    public CareersPage navToCareersPage() {
        this.getCareersLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-1081")));
        return new CareersPage(this.driver);
    }

    public ContactPage navToContactPage() {
        this.getContactLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-2657")));
        return new ContactPage(this.driver);
    }

}
