package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");
    private static By acceptButton = By.cssSelector("[data-accept-action='all']");
    private static By account = By.cssSelector(".headerElement__status.headerElement__status--login");
    private static By accountExist = By.xpath("//span[contains(text(),'Vasia Sidorov')]");

    public void acceptCookies(){
        $(acceptButton).click();
    }

    public void clickOnMyAccountIcon(){
        $(account).click();
    }

    public SelenideElement validMyAccount() {
        return $(accountExist);
    }
}
