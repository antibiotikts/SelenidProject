import configs.BaseTest;
import org.junit.jupiter.api.Test;

public class RozetkaTest extends BaseTest {

    @Test
    void shouldSearchTest() {
        homePage.searchProduct("ipad");
    }

    @Test
    void searchByCatalogTest() {
        homePage.searchByCatalog();
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
        basketPage
                .openBasket()
                .cleanBasket(basketPage.getProducts());
    }
}
