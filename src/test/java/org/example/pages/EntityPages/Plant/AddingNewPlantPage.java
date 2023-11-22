package org.example.pages.EntityPages.Plant;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddingNewPlantPage extends PageObject {
/**** WebElements ****/
    @FindBy(id = "searchToAddButton")
    private WebElementFacade searchToAddButton;

    @FindBy(id = "query-word")
    private WebElementFacade queryWordForm;

    @FindBy(id = "searchToAddQueryButton")
    private WebElementFacade searchToAddQueryButton;

    @FindBy(id = "foundedPlants")
    private WebElementFacade selectFoundedPlantsListButton;

    //Founded plant button
    private WebElementFacade foundedPlantButton;

    private void set_FoundedPlantButton(String plantName) {
        this.foundedPlantButton = find("//button[contains(text(), '" + plantName + "')]");
    }

    @FindBy(id = "noFoundedPlantsMessage")
    private WebElementFacade noFoundedPlantsMessage;

    @FindBy(id = "plant-botanicalName")
    private WebElementFacade plantBotanicalNameForm;

    @FindBy(id = "addPlantButton")
    private WebElementFacade addPlantButton;



/**** Actions on WebElements ****/
    public void click_searchToAddButton() {
        this.searchToAddButton.click();
    }

    public void type_queryWord(String queryWord) {
        this.queryWordForm.type(queryWord);
    }

    public void click_searchToAddQueryButton() {
        this.searchToAddQueryButton.click();
    }

    public void click_selectFoundedPlantsList() {
        this.selectFoundedPlantsListButton.click();
    }
    public void click_foundedPlantButton(String plantName) {
        set_FoundedPlantButton(plantName);
        this.foundedPlantButton.click();

//        System.out.println("Query word: " + plantName);
        System.out.println(foundedPlantButton.getText());
//        if (this.foundedPlantButton.getText().contains(queryWord)) {
//            System.out.println(this.foundedPlantButton.getText());
//            this.foundedPlantButton.click();
//        }
//        this.foundedPlantButton.click();
    }

    public void click_addPlantButton() {
        this.addPlantButton.click();
    }

/**** Check methods ****/
    //Check if any founded plant button contains the query word
//    public boolean check_ifAnyFoundedPlantButtonContainsQueryWord(String queryWord) {
//        System.out.println(foundedPlantButton.getText());
//        return foundedPlantButton.getText().contains(queryWord);
//    }

    //Can be used to check if the plant fields are prepared to be added
    public String get_plantBotanicalNameForm() {
        return this.plantBotanicalNameForm.getText();
    }

    //Check if no plants were found by given query word
    public boolean check_selectFoundedPlantsListButton() {
        return this.selectFoundedPlantsListButton.isDisplayed();
    }

    public boolean check_noFoundedPlantsMessageIsPresent() {
        if (this.noFoundedPlantsMessage.isDisplayed() &&
                this.noFoundedPlantsMessage.getText().contains("No plants with given query word were found in the API.")) {
            return true;
        }
        return false;
    }

    public void wait_for_selectFoundedPlantsListButton() {
        this.selectFoundedPlantsListButton.waitUntilPresent();
    }
}
