package org.example.features.UpdatePlantDetails;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserUpdatePlantDetailsSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/UpdatePlantDetails/PlantUpdateData.csv")
public class TestUpdatePlantDetails_Parameterized {

    //TODO: REMEBER THAT in the CSV we do not need this time to add quotes around the data (we have tried it was included in the data).
    private String plantId, plantCommonName, plantBotanicalName, plantWatering, plantSunlight, plantPropagation, plantFlowers, plantCareLevel, plantGrowthRate, plantFamily, plantDate, plantAmount, expectedLogMessage;

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserUpdatePlantDetailsSteps endUserUpdatePlantDetailsSteps;


/**** Test Scenarios ****/
    @Issue("#Parameterized_UpdatePlantDetailsSteps")
    @Test
    public void parameterized_Update_Plant_Details() {
        this.endUserUpdatePlantDetailsSteps.goto_home_page_and_then_to_update_plant_details_page(plantId);
        this.endUserUpdatePlantDetailsSteps.update_plant_details(plantCommonName, plantBotanicalName, plantWatering, plantSunlight, plantPropagation, plantFlowers, plantCareLevel, plantGrowthRate, plantFamily, plantDate, plantAmount);

        //We check the log only if the amount is greater than 0 because if it is 0 then the update is not valid and the log is not created
            //The third test has the amount set to 0 so the log is not created
        if (Integer.parseInt(plantAmount) > 0) {
            this.endUserUpdatePlantDetailsSteps.check_the_log(expectedLogMessage);
        }
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
