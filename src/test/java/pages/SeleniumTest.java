package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // Inicializa WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void goToFreeRangeTesters(){
        driver.get("https://www.freerangetesters.com/");
    }

    @AfterMethod
    public void tearDown(){
        // Cierra el navegador después de la prueba
        if (driver != null){
            driver.quit();
        }
    }
}

