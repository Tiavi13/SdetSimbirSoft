import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SuccessPage {
    public WebDriver driver;
    public SuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


    public void assertText(String text) {
        assertTrue(driver.getPageSource().contains(text));
    }
    public void assertUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
}