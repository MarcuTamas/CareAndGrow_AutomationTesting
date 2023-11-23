package org.example.pages.EntityPages.Plant;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PlantDetailsUpdatePage extends PageObject {
/**** WebElements ****/
    //Title
    @FindBy(tagName = "h3")
    private WebElementFacade pageTitle;

    //Form
    @FindBy(xpath = "/html/body/main/app-root/main/app-plant-detail-update/div/main/div[1]/div[1]/div[2]")
    private WebElementFacade plantIdDisabledForm;

    @FindBy(id = "plant-commonName")
    private WebElementFacade plantCommonNameForm;

    @FindBy(id = "plant-botanicalName")
    private WebElementFacade plantBotanicalNameForm;

    @FindBy(id = "plant-watering")
    private WebElementFacade plantWateringForm;

    @FindBy(id = "plant-sunlight")
    private WebElementFacade plantSunlightForm;

    @FindBy(id = "plant-propagation")
    private WebElementFacade plantPropagationForm;

    @FindBy(id = "plant-flowers")
    private WebElementFacade plantFlowersForm;

    @FindBy(id = "plant-care_level")
    private WebElementFacade plantCareLevelForm;

    @FindBy(id = "plant-growth_rate")
    private WebElementFacade plantGrowthRateForm;

    @FindBy(id = "plant-family")
    private WebElementFacade plantFamilyForm;

    @FindBy(id = "plant-inFamilySince")
    private WebElementFacade plantDateForm;

    @FindBy(id = "plant-amount")
    private WebElementFacade plantAmountForm;

    //Buttons
    @FindBy(id = "UpdatePlantButton")
    private WebElementFacade updatePlantPageButton;

/**** Actions on WebElements ****/
    public String get_pageTitle() {
        return this.pageTitle.getText();
    }

    public String get_plantId() {
        return this.plantIdDisabledForm.getText();
    }

    public void type_plantCommonName(String plantCommonName) {
        this.plantCommonNameForm.type(plantCommonName);
    }

    public void type_plantBotanicalName(String plantBotanicalName) {
        this.plantBotanicalNameForm.type(plantBotanicalName);
    }

    public void type_plantWatering(String plantWatering) {
        this.plantWateringForm.type(plantWatering);
    }

    public void type_plantSunlight(String plantSunlight) {
        this.plantSunlightForm.type(plantSunlight);
    }

    public void type_plantPropagation(String plantPropagation) {
        this.plantPropagationForm.type(plantPropagation);
    }

    public void select_plantFlowers(String plantFlowers) {
        this.plantFlowersForm.selectByVisibleText(plantFlowers);
    }

    public void type_plantCareLevel(String plantCareLevel) {
        this.plantCareLevelForm.type(plantCareLevel);
    }

    public void type_plantGrowthRate(String plantGrowthRate) {
        this.plantGrowthRateForm.type(plantGrowthRate);
    }

    public void type_plantFamily(String plantFamily) {
        this.plantFamilyForm.type(plantFamily);
    }

    public void type_plantDate(String plantDate) {
        this.plantDateForm.type(plantDate);
    }

    public void type_plantAmount(String plantAmount) {
        this.plantAmountForm.type(plantAmount);
    }

    public void click_updatePlantPageButton() {
        this.updatePlantPageButton.click();
    }

    public Boolean check_UpdatePlantPageButton_isDisabled() {
        return this.updatePlantPageButton.isDisabled();
    }
}
