
@Narrative(
        title = "Accept Privacy Policy should initialize with valid MockObjects",
        text = {"In order to be able to use the app the user has to accept the privacy policy",
                "The user should be able to accept the privacy policy and initialize the app with mock objects",
                "",
                "✅ The valid test will check the local storage for existing the initialized objects",
                "❌ The invalid test will check the local storage for not existing the initialized objects"
        },
        cardNumber = "#123"
)
package org.example.features.AcceptThePrivacyPolicy;

import net.thucydides.core.annotations.Narrative;