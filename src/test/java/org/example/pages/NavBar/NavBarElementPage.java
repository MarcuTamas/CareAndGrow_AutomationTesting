package org.example.pages.NavBar;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NavBarElementPage extends PageObject {

/**** WebElements ****/
    @FindBy(xpath = "/html/body/main/app-root/main/app-navigation-bar/nav/div/a[1]")
    private WebElementFacade careAndGrowHomeButton;

    @FindBy(id = "MyPlantsButton")
    private WebElementFacade myPlantsButton;

    @FindBy(id = "PlantsCareButton")
    private WebElementFacade plantsCareButton;

    @FindBy(id = "TransactionButton")
    private WebElementFacade transactionButton;

    @FindBy(id = "LogButton")
    private WebElementFacade logButton;

    @FindBy(className = "privacy-policy")
    private WebElementFacade privacyPolicyButton;


/**** Actions on WebElements ****/

    //Click
    public void click_careAndGrowHomeButton() {
        this.careAndGrowHomeButton.click();
    }

    public void click_myPlantsButton() {
        this.myPlantsButton.click();
    }

    public void click_plantsCareButton() {
        this.plantsCareButton.click();
    }

    public void click_transactionButton() {
        this.transactionButton.click();
    }

    public void click_logButton() {
        this.logButton.click();
    }

    public void click_privacyPolicyButton() {
        this.privacyPolicyButton.click();
    }
}
