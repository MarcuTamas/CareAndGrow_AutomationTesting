package org.example.features.SearchToAdd;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserSearchToAddSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestSearchToAddPlant_NotParameterized {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSearchToAddSteps endUserSearchToAddSteps;

    @Issue("#ValidSearchToAdd")
    @Test
    public void search_to_add_plant() {
        this.endUserSearchToAddSteps.goto_home_page_and_then_to_add_plant_page();
        this.endUserSearchToAddSteps.search_to_add_plant("Prayer", "prayer plant");
        this.endUserSearchToAddSteps.check_the_lastLogMessage("PlantAddComponent: added prayer plant");
    }


    @Issue("#InalidSearchToAdd_PlantIdAlredyExists")
    @Test
    public void invalid_search_to_add_plant_because_plantId_already_exist() {
        this.endUserSearchToAddSteps.goto_home_page_and_then_to_add_plant_page();
        this.endUserSearchToAddSteps.search_to_add_plant("Olive", "Arbequina European Olive");
        this.endUserSearchToAddSteps.check_the_lastLogMessage("PlantAddComponent: error adding Arbequina European Olive");

//        this.endUserSearchToAddSteps.goto_home_page();
//        this.endUserSearchToAddSteps.click_myPlantsButton();
//        this.endUserSearchToAddSteps.click_addPlantNavBarButton();
//        this.endUserSearchToAddSteps.click_searchToAddButton();
//        this.endUserSearchToAddSteps.enter_queryWord("Olive");
//        this.endUserSearchToAddSteps.click_searchToAddQueryButton();
//        this.endUserSearchToAddSteps.click_selectFoundedPlantsList();
//        this.endUserSearchToAddSteps.click_foundedPlantButton("Arbequina European Olive");
//        this.endUserSearchToAddSteps.click_addPlantButton("Arbequina European Olive");
//        this.endUserSearchToAddSteps.check_the_lastLogMessage("PlantAddComponent: error adding Arbequina European Olive");
    }


    @Issue("#InalidSearchToAdd_PlantNotFound")
    @Test
    public void invalid_search_to_add_plant_not_found() {
        this.endUserSearchToAddSteps.goto_home_page_and_then_to_add_plant_page();
        this.endUserSearchToAddSteps.invalid_search_to_add_plant_not_found("asdasdasd");
        this.endUserSearchToAddSteps.check_logContains("PlantService: fetched 0 plants in rest API.");
    }
}