package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.ProductPage;
import service.ProductPageDataReader;

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

        Assert.assertTrue(expectedSneakersName.toLowerCase().contains(sneakersName.toLowerCase()));
    }

}
