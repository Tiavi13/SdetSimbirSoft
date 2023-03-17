import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class OverviewPage {
    public WebDriver driver;
    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//*[contains(@name, 'finish')]")
    private WebElement finishButton;
    public void clickFinishButton() {
        finishButton.click(); }

}


