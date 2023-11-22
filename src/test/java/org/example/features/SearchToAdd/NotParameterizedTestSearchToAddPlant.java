//package org.example.features.SearchToAdd;
//
//import net.serenitybdd.core.annotations.findby.By;
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Issue;
//import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Steps;
//import org.example.steps.serenity.EndUserSearchToAddSteps;
//import org.example.steps.serenity.EndUserWelcomeSteps;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//@RunWith(SerenityRunner.class)
//public class NotParameterizedTestSearchToAddPlant {
//
//    @Managed(uniqueSession = true)
//    public WebDriver webdriver;
//
//    @Steps
//    public EndUserSearchToAddSteps endUserSearchToAddSteps;
//
//
//    @Issue("#ValidSearchToAdd")
//    @Test
//    public void search_to_add_plant() throws InterruptedException {
////        this.endUserSearchToAddSteps.goto_home_page();
////        this.endUserSearchToAddSteps.click_myPlantsButton();
////        this.endUserSearchToAddSteps.click_addPlantNavBarButton();
////        this.endUserSearchToAddSteps.click_searchToAddButton();
////        this.endUserSearchToAddSteps.enter_queryWord("Olive");
////        this.endUserSearchToAddSteps.click_searchToAddQueryButton();
////        this.endUserSearchToAddSteps.wait_for_selectFoundedPlantsListButton();
////        this.endUserSearchToAddSteps.click_selectFoundedPlantsList();
////        this.endUserSearchToAddSteps.click_foundedPlantButton("Arbequina European Olive");
////        this.endUserSearchToAddSteps.click_addPlantButton("Olea europaea 'Arbequina'");
////        this.endUserSearchToAddSteps.click_logPreviewButton();
////        this.endUserSearchToAddSteps.check_logMessages("fetched");
//    }
//}