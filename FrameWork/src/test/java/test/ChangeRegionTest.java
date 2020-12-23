package test;

import org.testng.annotations.Test;
import page.ProductPage;
import service.ProductPageDataReader;

import static org.assertj.core.api.Assertions.assertThat;

public class ChangeRegionTest extends CommonConditions {

    @Test
    public void changeRegionFromMinskToBaranovichi() {
        String productPageUrl = ProductPageDataReader.getProductPageUrl();

        ProductPage productPage = new ProductPage(productPageUrl);

        String newRegionName  = productPage
                .openPage()
                .clickOnCurrentRegionSpanInNavBar()
                .getNewRegionSpanInPopUpName();


        String expectedNewRegionName = productPage
                .clickOnNewRegionSpanInPopUp()
                .getCurrentRegionNearTheProductName();

        assertThat(newRegionName).isEqualTo(expectedNewRegionName);
    }
}
