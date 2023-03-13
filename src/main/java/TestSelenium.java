import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        var test = new ChromeDriver();
        test.get("https://www.saucedemo.com/");
        WebElement element = test.findElement(By.xpath("//input[@name='user-name']"));
        element.sendKeys("standard_user");
        WebElement element1 = test.findElement(By.xpath("//input[@name='password']"));
        element1.sendKeys("secret_sauce");
        WebElement button = test.findElement(By.xpath("//input[@name='login-button']"));
        button.click();
        WebElement addToCard = test.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        addToCard.click();
        WebElement addToCard1 = test.findElement(By.id("shopping_cart_container"));
        addToCard1.click();
        WebElement button1 = test.findElement(By.id("checkout"));
        button1.click();
        WebElement element2 = test.findElement(By.xpath("//input[@name='firstName']"));
        element2.sendKeys("test");
        WebElement element3 = test.findElement(By.xpath("//input[@name='lastName']"));
        element3.sendKeys("test");
        WebElement element4 = test.findElement(By.xpath("//input[@name='postalCode']"));
        element4.sendKeys("test");
        WebElement submit = test.findElement(By.name("continue"));
        submit.click();
        WebElement button2 = test.findElement(By.id("finish"));
        button2.click();



    }


    }

