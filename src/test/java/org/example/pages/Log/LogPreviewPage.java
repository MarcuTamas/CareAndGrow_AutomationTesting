package org.example.pages.Log;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

public class LogPreviewPage extends PageObject {
/**** WebElements ****/

    @FindBy(name = "logMessages")
    private List<WebElementFacade> logMessages;

/**** Actions on WebElements ****/

    public List<String> get_logMessages() {
        List<String> logMessagesText = new ArrayList<>();
        this.logMessages.forEach(webElementFacade -> {
            logMessagesText.add(webElementFacade.getText());
        });

        return logMessagesText;
    }

    public String get_lastLogMessage() {
        return this.logMessages.get(logMessages.size() - 1).getText();
    }

}
