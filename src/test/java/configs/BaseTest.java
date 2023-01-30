package configs;

import org.junit.jupiter.api.BeforeEach;
import pages.BasketPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchByCatalogPage;

import static com.codeborne.selenide.Selenide.open;
import static configs.Url.ROZETKA;

public class BaseTest {
    protected HomePage homePage = new HomePage();
    protected SearchByCatalogPage searchByCatalogPage = new SearchByCatalogPage();
    protected BasketPage basketPage = new BasketPage();
    protected ProductPage productPage = new ProductPage();

    @BeforeEach
    public void openUrl() {
    open(ROZETKA);
    }

}
