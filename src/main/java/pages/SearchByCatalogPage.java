package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchByCatalogPage extends BasePage {
    private final SelenideElement productCart = $(By.xpath("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted']"));
    private final SelenideElement sortSidebar = $(By.xpath("//rz-filter-stack[@class='ng-star-inserted']"));
    private final By hard = By.xpath("//a[@href='https://hard.rozetka.com.ua/ua/']");
    private final By memory = By.xpath("//a[contains(@href, 'memory')]");
    private final By salesman = By.xpath(".//a[contains(@href, 'seller=rozetka')]");
    private final By type = By.xpath(".//a[contains(@href, 'sodimm-ddr4')]");
    private final By quantity = By.xpath(".//a[@data-id='2']");
    private final By onSale = By.xpath(".//a[contains(@href, 'sell_status=available')]");
    private final By sortMenu = By.xpath("//select[@class='select-css ng-untouched ng-pristine ng-valid ng-star-inserted']");
    private final By cheap = By.xpath("//option[@value='1: cheap']");

    public SearchByCatalogPage searchHard() {
        $(hard).click();
        return this;
    }

    public SearchByCatalogPage searchMemory() {
        $(memory).click();
        return this;
    }

    public SearchByCatalogPage sortBySalesman() {
        sortSidebar.find(salesman).click();
        return this;
    }

    public SearchByCatalogPage sortByParameters() {
        sortSidebar.find(type).click();
        sortSidebar.find(quantity).click();
        sortSidebar.find(onSale).click();
        return this;
    }

    public SearchByCatalogPage sortBySelectMenuCheap() {
        $(sortMenu).click();
        $(cheap).click();
        return this;
    }

    public void openProduct() {
        productCart.click();
    }
}
