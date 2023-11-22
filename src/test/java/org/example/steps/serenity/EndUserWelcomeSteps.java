package org.example.steps.serenity;



import net.thucydides.core.annotations.Step;
import org.example.pages.NavBar.ComponentSubMenu.MyPlantsNavBarSubMenuPage;
import org.example.pages.NavBar.ComponentSubMenu.PlantsCareNavBarSubMenuPage;
import org.example.pages.NavBar.ComponentSubMenu.TransactionsNavBarSubMenuPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;
import org.junit.Assert;

import static org.junit.Assert.*;

public class EndUserWelcomeSteps {

/**** Pages ****/
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    MyPlantsNavBarSubMenuPage myPlantsNavBarSubMenuPage;
    PlantsCareNavBarSubMenuPage plantsCareNavBarSubMenuPage;
    TransactionsNavBarSubMenuPage transactionsNavBarSubMenuPage;

/**** Scenario steps ****/
    //Accept the privacy policy and check the localStorage | ACT & ASSERT
    @Step
    public void acceptPrivacy_and_checkTheLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        goto_home_page(); //Act and Assert are made in this method
        accept_privacy_policy();
        checkTheEntireInitialLocalStorage(expectedInitialElementNumberInLocalStorage);
    }

    //Do not accept the privacy policy and check the localStorage
    @Step
    public void doNotAcceptPrivacy_and_checkTheLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        goto_home_page();
        checkTheEntireInitialLocalStorage(expectedInitialElementNumberInLocalStorage);
    }



//======================================================================================================================
/**** Steps ****/
//======================================================================================================================
    //Initial WelcomePage steps
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
        assertEquals(this.welcomePage.get_welcomeMessage(), ("Welcome plant lover")); //Assert
    }

    @Step
    public void accept_privacy_policy() {
        this.welcomePage.click_acceptPrivacyPolicyButton();
    }


    //Click the NavBar main buttons
    @Step
    public void click_MyPlantsButton() {
        this.navBarElementPage.click_myPlantsButton();
    }

    @Step
    public void click_PlantsCareButton() {
        this.navBarElementPage.click_plantsCareButton();
    }

    @Step
    public void click_TransactionsButton() {
        this.navBarElementPage.click_transactionButton();
    }



    //Get the values from the localStorage
    @Step
    public String get_plantsInLocalStorageNumber() {
        return this.myPlantsNavBarSubMenuPage.get_plantsInLocalStorageNumber();
    }

    @Step
    public String get_plantCareInLocalStorageNumber() {
        return this.plantsCareNavBarSubMenuPage.get_plantCareInLocalStorageNumber();
    }

    @Step
    public String get_transactionsInLocalStorageNumber() {
        return this.transactionsNavBarSubMenuPage.get_transactionsInLocalStorageNumber();
    }



//======================================================================================================================
/**** Check the values from the localStorage | ACT AND ASSERT ****/
//======================================================================================================================
    //Act and Assert for each entity localStorage value
    @Step
    public void check_plantsInLocalStorageNumber(String expectedPlantsInLocalStorageNumber) {
        click_MyPlantsButton();

        // Boolean b = get_plantsInLocalStorageNumber().contains(expectedPlantsInLocalStorageNumber);
        // System.out.println(b);

        assertTrue(get_plantsInLocalStorageNumber().contains(expectedPlantsInLocalStorageNumber));
    }

    @Step
    public void check_plantCareInLocalStorageNumber(String expectedPlantCareInLocalStorageNumber) {
        click_PlantsCareButton();
        assertTrue(get_plantCareInLocalStorageNumber().contains(expectedPlantCareInLocalStorageNumber));
    }

    @Step
    public void check_transactionsInLocalStorageNumber(String expectedTransactionsInLocalStorageNumber) {
        click_TransactionsButton();
        assertTrue(get_transactionsInLocalStorageNumber().contains(expectedTransactionsInLocalStorageNumber));
    }


    //Check the entire localStorage
    @Step
    public void checkTheEntireInitialLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        //Assertions are made in each method
        check_plantsInLocalStorageNumber(expectedInitialElementNumberInLocalStorage);
        check_plantCareInLocalStorageNumber(expectedInitialElementNumberInLocalStorage);
        check_transactionsInLocalStorageNumber(expectedInitialElementNumberInLocalStorage);
    }
}
