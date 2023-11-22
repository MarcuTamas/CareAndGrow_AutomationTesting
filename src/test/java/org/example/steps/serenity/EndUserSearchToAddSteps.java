package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.EntityPages.Plant.AddingNewPlantPage;
import org.example.pages.NavBar.ComponentSubMenu.MyPlantsNavBarSubMenuPage;
import org.example.pages.Log.LogPreviewPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;
import org.junit.Assert;

public class EndUserSearchToAddSteps {
/**** Pages ****/
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    MyPlantsNavBarSubMenuPage myPlantsNavBarSubMenuPage;
    AddingNewPlantPage addingNewPlantPage;
    LogPreviewPage logPreviewPage;

/**** Scenario steps ****/
    //Valid search to add a plant


//======================================================================================================================
/**** Steps ****/
//======================================================================================================================
    //Initial steps
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
        this.welcomePage.click_acceptPrivacyPolicyButton();
    }

    @Step
    public void click_myPlantsButton() {
        this.navBarElementPage.click_myPlantsButton();
    }

    @Step
    public void click_addPlantNavBarButton() {
        this.myPlantsNavBarSubMenuPage.click_addPlantButton();
    }

    //Adding new plant steps
    @Step
    public void click_searchToAddButton() {
        this.addingNewPlantPage.click_searchToAddButton();
    }

    @Step
    public void enter_queryWord(String queryWord) {
        this.addingNewPlantPage.type_queryWord(queryWord);
    }

    @Step
    public void click_searchToAddQueryButton() {
        this.addingNewPlantPage.click_searchToAddQueryButton();
    }

    @Step
    public void check_noFoundedPlantsMessageIsPresent() {
        Assert.assertTrue(this.addingNewPlantPage.check_noFoundedPlantsMessageIsPresent());
    }

    @Step
    public void click_selectFoundedPlantsList() {
        //We check if the button is present (it appears only if there are any founded plants)
//        Assert.assertTrue(this.addingNewPlantPage.check_SelectAPlantButtonIsPresent());
        this.addingNewPlantPage.click_selectFoundedPlantsList();
    }


    @Step
    public void click_foundedPlantButton(String plantName) {
//        System.out.println(this.addingNewPlantPage.check_ifAnyFoundedPlantButtonContainsQueryWord(queryWord));
        //We check if any founded plant button from the list contains the given query word
//        Assert.assertTrue(this.addingNewPlantPage.check_ifAnyFoundedPlantButtonContainsQueryWord(queryWord));
        this.addingNewPlantPage.click_foundedPlantButton(plantName);
    }

    @Step
    public void click_addPlantButton(String plantBotanicalName) {
        this.addingNewPlantPage.click_addPlantButton();
        //We check if the plant fields are prepared to be added after the user pressed the add button
        Assert.assertTrue(this.addingNewPlantPage.get_plantBotanicalNameForm().contains(plantBotanicalName));
    }

    @Step
    public void click_logPreviewButton() {
        this.navBarElementPage.click_logButton();
    }

    @Step
    public void check_logMessages(String expectedLogMessage) {
        Assert.assertTrue(this.logPreviewPage.get_logMessages().contains(expectedLogMessage));
    }

    @Step
    public void wait_for_selectFoundedPlantsListButton() {
        this.addingNewPlantPage.wait_for_selectFoundedPlantsListButton();
    }

}
