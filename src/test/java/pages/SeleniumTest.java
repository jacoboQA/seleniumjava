package test.java.pages;

import org.openqa.selenium.WebDriver;

public class seleniumTest {
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

