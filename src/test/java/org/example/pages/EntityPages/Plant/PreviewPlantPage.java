package org.example.pages.EntityPages.Plant;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class PreviewPlantPage extends PageObject {
    /**** WebElements ****/
    @FindBy(id = "CloseModalButton")
    private WebElementFacade closeModalButton;

    //Plant button list
    private WebElementFacade plantSelectButton;

    private void set_PlantSelectButton(String plantId) {
        this.plantSelectButton = find(By.id(plantId));
    }


    /**** Actions on WebElements ****/
    public void click_plantSelectButton(String plantId) {
        set_PlantSelectButton(plantId);
//        System.out.println(transactionSelectButton.getAttribute("tagName"));
        this.plantSelectButton.click();
        this.closeModalButton.click(); //We close the modal manually because the click on the transaction button doesn't close it.
    }

}
