package org.example.pages.EntityPages.Transaction;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class PreviewTransactionPage extends PageObject {
/*** WebElements ***/
    @FindBy(id = "CloseModalButton")
    private WebElementFacade closeModalButton;

    //Transaction button list
    private WebElementFacade transactionSelectButton;

    private void set_TransactionSelectButton(String transactionId) {
        this.transactionSelectButton = find(By.id("TransactionButton"+transactionId));
    }

/*** Actions on WebElements ***/
    public void click_transactionSelectButton(String transactionId) {
        set_TransactionSelectButton(transactionId);
//        System.out.println(transactionSelectButton.getAttribute("tagName"));
        this.transactionSelectButton.click();
        this.closeModalButton.click(); //We close the modal manually because the click on the transaction button doesn't close it.
    }
}
