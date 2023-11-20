package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.WelcomePage;

import static org.junit.Assert.assertTrue;

public class EndUserWelcomeSteps {
    WelcomePage welcomePage;

    //Initial steps
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
    }

    @Step
    public void accept_privacy_policy() {
        this.welcomePage.click_acceptPrivacyPolicyButton();
    }

    //Click the NavBar main buttons
    @Step
    public void click_myPlantsButton() {
        this.welcomePage.click_myPlantsButton();
    }

    @Step
    public void click_myPlantsCareButton() {
        this.welcomePage.click_myPlantsCareButton();
    }

    @Step
    public void click_TransactionsButton() {
        this.welcomePage.click_TransactionsButton();
    }


    //Get the values from the localStorage
    @Step
    public String get_plantsInLocalStorageNumber() {
        return this.welcomePage.get_plantsInLocalStorageNumber();
    }

    @Step
    public String get_plantCareInLocalStorageNumber() {
        return this.welcomePage.get_plantCareInLocalStorageNumber();
    }

    @Step
    public String get_transactionsInLocalStorageNumber() {
        return this.welcomePage.get_transactionsInLocalStorageNumber();
    }


    @Step
    public void click_addPlantButton() {
        this.welcomePage.click_addPlantButton();
    }


    @Step
    public void check_plantsInLocalStorageNumber(String expectedPlantsInLocalStorageNumber) {
        click_myPlantsButton();

//        Boolean b = get_plantsInLocalStorageNumber().contains(expectedPlantsInLocalStorageNumber);
//        System.out.println(b);

        assertTrue(get_plantsInLocalStorageNumber().contains(expectedPlantsInLocalStorageNumber));
    }

    @Step
    public void check_plantCareInLocalStorageNumber(String expectedPlantCareInLocalStorageNumber) {
        click_myPlantsCareButton();
        assertTrue(get_plantCareInLocalStorageNumber().contains(expectedPlantCareInLocalStorageNumber));
    }

    @Step
    public void check_transactionsInLocalStorageNumber(String expectedTransactionsInLocalStorageNumber) {
        click_TransactionsButton();
        assertTrue(get_transactionsInLocalStorageNumber().contains(expectedTransactionsInLocalStorageNumber));
    }

    @Step
    public void checkTheEntireInitialLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        //Assertions are made in each method
        check_plantsInLocalStorageNumber(expectedInitialElementNumberInLocalStorage);
        check_plantCareInLocalStorageNumber(expectedInitialElementNumberInLocalStorage);
        check_transactionsInLocalStorageNumber(expectedInitialElementNumberInLocalStorage);
    }


    @Step
    public void acceptPrivacy_and_checkTheLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        goto_home_page();
        accept_privacy_policy();
        checkTheEntireInitialLocalStorage(expectedInitialElementNumberInLocalStorage);
    }

    @Step
    public void doNotAcceptPrivacy_and_checkTheLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        goto_home_page();
        checkTheEntireInitialLocalStorage(expectedInitialElementNumberInLocalStorage);
    }
}
