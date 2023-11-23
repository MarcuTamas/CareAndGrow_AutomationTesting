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

    @FindBy(xpath = "/html/body/main/app-root/main/app-navigation-bar/div[1]/div/div/div[1]/button")
    private WebElementFacade closeButton;

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

    public void click_closeButton() {
        this.closeButton.click();
    }

}
