package org.example.features.UpdatePlantDetails;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserUpdatePlantDetailsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestUpdatePlantDetails_Parameterized {
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserUpdatePlantDetailsSteps endUserUpdatePlantDetailsSteps;


/**** Test Scenarios ****/
    @Issue("#Valid_UpdatePlantDetailsSteps")
    @Test
    public void valid_Update_Plant_Details() {
        this.endUserUpdatePlantDetailsSteps.goto_home_page_and_then_to_update_plant_details_page("724");
        this.endUserUpdatePlantDetailsSteps.update_plant_details("CommonName", "BotanicalName", "Watering", "Sunlight", "Propagation", "Yes", "CareLevel", "GrowthRate", "Family", "09-02-2023", "1");
        this.endUserUpdatePlantDetailsSteps.check_the_log("PlantDetailUpdateComponent: updated CommonName");
    }


/**** Old Test ****/
//    @Issue("#Valid_UpdatePlantDetailsSteps")
//    @Test
//    public void valid_Update_Plant_Details() {
//        this.endUserUpdatePlantDetailsSteps.goto_home_page();
//        this.endUserUpdatePlantDetailsSteps.click_PlantButton();
//        this.endUserUpdatePlantDetailsSteps.click_updatePlantNavBarButton();
//        this.endUserUpdatePlantDetailsSteps.select_plantToUpdate("724");
//        this.endUserUpdatePlantDetailsSteps.type_plantCommonName("CommonName");
//        this.endUserUpdatePlantDetailsSteps.type_plantBotanicalName("BotanicalName");
//        this.endUserUpdatePlantDetailsSteps.type_plantWatering("Watering");
//        this.endUserUpdatePlantDetailsSteps.type_plantSunlight("Sunlight");
//        this.endUserUpdatePlantDetailsSteps.type_plantPropagation("Propagation");
//        this.endUserUpdatePlantDetailsSteps.select_plantFlowers("Yes");
//        this.endUserUpdatePlantDetailsSteps.type_plantCareLevel("CareLevel");
//        this.endUserUpdatePlantDetailsSteps.type_plantGrowthRate("GrowthRate");
//        this.endUserUpdatePlantDetailsSteps.type_plantFamily("Family");
//        this.endUserUpdatePlantDetailsSteps.type_plantDate("2020-01-01");
//        this.endUserUpdatePlantDetailsSteps.type_plantAmount("1");
//        this.endUserUpdatePlantDetailsSteps.click_updatePlantPageButton("CommonName");
//        this.endUserUpdatePlantDetailsSteps.click_logPreviewNavBarButton();
//        this.endUserUpdatePlantDetailsSteps.check_the_logMessage("PlantDetailUpdateComponent: updated CommonName");
//    }
}
