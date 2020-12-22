package test;

import org.testng.annotations.Test;
import page.MainPage;
import page.ProductPage;

import java.util.List;

public class TestTest extends CommonConditions{

    @Test
    public void testJopa() {
        List<String> zaloopa = new MainPage()
                .openPage()
                .enterSearchQuery("Кроссовки")
                .clickSearchButton()
                .getListOfProductNames();
        System.out.println(zaloopa);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
