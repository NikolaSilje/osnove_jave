package d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        File slika0 = new File("src/main/resources/skrinsottttttt.png");
        File slika1 = new File("src/main/resources/front_nikola_vasiljevic.jpg");
        File slika4 = new File("src/main/resources/back_Nikola_Vasiljevic.jpg");
        File slika3 = new File("src/main/resources/right_Nikola_Vasiljevic.jpg");
        File slika2 = new File("src/main/resources/left_Nikola_Vasiljevic.jpg");

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        String useOnlyoneSide = "//*[text()='Use One Side Only']";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        ArrayList<File> slike = new ArrayList<>();
        slike.add(slika0);
        slike.add(slika1);
        slike.add(slika2);
        slike.add(slika3);
        slike.add(slika4);
        slike.add(slika0);
//        driver
//                .findElement(By.xpath("//*[@alt='image 1']"))
//                .click();
//        driver
//                .findElement(By.xpath("//*[text()='+ Add photo']"))
//                .click();
//        driver.findElement(By.id("imageUpload")).sendKeys(slika_front.getAbsolutePath());
//        wait.until(ExpectedConditions.numberOfElementsToBe
//                (By.xpath("//*[contains(@class, 'sc-gKXOVf haLJiC')]"), 1));
//        driver
//                .findElement(By.xpath("//*[@loading='lazy']"))
//                .click();
//        driver.
//                findElement(By.xpath(useOnlyoneSide)).
//                click();

        for (int i = 1; i < slike.size() - 1; i++) {
            driver
                    .findElement(By.xpath("//*[@alt='image "+ i +"']"))
                    .click();
            driver
                    .findElement(By.xpath("//*[text()='+ Add photo']"))
                    .click();
            driver.findElement(By.id("imageUpload")).sendKeys(slike.get(i).getAbsolutePath());

            wait.until(ExpectedConditions.numberOfElementsToBe(By.
                    xpath("//*[contains(@class, 'sc-gKXOVf haLJiC')]"),i));
            driver
                    .findElement(By.xpath("//*[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img"))
                    .click();
            driver.
                    findElement(By.xpath(useOnlyoneSide))
                    .click();
        }

        driver
                .findElement(By.xpath("//*[@type='submit']"))
                .click();

//
        String error = driver.findElement(By.xpath("//*[@action='error']")).getAttribute("action");

        if(error.equals("error")){
            System.out.println("Verifikovano je postojanje greske.");
        }else{
            System.out.println("Verifikacija je bezuspesna.");
        }

        driver.quit();



        }

    }

