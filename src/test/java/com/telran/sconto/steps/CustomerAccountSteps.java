package com.telran.sconto.steps;

import com.telran.sconto.pages.CustomerAccountPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class CustomerAccountSteps implements En {
    CustomerAccountPage customerAccountPage;

    public CustomerAccountSteps(){

        Then("User name displayed", () -> {
            customerAccountPage = page(CustomerAccountPage.class);
            customerAccountPage.accountTitleDisplayed().should(exist);
        });
    }
}
