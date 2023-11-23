package org.example.features.SearchToAdd;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserSearchToAddSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/SearchToAdd/SearchToAdd.csv")
public class TestSearchToAdd_Parameterized {
    //TODO: REMEBER THAT in the CSV we do not need this time to add quotes around the data (we have tried it was included in the data).

    private String queryWord, plantName, expectedLogMessage;

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserSearchToAddSteps endUserSearchToAddSteps;

/**** Test Scenarios ****/
    @Issue("#Parameterized_SearchToAddSteps")
    @Test
    public void parameterized_search_to_add_plant() {
        this.endUserSearchToAddSteps.goto_home_page_and_then_to_add_plant_page();

        this.endUserSearchToAddSteps.click_searchToAddButton();
        this.endUserSearchToAddSteps.enter_queryWord(queryWord);
        this.endUserSearchToAddSteps.click_searchToAddQueryButton();

        //Check the case when no plants are found
        if (!this.endUserSearchToAddSteps.check_selectFoundedPlantsListButtonIsPresent()) {
            this.endUserSearchToAddSteps.close_noFoundedPlantsModal();
            this.endUserSearchToAddSteps.check_logContains(expectedLogMessage);
        } else {
            this.endUserSearchToAddSteps.click_selectFoundedPlantsList();
            this.endUserSearchToAddSteps.click_foundedPlantButton(plantName);
            this.endUserSearchToAddSteps.click_addPlantButton(plantName);

            //We check for the expected log message
            this.endUserSearchToAddSteps.check_the_lastLogMessage(expectedLogMessage);
        }
    }
}
