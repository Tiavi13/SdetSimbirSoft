import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class TestSeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("test");
        driver.findElement(By.name("continue")).click();
        driver.findElement(By.id("finish")).click();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
        assertEquals(expectedUrl, actualUrl);
        assertTrue(driver.getPageSource().contains("Thank you for your order!"));
        driver.close();
    }
}