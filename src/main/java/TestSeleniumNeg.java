import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumNeg {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        var test = new ChromeDriver();
        test.get("https://www.saucedemo.com/");
        WebElement element = test.findElement(By.xpath("//input[@name='user-name']"));
        element.sendKeys("test");
        WebElement element1 = test.findElement(By.xpath("//input[@name='password']"));
        element1.sendKeys("test");
        WebElement button = test.findElement(By.xpath("//input[@name='login-button']"));
        button.click();
    }
}