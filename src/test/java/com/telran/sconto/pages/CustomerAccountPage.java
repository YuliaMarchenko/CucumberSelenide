package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CustomerAccountPage {

    private static By accountIcon = By.cssSelector(".headerElement__icon.headerElement__icon--login");
    private static By titleHeadline = By.cssSelector(".titleHeadline");

    public void clickOnMyAccountIcon() {
    }

    public SelenideElement accountTitleDisplayed() {
        return $(titleHeadline);
    }
}
