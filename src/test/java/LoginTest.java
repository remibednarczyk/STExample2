import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    void prepare() {
        System.setProperty("webdriver.chrome.driver", "C:/workspace/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:/workspace/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/siiamanTest/login");
    }

    @Test
    public void shouldLogin() {

        driver.findElement(By.cssSelector("#emailInput")).sendKeys("rbednarczyk@pl.sii.eu");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("xxxxxx");
        driver.findElement(By.cssSelector("#login_button")).click();
    }


    @AfterMethod
    void shouldLogout() {
        driver.close();
    }
}
