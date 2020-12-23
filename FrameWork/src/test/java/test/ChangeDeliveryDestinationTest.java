package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;
import page.CartPage;
import page.ProductPage;
import service.ProductPageDataReader;

public class ChangeDeliveryDestinationTest extends CommonConditions {

    @Test
    public void testSelectDeliveryDestination() {
        String productPageUrl = ProductPageDataReader.getProductPageUrl();

        ProductPage productPage = new ProductPage(productPageUrl)
                .openPage()
                .clickOnProductSizeLabel()
                .clickOnAddToCartButton();

        CartPage cartPage = productPage
                .clickOnGoToCartButton();

        String expectedDeliveryDestinationName = cartPage
                .clickOnChangeDeliveryDestinationButton()
                .clickOnFirstDeliveryDestinationOption()
                .getFirstDeliveryDestinationName();

        String actualDeliveryDestinationName = cartPage
                .confirmChangingDeliveryDestination()
                .getCurrentDeliveryAddressText();

        assertThat(actualDeliveryDestinationName).isEqualTo(expectedDeliveryDestinationName);
    }
}
