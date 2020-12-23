package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ProductPage;
import service.ProductPageDataReader;

import static org.assertj.core.api.Assertions.assertThat;

public class AddToCartTest extends CommonConditions {

    @Test
    public void addToCartTest() {
        String productPageUrl = ProductPageDataReader.getProductPageUrl();

        ProductPage productPage = new ProductPage(productPageUrl);

        String sneakersName = productPage
                .openPage()
                .getProductName();

        String expectedSneakersName = productPage
                .clickOnProductSizeLabel()
                .clickOnAddToCartButton()
                .clickOnGoToCartButton()
                .getProductNameOnCartPage();

        assertThat(expectedSneakersName.toLowerCase())
                .contains(sneakersName.toLowerCase());

    }

}
