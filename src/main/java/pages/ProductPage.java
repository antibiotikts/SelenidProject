package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ProductPage extends BasePage {
    private final By product = By.xpath("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']");
    private final By basketClose = By.xpath("//button[@class='modal__close']");

    public void addOnBasket() {
        actions().moveToElement($(product)).click().perform();
        //$(product).click();
        try {
            $(basketClose).click();
        } finally {
        }
    }
}
