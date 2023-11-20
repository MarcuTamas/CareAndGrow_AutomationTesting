package org.example.features.searchToAdd;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.example.steps.serenity.EndUserWelcomeSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchToAddPlant {

    @Managed(uniqueSession = true, driver = "firefox")
    public WebDriver webdriver;

    @Steps
//    public EndUserSteps anna;
    public EndUserWelcomeSteps endUserWelcomeSteps;

//    @Issue("#WIKI-1")
//    @Test
//    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
//        anna.is_the_home_page();
//        anna.looks_for("apple");
//        anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
//
//    }
//
//    @Test
//    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
//        anna.is_the_home_page();
//        anna.looks_for("pear");
//        anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but typically elongated towards the stem.");
//    }
//
//    @Pending @Test
//    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
//
//    }

    @Issue("#SearchToAdd")
    @Test
    public void searchToAdd_Test(){
        endUserWelcomeSteps.acceptPrivacy_and_checkTheLocalStorage("9");
    }

} 