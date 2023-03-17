import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CatalogPage {
    public WebDriver driver;
    public CatalogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@name, 'add-to-cart-sauce-labs-backpack')]")
    private WebElement addToCart;
    @FindBy(xpath = "//*[contains(@id, 'shopping_cart_container')]")
    private WebElement cartButton;

    public void clickAddToCartButton() {
        addToCart.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }
}