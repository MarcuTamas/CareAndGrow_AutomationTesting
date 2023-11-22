package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.EntityPages.PlantCare.AddingNewPlantCarePage;
import org.example.pages.EntityPages.PlantCare.PlantCareListPage;
import org.example.pages.NavBar.ComponentSubMenu.PlantsCareNavBarSubMenuPage;
import org.example.pages.Log.LogPreviewPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;
import org.junit.Assert;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class EndUserAddPlantCareSteps {
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    PlantsCareNavBarSubMenuPage plantsCareNavBarSubMenuPage;
    AddingNewPlantCarePage addingNewPlantCarePage;
    PlantCareListPage plantCareListPage;
    LogPreviewPage logPreviewPage;

/**** Scenario steps ****/
    //Initial steps | ACT & ASSERT
    @Step
    public void goto_home_page_and_then_to_adding_plant_care_page() {
        goto_home_page();
        click_PlantsCareButton();
        click_addPlantCareNavBarButton();
        //Check if the user is on the AddingNewPlantCarePage
        assertEquals(this.addingNewPlantCarePage.get_pageTitle(), ("Adding new plant care")); //Assert
    }

    //Adding new plant care steps | ACT & ASSERT
    @Step
    public void add_new_plant_care(String plantCareId, String plantCarePlantId, String plantCareIsWatered, String plantCareIsFertilized, String plantCareHasSpecialTreatment, String plantInFamilySinceDate){
        type_plantCareId(plantCareId);
        select_plantCarePlantId(plantCarePlantId);
        select_plantCareIsWatered(plantCareIsWatered);
        select_plantCareIsFertilized(plantCareIsFertilized);
        select_plantCareHasSpecialTreatment(plantCareHasSpecialTreatment);
        type_plantInFamilySinceDate(plantInFamilySinceDate);
        click_addPlantCarePageButton(); //Here is made the assertion
    }

    //Check log steps | ACT & ASSERT
    @Step
    public void check_the_log(String expectedLogMessage) {
        click_logPreviewNavBarButton();
        check_logMessage(expectedLogMessage); //Here is made the assertion
    }



//======================================================================================================================
/**** Steps ****/
//======================================================================================================================
    //Initial steps | ACT & ASSERT
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
        //Check if the user is on the WelcomePage
        assertEquals(this.welcomePage.get_welcomeMessage(), ("Welcome plant lover")); //Assert
        this.welcomePage.click_acceptPrivacyPolicyButton();
    }

    @Step
    public void click_PlantsCareButton() {
        this.navBarElementPage.click_plantsCareButton();
    }

    @Step
    public void click_addPlantCareNavBarButton() {
        this.plantsCareNavBarSubMenuPage.click_addPlantCareButton();
    }

    //We need it only for debugging
    public List<String> get_logMessages() {
        return this.logPreviewPage.get_logMessages();
    }


    //Adding new plant care steps | ACT
    @Step
    public void type_plantCareId(String plantCareId) {
        this.addingNewPlantCarePage.type_plantCareId(plantCareId);
    }

    @Step
    public void select_plantCarePlantId(String plantCarePlantId) {
        this.addingNewPlantCarePage.select_plantCarePlantId(plantCarePlantId);
    }

    @Step
    public void select_plantCareIsWatered(String plantCareIsWatered) {
        this.addingNewPlantCarePage.select_plantCareIsWatered(plantCareIsWatered);
    }

    @Step
    public void select_plantCareIsFertilized(String plantCareIsFertilized) {
        this.addingNewPlantCarePage.select_plantCareIsFertilized(plantCareIsFertilized);
    }

    @Step
    public void select_plantCareHasSpecialTreatment(String plantCareHasSpecialTreatment) {
        this.addingNewPlantCarePage.select_plantCareHasSpecialTreatment(plantCareHasSpecialTreatment);
    }

    public void type_plantInFamilySinceDate(String plantInFamilySinceDate) {
        this.addingNewPlantCarePage.type_plantInFamilySinceDate(plantInFamilySinceDate);
    }

    @Step
    public void click_addPlantCarePageButton() {
        this.addingNewPlantCarePage.click_addPlantCarePageButton();
        assertEquals(this.plantCareListPage.get_pageTitle(), "Plant care list"); //Assert
    }

    //Check log steps | ACT & ASSERT
    @Step
    public void click_logPreviewNavBarButton() {
        this.navBarElementPage.click_logButton();
    }

    @Step
    public void check_logMessage(String expectedLogMessage) {
//        System.out.println(this.logPreviewPage.get_logMessages().equals(expectedLogMessage));
        Assert.assertEquals(this.logPreviewPage.get_lastLogMessage(), expectedLogMessage);
    }
}
