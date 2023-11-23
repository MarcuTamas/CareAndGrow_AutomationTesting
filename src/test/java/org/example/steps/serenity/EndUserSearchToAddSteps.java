package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.EntityPages.Plant.AddingNewPlantPage;
import org.example.pages.NavBar.ComponentSubMenu.MyPlantsNavBarSubMenuPage;
import org.example.pages.Log.LogPreviewPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EndUserSearchToAddSteps {
/**** Pages ****/
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    MyPlantsNavBarSubMenuPage myPlantsNavBarSubMenuPage;
    AddingNewPlantPage addingNewPlantPage;
    LogPreviewPage logPreviewPage;

/**** Scenario steps ****/
    //Initial steps
    @Step
    public void goto_home_page_and_then_to_add_plant_page() {
        goto_home_page(); //Here is made the assertion
        click_myPlantsButton();
        click_addPlantNavBarButton(); //Here is made the assertion that the user is on the adding new plant page
    }

//Search to add plant steps
    @Step
    public void search_to_add_plant(String queryWord, String plantName) {
        click_searchToAddButton();
        enter_queryWord(queryWord);
        click_searchToAddQueryButton();
        click_selectFoundedPlantsList(); //Here is made the assertion that the api returned any founded plants
        click_foundedPlantButton(plantName); //Here is made the assertion that the founded plant button is set to the query word
        click_addPlantButton(plantName); //Here is made the assertion that the plant fields are prepared to be added
    }

//Not found plant steps
    @Step
    public void invalid_search_to_add_plant_not_found(String queryWord) {
        click_searchToAddButton();
        enter_queryWord(queryWord);
        click_searchToAddQueryButton();
        close_noFoundedPlantsModal(); //Here is made the assertion that the api returned any founded plants
    }

    //Check log steps
    @Step
    public void check_logContains(String expectedLogMessage) {
        click_logPreviewButton();
        assertTrue(this.logPreviewPage.get_lastLogMessage().contains(expectedLogMessage)); //Here is made the assertion that the log message is present
    }

    @Step
    public void check_the_lastLogMessage(String expectedLogMessage) {
        click_logPreviewButton();
        assertEquals(expectedLogMessage, this.logPreviewPage.get_lastLogMessage()); //Here is made the assertion that the last log message is the expected one
    }



//======================================================================================================================
/**** Steps ****/
//======================================================================================================================
    //Initial steps
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
        this.welcomePage.click_acceptPrivacyPolicyButton();
        assertEquals(this.welcomePage.get_welcomeMessage(), ("Welcome plant lover")); //Assert
    }

    @Step
    public void click_myPlantsButton() {
        this.navBarElementPage.click_myPlantsButton();
    }

    @Step
    public void click_addPlantNavBarButton() {
        this.myPlantsNavBarSubMenuPage.click_addPlantButton();
//        System.out.println(this.addingNewPlantPage.get_PageTitle());
        assertEquals(this.addingNewPlantPage.get_PageTitle(), ("Adding new plant")); //Assert
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
    public Boolean check_selectFoundedPlantsListButtonIsPresent() {
        return this.addingNewPlantPage.check_selectFoundedPlantsListButtonIsPresent(); //Assert
    }

    @Step
    public void close_noFoundedPlantsModal() {
        this.addingNewPlantPage.click_closeModal();
    }

    @Step
    public void click_selectFoundedPlantsList() {
        //We check if the button is present (it appears only if there are any founded plants)
//        System.out.println(this.addingNewPlantPage.check_SelectAPlantButtonIsPresent());
        Assert.assertTrue(this.addingNewPlantPage.check_selectFoundedPlantsListButtonIsPresent()); //Assert
        this.addingNewPlantPage.click_selectFoundedPlantsList();
    }

    @Step
    public void click_foundedPlantButton(String plantName) {
        this.addingNewPlantPage.click_foundedPlantButton(plantName);
        //We check if the founded plant button is set to the query word
        assertTrue(this.addingNewPlantPage.check_ifFoundedPlantButtonIsCorrectlySetToQueryWord(plantName)); //Assert

    }

    @Step
    public void click_addPlantButton(String plantName) {
        //We check if the plant fields are prepared to be added
//        System.out.println(this.addingNewPlantPage.get_plantCommonNameForm());
        assertTrue(this.addingNewPlantPage.get_plantCommonNameForm().contains(plantName)); //Assert
        this.addingNewPlantPage.click_addPlantButton();
    }

    @Step
    public void click_logPreviewButton() {
        this.navBarElementPage.click_logButton();
    }
}
