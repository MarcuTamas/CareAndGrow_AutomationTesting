package org.example.steps.serenity;

import jxl.common.AssertionFailed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeDisabledException;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.example.pages.EntityPages.Transaction.DeleteTransactionPage;
import org.example.pages.EntityPages.Transaction.PreviewTransactionPage;
import org.example.pages.Log.LogPreviewPage;
import org.example.pages.NavBar.ComponentSubMenu.TransactionsNavBarSubMenuPage;
import org.example.pages.NavBar.NavBarElementPage;
import org.example.pages.WelcomePage;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class EndUserDeleteTransactionSteps {
    WelcomePage welcomePage;
    NavBarElementPage navBarElementPage;
    TransactionsNavBarSubMenuPage transactionsNavBarSubMenuPage;
    PreviewTransactionPage previewTransactionPage;
    DeleteTransactionPage deleteTransactionPage;
    LogPreviewPage logPreviewPage;

/**** Scenario steps ****/
    //Initial steps | ACT & ASSERT
    @Step
    public void goto_home_page_and_then_to_delete_transaction_page() {
        goto_home_page(); //Here is made the assertion
        click_TransactionButton();
        click_deleteTransactionNavBarButton();
    }

    @Step
    //Delete transaction steps | ACT & ASSERT
    public void delete_transaction(String transactionId) {
        select_transactionToDelete(transactionId);
        click_deleteTransactionPageButton(); //Here is made the assertion
    }

    @Step
    //Check log steps | ACT & ASSERT
    public void check_the_log(String expectedLogMessage) {
        click_logPreviewNavBarButton();
        check_logMessage(expectedLogMessage); //Here is made the assertion
    }


//======================================================================================================================
/**** Steps ****/
//======================================================================================================================
    //Initial steps | ACT & ASSERT
    @Step
    public void goto_home_page() {
        this.welcomePage.open();
        this.welcomePage.click_acceptPrivacyPolicyButton();
        assertEquals(this.welcomePage.get_welcomeMessage(), ("Welcome plant lover")); //Assert
    }

    @Step
    public void click_TransactionButton() {
        this.navBarElementPage.click_transactionButton();
    }

    @Step
    public void click_deleteTransactionNavBarButton() {
        this.transactionsNavBarSubMenuPage.click_deleteTransactionButton();
    }

    //Delete transaction steps | ACT & ASSERT
    @Step
    public void select_transactionToDelete(String transactionId) {
        this.previewTransactionPage.click_transactionSelectButton(transactionId);
        //Check if the user is on the DeleteTransactionPage
        assertEquals(this.deleteTransactionPage.get_pageTitle(), ("Are you sure ?")); //Assert
    }

    @Step
    public void click_deleteTransactionPageButton() {
        this.deleteTransactionPage.click_deleteTransactionButton();
    }

    //Check log steps | ACT & ASSERT
    @Step
    public void click_logPreviewNavBarButton() {
        this.navBarElementPage.click_logButton();
    }

    @Step
    public void check_logMessage(String expectedLogMessage) {
        assertEquals(this.logPreviewPage.get_lastLogMessage(), expectedLogMessage); //Assert
    }
}
