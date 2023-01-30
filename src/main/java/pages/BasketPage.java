package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasketPage extends BasePage {
    private final By basket = By.xpath("//rz-cart[@class='header-actions__component']");
    private final By productCart = By.xpath("//div[@class='cart-product__body']");
    private final By cartProductActions = By.xpath(".//button[@class='button button--white button--small popup-menu__toggle popup-menu__toggle--context']");
    private final By deleteProduct = By.xpath(".//ul[@class='popup-menu__actions popup-menu__actions--context']");

    public BasketPage openBasket() {
        $(basket).click();
        return this;
    }

    public ElementsCollection getProducts() {
        return $$(productCart);
    }

    public void cleanBasket(ElementsCollection productsCarts) {
        if (productsCarts.size() == 0) {
            System.out.println("Cline");
        }
        else {
            for(SelenideElement productCart : productsCarts) {
                productCart.find(cartProductActions).click();
                productCart.find(deleteProduct).click();
            }
        }
    }
}

