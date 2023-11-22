package org.example.features.DeleteTransaction;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.EndUserDeleteTransactionSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestDeleteTransaction {
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;

    @Steps
    public EndUserDeleteTransactionSteps endUserDeleteTransactionSteps;

/**** Test Scenarios ****/
    @Issue("#Valid_DeleteTransactionSteps")
    @Test
    public void valid_Delete_Transaction() {
        this.endUserDeleteTransactionSteps.goto_home_page_and_then_to_delete_transaction_page();
        this.endUserDeleteTransactionSteps.delete_transaction("1");
        this.endUserDeleteTransactionSteps.check_the_log("TransactionDeleteComponent: deleted transaction with id 1");
    }

/**
 * This is the first version of the valid test case
 */
//    @Issue("#Valid_DeleteTransactionSteps")
//    @Test
//    public void valid_Delete_Transaction() {
////        this.endUserDeleteTransactionSteps.goto_home_page();
////        this.endUserDeleteTransactionSteps.click_TransactionButton();
////        this.endUserDeleteTransactionSteps.click_deleteTransactionNavBarButton();
////        this.endUserDeleteTransactionSteps.select_transactionToDelete("1");
////        this.endUserDeleteTransactionSteps.click_deleteTransactionPageButton();
////        this.endUserDeleteTransactionSteps.click_logPreviewNavBarButton();
////        this.endUserDeleteTransactionSteps.check_logMessage("TransactionDeleteComponent: deleted transaction with id 1");
//    }
}
