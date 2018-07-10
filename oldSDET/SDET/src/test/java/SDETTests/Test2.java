package SDETTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.xpanxion.sdet.CSVService;
import com.xpanxion.sdet.HomePage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author james
 */
public class Test2 {
    
    CSVService csvservice = new CSVService();

    final WebDriver driver = new ChromeDriver();
    final HomePage home = new HomePage(driver);
    public final String URL = "http://www.xpanxion.com/";
//    String CSV_PATH = "footerInfo.txt";

    @BeforeClass
    public void setUpClass() throws Exception {
//        thought it would be fun to maximize the window for this test
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        driver.get(URL);
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("site-logo")));
        Assert.assertEquals(home.getUrl(), "http://www.xpanxion.com/");
        Assert.assertEquals(home.getTitleText(), "OUR UNIQUE APPROACH:");
    }

    @DataProvider(name = "footerTest")
    public String[][] readCsv() {
        return csvservice.readCsv("footerInfo.txt");
    }
    
    @Test(dataProvider = "footerTest")
    public void footerTest(String id, String url, String pageText, String verifyID) {
        driver.findElement(By.id(id)).click();
        Assert.assertEquals(driver.getCurrentUrl(), url);
        (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id(verifyID)));
        Assert.assertEquals(driver.findElement(By.id(verifyID)).getText(), pageText);
    }
    
    @AfterClass
    public void tearDownClass() throws Exception {
        driver.quit();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}