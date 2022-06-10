package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        String lokator = "//*[contains(@id, 'rating-star')]";

        driver.manage().window().maximize();

        driver.navigate().to(url);

        List<WebElement> stars = driver.findElements(By.xpath(lokator));

        System.out.println("Unesite zeljeni broj zvezdice u rasponu od 1 do 5: ");
        int n = s.nextInt();

 //       driver.findElement(By.id("rating-star-" + n)).click();    // I nacin

        Thread.sleep(2000);

        for (int i = 0; i < stars.size(); i++) {
            stars.get(n-1).click();
        }
//                                                                      II nacin
        driver.quit();



    }
}
