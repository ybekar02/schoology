package com.schoology.step_definitions;

import com.schoology.utilities.Driver;
import com.schoology.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class EventPageStepDefinitions {

    Pages pages = new Pages();

    @Then("user moves to the event tab")
    public void user_moves_to_the_event_tab() {
        pages.eventPage().eventTabElement.click();
    }

    @Then("user enter the date information")
    public void user_enter_the_date_information() {
        pages.eventPage().clickOnDateElement.click();
        pages.eventPage().searchForMonthElement.click();
        pages.eventPage().month();
        pages.eventPage().day();
    }

    @Then("user enters the title and the announcement")
    public void user_enters_the_title_and_the_announcement() {
        pages.eventPage().titleElement.sendKeys("Hello All!");
        Driver.getDriver().switchTo().frame("edit-description_ifr");
        pages.eventPage().bodyElement.sendKeys("Welcome back!!!");
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user selects group to share and disbales to comments")
    public void user_selects_group_to_share_and_disbales_to_comments() {
        pages.eventPage().rsvp();
        System.out.println(pages.eventPage().optionsElement.isEnabled());
        Assert.assertTrue(pages.eventPage().optionsElement.isEnabled());
    }

    @Then("user select the course")
    public void user_select_the_course() {
        pages.eventPage().searchButtonElement.click();
        pages.eventPage().section2CheckBoxElement.click();
        pages.eventPage().selectButtonElement.click();
    }

    @Then("user clicks on create button to finalize")
    public void user_clicks_on_create_button_to_finalize() {
        pages.eventPage().createButtonElement.click();
    }

    @Then("user gets the page title")
    public void user_gets_the_page_title() {
        String title = Driver.getDriver().getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("Home | Schoology"));
    }


}
