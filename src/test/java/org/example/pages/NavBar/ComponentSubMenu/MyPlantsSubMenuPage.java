package org.example.pages.NavBar.ComponentSubMenu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyPlantsSubMenuPage extends PageObject {
/**** WebElements ****/
    @FindBy(id = "PlantsInLocalStorageNumber")
    private WebElementFacade plantsInLocalStorageNumber;

/**** Actions on WebElements ****/
    public String get_plantsInLocalStorageNumber() {
        return this.plantsInLocalStorageNumber.getText();
    }
}
