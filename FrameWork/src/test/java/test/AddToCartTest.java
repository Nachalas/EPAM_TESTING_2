package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.CartPage;
import page.ProductPage;
import service.ProductPageDataReader;

import static org.assertj.core.api.Assertions.assertThat;

public class AddToCartTest extends CommonConditions {

    @Test
    public void addToCartTest() {
        String productPageUrl = ProductPageDataReader.getProductPageUrl();

        ProductPage productPage = new ProductPage(productPageUrl);

        String expectedSneakersName = productPage
                .openPage()
                .getProductName();

        String expectedSneakersSize = productPage
                .clickOnProductSizeLabel()
                .getProductSizeLabelText();

        CartPage cartPage = productPage
                .clickOnAddToCartButton()
                .clickOnGoToCartButton();

        String actualSneakersName = cartPage
                .getProductNameOnCartPage();


        String actualSneakersSize = cartPage
                .getProductSizeOnCartPage();

        assertThat(actualSneakersName).contains(expectedSneakersName);
        assertThat(actualSneakersSize).isEqualTo(expectedSneakersSize);
    }

}
