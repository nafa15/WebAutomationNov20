package com.ebaytest;

import com.ebay.HomePage;
import com.peoplentech.webautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar(){

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.typeOnSearchBar();
    }
}
