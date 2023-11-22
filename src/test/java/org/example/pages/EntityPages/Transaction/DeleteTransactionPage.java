package org.example.pages.EntityPages.Transaction;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DeleteTransactionPage extends PageObject {
/*** WebElements ***/
    //Title
    @FindBy(tagName = "h3")
    private WebElementFacade pageTitle;

    //Button
    @FindBy(id = "DeleteTransactionButton")
    private WebElementFacade deleteTransactionButton;

/*** Actions on WebElements ***/
    public String get_pageTitle() {
        return this.pageTitle.getText();
    }

    public void click_deleteTransactionButton() {
        this.deleteTransactionButton.click();
    }
}
