/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDETTests;

import com.xpanxion.sdet.ContactPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author james
 */
public class Test3 {

    final WebDriver driver = new FirefoxDriver();
    final ContactPage contact = new ContactPage(driver);
    public final String url = "http://www.xpanxion.com/contact.html";
    
    final String actualColor = "rgba(215, 36, 76, 1)";
    //public static final String ACTUAL_COLOR = "";

    @BeforeClass
    public void setUpClass() throws Exception {
        driver.get(url);
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("u8906-4")));
        Assert.assertEquals(contact.getTitleText(), "CONTACT US");
        Assert.assertEquals(contact.getUrl(), "http://www.xpanxion.com/contact.html");
        contact.clickSubmitButton();
    }
    
    @BeforeMethod
    public void setUpMethod() throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @Test
    public void verifyNameEmailPhoneColor(){
        Assert.assertEquals(contact.getNameColor(), actualColor);
        Assert.assertEquals(contact.getEmailColor(), actualColor);
        Assert.assertEquals(contact.getCellphoneColor(), actualColor);
    }

    @AfterClass
    public void tearDownClass() throws Exception {
        driver.quit();
    }

}
