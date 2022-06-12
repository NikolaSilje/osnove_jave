package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    //  1.Zadatak
//    Napisati program koji:
//    ●	Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//    ●	Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice
//    i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//    ●	POMOC: Brisite elemente odozdo.
//    ●	(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.navigate().to(url);

        List<WebElement> iksici = driver.findElements(By.className("close"));
        Thread.sleep(2000);
        for (int i = 0; i < iksici.size(); i++) {
            iksici.get(i).click();
            Thread.sleep(2000);

            List<WebElement> elementi = driver.findElements(By.className("close"));
            if (elementi.size() > 0){
                System.out.println("Element je izbrisan.");
            } else {
                System.out.println("Element nije moguce izbrisati.");
            }
        }

        driver.quit();


    }
}
