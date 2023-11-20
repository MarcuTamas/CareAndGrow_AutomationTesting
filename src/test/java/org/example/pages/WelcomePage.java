package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("https://marcutamas.github.io/CareAndGrow/welcome")
public class WelcomePage extends PageObject {

    @FindBy(id = "AcceptPrivacyButton")
    private WebElementFacade acceptPrivacyPolicyButton;

    @FindBy(id = "MyPlantsButton")
    private WebElementFacade myPlantsButton;

    @FindBy(name = "AddPlantButton")
    private WebElementFacade addPlantButton;

    @FindBy(id = "PlantsCareButton")
    private WebElementFacade myPlantsCareButton;

    @FindBy(id = "TransactionButton")
    private WebElementFacade myTransactionsButton;

    @FindBy(id = "PlantsInLocalStorageNumber")
    private WebElementFacade plantsInLocalStorageNumber;

    @FindBy(id = "PlantCareInLocalStorageNumber")
    private WebElementFacade plantCareInLocalStorageNumber;

    @FindBy(id = "TransactionsInLocalStorageNumber")
    private WebElementFacade transactionsInLocalStorageNumber;

    public void click_acceptPrivacyPolicyButton() {
        this.acceptPrivacyPolicyButton.click();
    }

    public void click_myPlantsButton() {
        this.myPlantsButton.click();
    }

    public void click_addPlantButton() {
        this.addPlantButton.click();
    }

    public void click_myPlantsCareButton() {
        this.myPlantsCareButton.click();
    }

    public void click_TransactionsButton() {
        this.myTransactionsButton.click();
    }

    public String get_plantsInLocalStorageNumber() {
        return this.plantsInLocalStorageNumber.getText();
    }

    public String get_plantCareInLocalStorageNumber() {
        return this.plantCareInLocalStorageNumber.getText();
    }

    public String get_transactionsInLocalStorageNumber() {
        return this.transactionsInLocalStorageNumber.getText();
    }

}
