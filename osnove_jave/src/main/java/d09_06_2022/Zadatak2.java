package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
        String add = "//*[contains(@class, 'table table')]/tbody/tr[last()]/td[4]/a";
        driver.manage().window().maximize();

        driver.navigate().to(url);


        for (int i = 0; i < 5; i++) {
            driver.findElement(By.className("btn"))
                    .click();

            driver.findElement(By.xpath(add))
                    .click();

            driver.findElement(By.name("name"))
                    .sendKeys("Nikola Silje");

            driver.findElement(By.name("department"))
                    .sendKeys("QA");

            driver.findElement(By.name("phone"))
                    .sendKeys("(060) 506-1655");

            driver.findElement(By.xpath(add)).click();

            Thread.sleep(500);

        }


        driver.quit();
    }
}
