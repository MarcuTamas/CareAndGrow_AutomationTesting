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

    /**
     *  The uniqueSession parameter even if it is by default false, we want to be sure that we have a unique session for
     * each test, in order to avoid the localStorage to be shared between tests. Another solution would be to clear the
     * localStorage after each test (i.e. clearCookies = ClearCookiesPolicy.Never).
     */
    @Managed(uniqueSession = false, driver = "firefox")
    public WebDriver webdriver;

    @Steps
    public EndUserWelcomeSteps endUserWelcomeSteps;



/**** Test Scenarios ****/

    /**
     * The test should pass if the localStorage is initialized with mock objects.
     */
    @Issue("#Valid_WelcomSteps")
    @Test
    public void valid_Accept_Privacy_Policy_should_Initialize_The_App_With_Mock_Objects() {
        endUserWelcomeSteps.acceptPrivacy_and_checkTheLocalStorage("9");
    }

    /**
     *  The test presumes that the user will enter the Welcome page and will not accept the privacy policy.
     * It should pass only if the localStorage is not initialized with mock objects (i.e. the value must be "0").
     */
    @Issue("#Invalid_WelcomSteps")
    @Test
    public void invalid_Accept_Privacy_Policy_should_not_Initialize_The_App_With_Mock_Objects() {
        endUserWelcomeSteps.doNotAcceptPrivacy_and_checkTheLocalStorage("0");
    }
}