package org.example.pages.EntityPages.PlantCare;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AddingNewPlantCarePage extends PageObject {
/**** WebElements ****/
    //Title
    @FindBy(tagName = "h2")
    private WebElementFacade pageTitle;

    //Form
    @FindBy(id = "plantCare-id")
    private WebElementFacade plantCareIdForm;

    @FindBy(id = "plantCare-plantID")
    private WebElementFacade plantCarePlantIdSelectForm;

    @FindBy(id = "plantCare-isWatered")
    private WebElementFacade plantCareIsWateredSelectForm;

    @FindBy(id = "plantCare-isFertilized")
    private WebElementFacade plantCareIsFertilizedSelectForm;

    @FindBy(id = "plantCare-hasSpecialTreatment")
    private WebElementFacade plantCareHasSpecialTreatmentSelectForm;

    @FindBy(id = "plant-inFamilySince")
    private WebElementFacade plantInFamilySinceDateForm;

    //Buttons
    @FindBy(id = "AddPlantCareButton")
    private WebElementFacade addPlantCarePageButton;

/**** Actions on WebElements ****/
    public String get_pageTitle() {
        return this.pageTitle.getText();
    }


    public void type_plantCareId(String plantCareId) {
        this.plantCareIdForm.type(plantCareId);
    }

    public void select_plantCarePlantId(String plantCarePlantId) {
        this.plantCarePlantIdSelectForm.selectByVisibleText(plantCarePlantId);
    }

    public void select_plantCareIsWatered(String plantCareIsWatered) {
        this.plantCareIsWateredSelectForm.selectByVisibleText(plantCareIsWatered);
    }

    public void select_plantCareIsFertilized(String plantCareIsFertilized) {
        this.plantCareIsFertilizedSelectForm.selectByVisibleText(plantCareIsFertilized);
    }

    public void select_plantCareHasSpecialTreatment(String plantCareHasSpecialTreatment) {
        this.plantCareHasSpecialTreatmentSelectForm.selectByVisibleText(plantCareHasSpecialTreatment);
    }

    public void type_plantInFamilySinceDate(String plantInFamilySinceDate) {
        this.plantInFamilySinceDateForm.sendKeys(plantInFamilySinceDate);
//        this.plantInFamilySinceDateForm.type(plantInFamilySinceDate);
    }

    public void click_addPlantCarePageButton() {
        this.addPlantCarePageButton.click();
    }

}
