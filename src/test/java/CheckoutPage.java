import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CheckoutPage {
    public WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//*[contains(@name, 'firstName')]")
    private WebElement firstFild;
    @FindBy(xpath = "//*[contains(@name, 'lastName')]")
    private WebElement lastFild;
    @FindBy(xpath = "//*[contains(@name, 'postalCode')]")
    private WebElement postalFild;
    @FindBy(xpath = "//*[contains(@name, 'continue')]")
    private WebElement continueBtn;

    public void firstNameInput(String login) {
        firstFild.sendKeys(login); }
    public void lastNameInput(String login) {
        lastFild.sendKeys(login); }
    public void postalCodeInput(String login) {
        postalFild.sendKeys(login); }
    public void clickContinueButton() {
        continueBtn.click(); } }