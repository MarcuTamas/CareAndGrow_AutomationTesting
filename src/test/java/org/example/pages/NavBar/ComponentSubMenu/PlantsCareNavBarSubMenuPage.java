package org.example.pages.NavBar.ComponentSubMenu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PlantsCareNavBarSubMenuPage extends PageObject {
/**** WebElements ****/
    @FindBy(id = "PlantCareInLocalStorageNumber")
    private WebElementFacade plantCareInLocalStorageNumber;

    @FindBy(name = "AddPlantCareButton")
    private WebElementFacade addPlantCareButton;

/**** Actions on WebElements ****/
    public String get_plantCareInLocalStorageNumber() {
        return this.plantCareInLocalStorageNumber.getText();
    }

    public void click_addPlantCareButton() {
        this.addPlantCareButton.click();
    }
}
