package test;

import org.testng.annotations.Test;
import page.MainPage;
import service.DeliveryPageDataReader;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FreeDeliveryConditionTest extends CommonConditions {


    @Test
    public void feeDeliveryConditionTest() {
        String deliveryCondition = DeliveryPageDataReader.getDeliveryCondition();

        String expectedDeliveryCondition = new MainPage()
                .openPage()
                .clickOnFreeDeliveryButton()
                .clickOnFirstAddressBox()
                .getFirstAddressBoxDeliveryCondition();

        assertThat(deliveryCondition)
                .isEqualTo(expectedDeliveryCondition);

    }

}
