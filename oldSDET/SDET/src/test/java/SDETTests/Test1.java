package SDETTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.xpanxion.sdet.AboutPage;
import com.xpanxion.sdet.ApproachPage;
import com.xpanxion.sdet.CareersPage;
import com.xpanxion.sdet.ContactPage;
import com.xpanxion.sdet.HomePage;
import com.xpanxion.sdet.ServicesPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class Test1 {

    final WebDriver driver = new ChromeDriver();
    final HomePage home = new HomePage(driver);
    public final String url = "http://www.xpanxion.com";

    @BeforeMethod
    public void setUpMethod() throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("panel-578-0-0-0")));
        Assert.assertEquals(home.getUrl(), "http://www.xpanxion.com/");
        Assert.assertEquals(home.getTitleText(), "OUR UNIQUE APPROACH:");
    }

    @Test (priority = 1)
    public void AboutPageTest() {
        AboutPage aboutPage = home.getHeader().navToAboutPage();
        Assert.assertEquals(aboutPage.getUrl(), "http://www.xpanxion.com/about/");
        Assert.assertEquals(aboutPage.getTitleText(), "ABOUT US");
    }

    @Test (priority = 2)
    public void ApproachPageTest() {
        ApproachPage approachPage = home.getHeader().navToApproachPage();
        Assert.assertEquals(approachPage.getUrl(), "http://www.xpanxion.com/approach/");
        Assert.assertEquals(approachPage.getTitleText(), "APPROACH");
    }

    @Test (priority = 3)
    public void ServicesPageTest() {
        ServicesPage servicesPage = home.getHeader().navToServicesPage();
        Assert.assertEquals(servicesPage.getUrl(), "http://www.xpanxion.com/services/");
        Assert.assertEquals(servicesPage.getTitleText(), "SERVICES");
    }

    @Test (priority = 4)
    public void CareersPageTest() {
        CareersPage careersPage = home.getHeader().navToCareersPage();
        Assert.assertEquals(careersPage.getUrl(), "http://www.xpanxion.com/careers/");
        Assert.assertEquals(careersPage.getTitleText(), "CAREERS");
    }

    @Test (priority = 5)
    public void ContactPageTest() {
        ContactPage contactPage = home.getHeader().navToContactPage();
        Assert.assertEquals(contactPage.getUrl(), "http://www.xpanxion.com/contact/");
        Assert.assertEquals(contactPage.getTitleText(), "CONTACT US");
    }

    @AfterClass
    public void tearDownClass() throws Exception {
        driver.quit();
    }

}
