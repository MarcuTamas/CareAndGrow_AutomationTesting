package org.example.steps.serenity;



import net.thucydides.core.annotations.Step;
import org.example.pages.NavBar.ComponentSubMenu.MyPlantsSubMenuPage;
import org.example.pages.NavBar.ComponentSubMenu.PlantsCareSubMenuPage;
import org.example.pages.NavBar.ComponentSubMenu.TransactionsSubMenuPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;

import static org.junit.Assert.assertTrue;

public class EndUserWelcomeSteps {

/**** Pages ****/
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    MyPlantsSubMenuPage myPlantsSubMenuPage;
    PlantsCareSubMenuPage plantsCareSubMenuPage;
    TransactionsSubMenuPage transactionsSubMenuPage;

/**** Scenario steps ****/
    //Accept the privacy policy and check the localStorage
    @Step
    public void acceptPrivacy_and_checkTheLocalStorage(String expectedInitialElementNumberInLocalStorage) {
        goto_home_page();
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
        return this.myPlantsSubMenuPage.get_plantsInLocalStorageNumber();
    }

    @Step
    public String get_plantCareInLocalStorageNumber() {
        return this.plantsCareSubMenuPage.get_plantCareInLocalStorageNumber();
    }

    @Step
    public String get_transactionsInLocalStorageNumber() {
        return this.transactionsSubMenuPage.get_transactionsInLocalStorageNumber();
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
