package org.example.pages.EntityPages.Plant;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddingNewPlantPage extends PageObject {
    /**** WebElements ****/
    @FindBy(tagName = "h3")
    private WebElementFacade pageTitle;

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

    @FindBy(xpath = "/html/body/main/app-root/main/app-plant-add/div[2]/div/div/div[1]/button")
    private WebElementFacade closeSearchToAddModalButton;


    @FindBy(id = "plant-commonName")
    private WebElementFacade plantCommonNameForm;

    @FindBy(id = "addPlantButton")
    private WebElementFacade addPlantButton;


    /**** Actions on WebElements ****/
    public String get_PageTitle() {
        return this.pageTitle.getText();
    }

    public void click_searchToAddButton() {
        this.searchToAddButton.click();
    }

    public void type_queryWord(String queryWord) {
        this.queryWordForm.type(queryWord);
    }

    public void click_searchToAddQueryButton() {
        this.searchToAddQueryButton.click();
    }

    public void click_closeModal() {
        this.closeSearchToAddModalButton.click();
    }

    public void click_selectFoundedPlantsList() {
        //We have to wait for the button to be enabled before clicking it
        //If it is present only if there are any founded plants
        this.selectFoundedPlantsListButton.waitUntilEnabled().click();
    }

    public void click_foundedPlantButton(String plantName) {
        set_FoundedPlantButton(plantName);
        this.foundedPlantButton.click();
    }

    public void click_addPlantButton() {
        this.addPlantButton.click();
    }

    /**** Check methods ****/
    //Check if any founded plant button it is set correctly with the query word
    public boolean check_ifFoundedPlantButtonIsCorrectlySetToQueryWord(String plantName) {
        return this.foundedPlantButton.getTextContent().contains(plantName);
    }

    //Can be used to check if the plant fields are prepared to be added
    public String get_plantCommonNameForm() {
        return this.plantCommonNameForm.getTextValue();
    }

    //Check if no plants were found by given query word
    public boolean check_selectFoundedPlantsListButtonIsPresent() {
        return this.selectFoundedPlantsListButton.isPresent();
    }
}
