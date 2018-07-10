package com.xpanxion.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer extends PgeObject {

    public Footer(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutLink() {
        return this.driver.findElement(By.id("u10570-4"));
    }

    public WebElement getOurstoryLink() {
        return this.driver.findElement(By.id("u10578-4"));
    }

    public WebElement getLocationsLink() {
        return this.driver.findElement(By.id("u10577-4"));
    }

    public WebElement getMissionLink() {
        return this.driver.findElement(By.id("u10576-4"));
    }

    public WebElement getNewsLink() {
        return this.driver.findElement(By.id("u10575-4"));
    }

    public AboutPage navToAboutPage() {
        this.getAboutLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("u3102-4")));
        return new AboutPage(this.driver);
    }

    public AboutPage navToOurstoryPage() {
        this.getOurstoryLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("u3102-4")));
        return new AboutPage(this.driver);
    }

    public LocationsPage navToLocationsPage() {
        this.getLocationsLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("u8973-4")));
        return new LocationsPage(this.driver);
    }

    public MissionPage navToMissionPage() {
        this.getMissionLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("u3113-4")));
        return new MissionPage(this.driver);
    }

    public NewsPage navToNewsPage() {
        this.getNewsLink().click();
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("u9113")));
        return new NewsPage(this.driver);
    }

}
