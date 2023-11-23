package org.example.pages.NavBar.ComponentSubMenu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyPlantsNavBarSubMenuPage extends PageObject {
/**** WebElements ****/
    @FindBy(id = "PlantsInLocalStorageNumber")
    private WebElementFacade plantsInLocalStorageNumber;

    @FindBy(name = "AddPlantButton")
    private WebElementFacade addPlantButton;

    @FindBy(name = "UpdatePlantButton")
    private WebElementFacade updatePlantButton;

/**** Actions on WebElements ****/
    public String get_plantsInLocalStorageNumber() {
        return this.plantsInLocalStorageNumber.getText();
    }

    public void click_addPlantButton() {
        this.addPlantButton.click();
    }

    public void click_updatePlantButton() {
        this.updatePlantButton.click();
    }
}
