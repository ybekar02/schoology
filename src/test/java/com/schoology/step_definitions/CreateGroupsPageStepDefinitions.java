package com.schoology.step_definitions;

import com.schoology.utilities.Pages;
import cucumber.api.java.en.Then;

public class CreateGroupsPageStepDefinitions {

    Pages pages= new Pages();

    @Then("user goes to the group tab")
    public void user_goes_to_the_group_tab() {
        pages.createGroupsPage().groupButtonElement.click();
        pages.createGroupsPage().createGroupButtonElement.click();
    }

    @Then("user enters the descriptions of the group")
    public void user_enters_the_descriptions_of_the_group() {
        pages.createGroupsPage().nameElement.click();
        pages.createGroupsPage().nameElement.sendKeys("Cucumber Gatherings");
        pages.createGroupsPage().descriptionElement.sendKeys("Cucumber coders in the best companies");
        pages.createGroupsPage().privacy();
        pages.createGroupsPage().access();
        pages.createGroupsPage().category();
    }

    @Then("user creates group")
    public void user_creates_group() {
        pages.createGroupsPage().creatbuttonElement.click();
    }

}
