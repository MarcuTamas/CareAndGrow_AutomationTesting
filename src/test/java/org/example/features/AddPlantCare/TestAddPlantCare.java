package org.example.features.AddPlantCare;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserAddPlantCareSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestAddPlantCare {
    @Managed(uniqueSession = true, driver = "firefox")
    public WebDriver webdriver;

    @Steps
    public EndUserAddPlantCareSteps endUserAddPlantCareSteps;

/**** Test Scenarios ****/
    @Issue("#Valid_AddPlantCareSteps")
    @Test
    public void valid_Add_Plant_Care() {
        this.endUserAddPlantCareSteps.goto_home_page_and_then_to_adding_plant_care_page();
        this.endUserAddPlantCareSteps.add_new_plant_care("77", "391", "Yes", "Yes", "Yes", "2023-09-02");
        this.endUserAddPlantCareSteps.check_the_log("PlantCareAddComponent: added 77");
        //        System.out.println(this.endUserAddPlantCareSteps.get_logMessages());
    }

    @Issue("#Invalid_AddPlantCareSteps")
    @Test
    public void invalid_Add_Plant_Care() {
        this.endUserAddPlantCareSteps.goto_home_page_and_then_to_adding_plant_care_page();
        this.endUserAddPlantCareSteps.add_new_plant_care("1", "391", "Yes", "Yes", "Yes", "2023-09-02");
        this.endUserAddPlantCareSteps.check_the_log("PlantCareAddComponent: error adding 1");
    }

}
