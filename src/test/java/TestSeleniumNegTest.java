import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestSeleniumNegTest {
    public static LoginPage loginPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void loginTest() {
        loginPage.inputLogin("test");
        loginPage.inputPasswd("test");
        loginPage.clickLoginBtn();
        loginPage.assertText("Epic sadface: Username and password do not match any user in this service");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit(); }
}