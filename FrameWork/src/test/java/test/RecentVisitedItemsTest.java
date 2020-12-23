package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;
import page.ProductPage;
import page.RecentPage;
import service.ProductPageDataReader;

public class RecentVisitedItemsTest extends CommonConditions {

    @Test
    public void testPresenceInVisitedAfterVisitingProductPage() {
        String productPageUrl = ProductPageDataReader.getProductPageUrl();

        String expectedProductName = new ProductPage(productPageUrl)
                .openPage()
                .getProductName();

        String actualProductName = new RecentPage()
                .openPage()
                .getLastVisitedItemName();

        assertThat(actualProductName).isEqualTo(expectedProductName);
    }
}
