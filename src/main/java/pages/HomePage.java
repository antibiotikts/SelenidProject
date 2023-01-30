package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class HomePage extends BasePage {
    private final SelenideElement sidebar = $(By.xpath("//div[@class='menu-wrapper menu-wrapper_state_static ng-star-inserted']"));
    private final By searchLine = By.xpath("//input[@name='search']");
    private final By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    private final By catalogButton = By.id("fat-menu");
    private final By sneakers = By.xpath("//a[contains(@href, 'mugskie-krossovki')]");
    private final By shoesClothes = By.xpath("//a[contains(@href, 'shoes_clothes')]");
    private final By laptopAndPc = By.xpath(".//a[contains(@href, 'computers-notebooks')]");

    public HomePage searchProduct(String product) {
        $(searchLine).setValue(product);
        $(searchButton).click();
        return this;
    }

    public HomePage searchByCatalog() {
        $(catalogButton).click();
        actions().moveToElement($(shoesClothes)).perform();
        $(sneakers).click();
        return this;
    }

    public void searchAndAddProduct() {
       sidebar.find(laptopAndPc).click();
    }
}
