package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.EntityPages.Plant.PlantDetailsUpdatePage;
import org.example.pages.EntityPages.Plant.PreviewPlantPage;
import org.example.pages.Log.LogPreviewPage;
import org.example.pages.NavBar.ComponentSubMenu.MyPlantsNavBarSubMenuPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;

import static org.junit.Assert.assertEquals;

public class EndUserUpdatePlantDetailsSteps {
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    MyPlantsNavBarSubMenuPage myPlantsNavBarSubMenuPage;
    PreviewPlantPage previewPlantPage;
    PlantDetailsUpdatePage plantDetailsUpdatePage;
    LogPreviewPage logPreviewPage;

/**** Scenario steps ****/
    //Initial steps | ACT & ASSERT
    @Step
    public void goto_home_page_and_then_to_update_plant_details_page(String plantId) {
        goto_home_page(); //Here is made the assertion
        click_PlantButton();
        click_updatePlantNavBarButton();
        select_plantToUpdate(plantId); //Here is made the assertion where we check if the plant id field is the same as the one we selected
    }

    /**
     * Update plant steps check if the page title is changed to the new plant common name
     */
    @Step
    //Update plant steps | ACT & ASSERT
    public void update_plant_details(String plantCommonName, String plantBotanicalName, String plantWatering, String plantSunlight, String plantPropagation, String plantFlowers, String plantCareLevel, String plantGrowthRate, String plantFamily, String plantDate, String plantAmount) {
        type_plantCommonName(plantCommonName);
        type_plantBotanicalName(plantBotanicalName);
        type_plantWatering(plantWatering);
        type_plantSunlight(plantSunlight);
        type_plantPropagation(plantPropagation);
        select_plantFlowers(plantFlowers);
        type_plantCareLevel(plantCareLevel);
        type_plantGrowthRate(plantGrowthRate);
        type_plantFamily(plantFamily);
        type_plantDate(plantDate);
        type_plantAmount(plantAmount);
        click_updatePlantPageButton(plantCommonName); //Here is made the assertion
    }

    @Step
    //Check log steps | ACT & ASSERT
    public void check_the_log(String expectedLogMessage) {
        click_logPreviewNavBarButton();
        check_the_logMessage(expectedLogMessage); //Here is made the assertion
    }




//======================================================================================================================
/**** Steps ****/
//======================================================================================================================
    //Initial steps | ACT & ASSERT
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
        this.welcomePage.click_acceptPrivacyPolicyButton();
        assertEquals(this.welcomePage.get_welcomeMessage(), ("Welcome plant lover")); //Assert
    }

    @Step
    public void click_PlantButton() {
        this.navBarElementPage.click_myPlantsButton();
    }

    @Step
    public void click_updatePlantNavBarButton() {
        this.myPlantsNavBarSubMenuPage.click_updatePlantButton();
    }

    @Step
    public void select_plantToUpdate(String plantId) {
        this.previewPlantPage.click_plantSelectButton(plantId);
        //Assert that the page title is the desired one
        assertEquals(this.plantDetailsUpdatePage.get_plantId(), plantId);
    }

    //Update plant steps | ACT & ASSERT
    @Step
    public void type_plantCommonName(String plantCommonName) {
        this.plantDetailsUpdatePage.type_plantCommonName(plantCommonName);
    }

    @Step
    public void type_plantBotanicalName(String plantBotanicalName) {
        this.plantDetailsUpdatePage.type_plantBotanicalName(plantBotanicalName);
    }

    @Step
    public void type_plantWatering(String plantWatering) {
        this.plantDetailsUpdatePage.type_plantWatering(plantWatering);
    }

    @Step
    public void type_plantSunlight(String plantSunlight) {
        this.plantDetailsUpdatePage.type_plantSunlight(plantSunlight);
    }

    @Step
    public void type_plantPropagation(String plantPropagation) {
        this.plantDetailsUpdatePage.type_plantPropagation(plantPropagation);
    }

    @Step
    public void select_plantFlowers(String plantFlowers) {
        this.plantDetailsUpdatePage.select_plantFlowers(plantFlowers);
    }

    @Step
    public void type_plantCareLevel(String plantCareLevel) {
        this.plantDetailsUpdatePage.type_plantCareLevel(plantCareLevel);
    }

    @Step
    public void type_plantGrowthRate(String plantGrowthRate) {
        this.plantDetailsUpdatePage.type_plantGrowthRate(plantGrowthRate);
    }

    @Step
    public void type_plantFamily(String plantFamily) {
        this.plantDetailsUpdatePage.type_plantFamily(plantFamily);
    }

    @Step
    public void type_plantDate(String plantDate) {
        this.plantDetailsUpdatePage.type_plantDate(plantDate);
    }

    @Step
    public void type_plantAmount(String plantAmount) {
        this.plantDetailsUpdatePage.type_plantAmount(plantAmount);
    }

    //Update plant
    @Step
    public void click_updatePlantPageButton(String plantCommonName) {
        //Assert that the page title is the expected new one
        assertEquals(this.plantDetailsUpdatePage.get_pageTitle(), (plantCommonName + " details:"));
        this.plantDetailsUpdatePage.click_updatePlantPageButton();
    }

    //Check log steps | ACT & ASSERT
    @Step
    public void click_logPreviewNavBarButton() {
        this.navBarElementPage.click_logButton();
    }

    @Step
    public void check_the_logMessage(String expectedLogMessage) {
        assertEquals(this.logPreviewPage.get_lastLogMessage(), expectedLogMessage); //Assert
    }
}
