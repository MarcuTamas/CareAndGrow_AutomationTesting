package org.example.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://marcutamas.github.io/CareAndGrow/welcome")
public class WelcomePage extends PageObject {

/**** WebElements ****/
    @FindBy(id = "AcceptPrivacyButton")
    private WebElementFacade acceptPrivacyPolicyButton;

/**** Actions on WebElements ****/
    public void click_acceptPrivacyPolicyButton() {
        this.acceptPrivacyPolicyButton.click();
    }
}