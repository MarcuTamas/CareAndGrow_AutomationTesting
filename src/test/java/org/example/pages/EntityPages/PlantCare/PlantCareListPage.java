package org.example.pages.EntityPages.PlantCare;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PlantCareListPage extends PageObject {
/**** WebElements ****/
    //Title
    @FindBy(xpath = "/html/body/main/app-root/main/app-plantscare-list/main/h3/i")
    private WebElementFacade pageTitle;

    //Show details button
    private WebElementFacade plantCareShowDetailsDiv;

    private WebElementFacade set_plantCareInListShowDetailsButton(String plantCareId) {
        return find(By.id(plantCareId));
    }

/**** Actions on WebElements ****/
    public String get_pageTitle() {
        return this.pageTitle.getText();
    }

    //Used for debugging
    public void click_plantCareShowDetailsButton(String plantCareId) {
        this.plantCareShowDetailsDiv = set_plantCareInListShowDetailsButton(plantCareId);
        this.plantCareShowDetailsDiv.click();
    }

    public String get_plantCareDetails(){
        return plantCareShowDetailsDiv.getText();
    }

}
