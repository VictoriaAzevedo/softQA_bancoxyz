package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InstaciarDrive {


    protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void inicializarMetodo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void finalizar(){
        driver.quit();
    }

    public void esperarSegundos(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
