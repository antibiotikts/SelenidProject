import configs.BaseTest;
import org.junit.jupiter.api.Test;

public class RozetkaTest extends BaseTest {

    @Test
    void shouldSearchTest() {
        homePage.searchProduct("ipad");
        searchByCatalogPage.openProduct();
        productPage
                .addOnBasket();

    }

    @Test
    void searchByCatalogTest() {
        homePage.searchByCatalog();
        searchByCatalogPage.openProduct();
        productPage
                .addOnBasket();
    }

    @Test
    void searchAndAddProductTest() {
        homePage.searchAndAddProduct();
        searchByCatalogPage
                .searchHard()
                .searchMemory()
                .sortBySalesman()
                .sortByParameters()
                .sortBySelectMenuCheap()
                .openProduct();
        productPage
                .addOnBasket();

    }
}
