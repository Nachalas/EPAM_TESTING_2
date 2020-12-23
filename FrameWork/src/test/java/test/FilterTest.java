package test;

import org.testng.annotations.Test;
import page.MainPage;
import page.ProductPage;
import service.ProductPageDataReader;
import service.SearchPageDataReader;
import service.StringPriceService;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterTest extends CommonConditions {


    @Test
    public void priceFilterTest() {
        String searchQuery = SearchPageDataReader.getSearchQuery();
        String filterMaxPrice = SearchPageDataReader.getFilterMaxPrice();

        List<String> listOfPrices = new MainPage()
                .openPage()
                .enterSearchQuery(searchQuery)
                .clickSearchButton()
                .enterMaxPriceInput(filterMaxPrice)
                .getListOfProductPrices();

        assertThat(StringPriceService.getOnlyIntPartFromPrice(listOfPrices))
                .allMatch(item -> item <= Integer.parseInt(filterMaxPrice));



    }


}
