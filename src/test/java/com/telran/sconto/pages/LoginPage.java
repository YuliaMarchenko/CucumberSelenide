package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By loginIcon = By.cssSelector(".headerElement__icon.headerElement__icon--login");
    private static By loginHeader = By.cssSelector(".existingAccount__headline");
    private static By emailInput = By.id("loginEmail");
    private static By passwordInput = By.id("loginPassword");
    private static String email = PropertiesLoader.loadProperty("email");
    private static String password = PropertiesLoader.loadProperty("password");
    private static By anmeldenButton = By.id("login-submit");

    public void clickOnLoginIcon() {
        $(loginIcon).click();
    }

    public SelenideElement loginPageHeaderDisplayed() {
        return $(loginHeader);
    }

    public void validLoginInput() {
        $(emailInput).setValue(email);
        $(passwordInput).setValue(password);
    }

    public void clickOnLoginSubmitButton() {
        $(anmeldenButton).click();
    }
}
