package d14_06_2022;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;

import java.time.Duration;
import java.util.List;

public class BootstrapTableTests {

    //Base url: https://s.bootsnipp.com
    //Test #1: Edit Row
    //Podaci:
    //First Name: ime polaznika
    //Last Name: prezime polaznika
    //Middle Name: srednje ime polanzika

    //Koraci:
    //Ucitati stranu /iframe/K5yrx
    //Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
    //Klik na Edit dugme prvog reda
    //Sacekati da dijalog za Editovanje bude vidljiv
    //Popuniti formu podacima.
    //Bice potrebno da pre unosa tekst pobrisete tekst koji vec postoji, za to se koristi metoda clear. Koristan link
    //Klik na Update dugme
    //Sacekati da dijalog za Editovanje postane nevidljiv
    //Verifikovati da se u First Name celiji prvog reda tabele javlja uneto ime
    //Verifikovati da se u Last Name celiji prvog reda tabele javlja uneto prezime
    //Verifikovati da se u Middle Name celiji prvog reda tabele javlja uneto srednje ime
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske
    private String baseUrl = "https://s.bootsnipp.com";
    private WebDriver driver;

    private String firstName = "Nikola";
    private String middleName = "Aleksandar";
    private String lastName = "Vasiljevic";


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
    }

    @Test(priority = 10)
    public void editRow() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR]Page title should be 'Table with Edit and Update Data - Bootsnipp.com'.");

        driver
                .findElement(By.xpath("//*[@id='d1']/td[5]/button"))
                .click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("up")));

        driver.findElement(By.id("fn")).clear();
        driver.findElement(By.id("ln")).clear();
        driver.findElement(By.id("mn")).clear();

        driver.findElement(By.id("fn")).sendKeys(firstName);
        driver.findElement(By.id("ln")).sendKeys(lastName);
        driver.findElement(By.id("mn")).sendKeys(middleName);

        driver.findElement(By.id("up")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.
                xpath("//*[text()='Update Data']")));

        Assert.assertEquals(driver.findElement(By.id("f1")).getText(),
                firstName,
                "[Error]First name table data should be 'Nikola'");
        Assert.assertEquals(driver.findElement(By.id("l1")).getText(),
                lastName,
                "[Error]First name table data should be 'Vasiljevic'");
        Assert.assertEquals(driver.findElement(By.id("m1")).getText(),
                middleName,
                "[Error]First name table data should be 'Aleksandar'");
    }
    //Test #2: Delete Row
    //Podaci:
    //First Name: ime polaznika
    //Last Name: prezime polaznika
    //Middle Name: srednje ime polanzika
    //Koraci:
    //Ucitati stranu /iframe/K5yrx
    //Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
    //Klik na Delete dugme prvog reda
    //Sacekati da dijalog za brisanje bude vidljiv
    //Klik na Delete dugme iz dijaloga
    //Sacekati da dijalog za Editovanje postane nevidljiv
    //Verifikovati da je broj redova u tabeli za jedan manji
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske

    @Test(priority = 20)
    public void deleteRow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.navigate().to(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR]Page title should be 'Table with Edit and Update Data - Bootsnipp.com'.");

        driver
                .findElement(By.xpath("//*[@id='d1']/td[6]/button"))
                .click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.
                xpath("//*[text()='Delete Data']")));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("del")));

        driver.findElement(By.id("del")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("del")));

//        if(wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//tbody"), 2));

        List<WebElement> row = driver.findElements(By.xpath("//*[text()='Vasiljevic']"));

        Assert.assertEquals(row.size(),
                0,
                "[Error]The row is not deleted");
    }
//    Test #3: Take a Screenshot
//    Koraci:
//    Ucitati stranu  /iframe/K5yrx
//    Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
//    Kreirati screenshot stranice.
//    Koristan link https://www.guru99.com/take-screenshot-selenium-webdriver.html
//    Fajl cuvajte na putanji gde su vam bile slike od proslog domaceg.
//    Na putanji: src/main/resources/nazivslike.png

    @Test(priority = 30)
    public void takeAScreenshot() throws Exception {
        driver.navigate().to(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR]Page title should be 'Table with Edit and Update Data - Bootsnipp.com'.");

        takeSnapShot(driver, "src/main/resources/SS.png");

    }

    public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile = new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }


}
