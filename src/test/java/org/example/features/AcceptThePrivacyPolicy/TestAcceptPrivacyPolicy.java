package org.example.features.AcceptThePrivacyPolicy;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserWelcomeSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestAcceptPrivacyPolicy {
    @Managed(uniqueSession = false, driver = "firefox")
    public WebDriver webdriver;

    @Steps
    public EndUserWelcomeSteps endUserWelcomeSteps;

    @Issue("#Valid_WelcomSteps")
    @Test
    public void valid_Accept_Privacy_Policy_should_Initialize_The_App_With_Mock_Objects() {
        endUserWelcomeSteps.acceptPrivacy_and_checkTheLocalStorage("9");
    }

    @Issue("#Invalid_WelcomSteps")
    @Test
    public void invalid_Accept_Privacy_Policy_should_not_Initialize_The_App_With_Mock_Objects() {
        endUserWelcomeSteps.doNotAcceptPrivacy_and_checkTheLocalStorage("0");
    }
}

