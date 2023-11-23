
@Narrative(
        title = "Update plant details",
        text = {"The user should be able to update the details of a plant existing in the local storage",
                "",
                "✅ The valid test will update the details of a plant existing in the local storage and check the log message",
                "❌ The invalid test will try to set the plant field Amount to 0 and check the Update Button to be disabled",
        },
        cardNumber = "#1234"
)
package org.example.features.UpdatePlantDetails;

import net.thucydides.core.annotations.Narrative;