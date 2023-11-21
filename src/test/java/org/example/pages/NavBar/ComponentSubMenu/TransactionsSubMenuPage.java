package org.example.pages.NavBar.ComponentSubMenu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class TransactionsSubMenuPage extends PageObject {
/**** WebElements ****/
    @FindBy(id = "TransactionsInLocalStorageNumber")
    private WebElementFacade transactionsInLocalStorageNumber;

    @FindBy(name = "DeleteTransactionButton")
    private WebElementFacade deleteTransactionButton;

/**** Actions on WebElements ****/
    public String get_transactionsInLocalStorageNumber() {
        return this.transactionsInLocalStorageNumber.getText();
    }
}
