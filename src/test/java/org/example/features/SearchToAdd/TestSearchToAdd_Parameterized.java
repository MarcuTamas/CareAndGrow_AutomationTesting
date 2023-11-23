package org.example.features.SearchToAdd;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserSearchToAddSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//@RunWith(SerenityParameterizedRunner.class)
@RunWith(SerenityRunner.class)
public class TestSearchToAdd_Parameterized {
    //TODO: REMEBER THAT in the CSV we do not need this time to add quotes around the data (we have tried it was included in the data).
    //TODO: add strings

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserSearchToAddSteps endUserSearchToAddSteps;

/**** Test Scenarios ****/
    @Issue("#Parameterized_SearchToAddSteps")
    @Test
    public void parameterized_search_to_add_plant() {
        this.endUserSearchToAddSteps.goto_home_page();
        this.endUserSearchToAddSteps.click_myPlantsButton();
        this.endUserSearchToAddSteps.click_addPlantNavBarButton();
        this.endUserSearchToAddSteps.click_searchToAddButton();
        this.endUserSearchToAddSteps.enter_queryWord("Olive");
//        this.endUserSearchToAddSteps.enter_queryWord("asdasdasd");
        this.endUserSearchToAddSteps.click_searchToAddQueryButton();
//        System.out.println("Here");
//        System.out.println(this.endUserSearchToAddSteps.check_selectFoundedPlantsListButtonIsPresent());


        //Check the case when no plants are found
        if (!this.endUserSearchToAddSteps.check_selectFoundedPlantsListButtonIsPresent()) {
            this.endUserSearchToAddSteps.close_noFoundedPlantsModal();
            this.endUserSearchToAddSteps.check_logContains("PlantService: fetched 0 plants in rest API.");
        } else {
            this.endUserSearchToAddSteps.click_selectFoundedPlantsList();
            this.endUserSearchToAddSteps.click_foundedPlantButton("Arbequina European Olive");
            this.endUserSearchToAddSteps.click_addPlantButton("Arbequina European Olive");

            //TODO: aici la log messege este ok, doar că o să pun în csv altul diferit în funcție de test.
            this.endUserSearchToAddSteps.check_the_lastLogMessage("PlantAddComponent: error adding Arbequina European Olive");
        }
    }
}
