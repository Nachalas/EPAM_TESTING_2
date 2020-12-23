package test;

import org.testng.annotations.Test;
import page.MainPage;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class NavBarTest extends CommonConditions {

    @Test
    public void navigationBarTest() {
        MainPage mainPage = new MainPage();

        String navBarMenuItem = mainPage
                .openPage()
                .clickOnNavBarButton()
                .getNavBarMenuBookButton();

        String expectedItemName = mainPage
                .clickOnNavBarMenuBookButton()
                .clickOnFirstItemOnPage()
                .getProductName();

        assertThat(expectedItemName.toLowerCase())
                .contains(navBarMenuItem.toLowerCase()
                        .substring(0,navBarMenuItem.length() - 1)); //Напоминалка: это потому что в меню написано книгИ а в элементе книгА
    }

}
