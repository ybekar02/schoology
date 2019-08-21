package com.schoology.step_definitions;

import com.schoology.utilities.Pages;
import cucumber.api.java.en.Then;

public class AddResourcesPageStepDefinitions {

    Pages pages = new Pages();

    @Then("user goes to the resources")
    public void user_goes_to_the_resources() {
        pages.addResourcesPage().resourcesTabElement.click();
    }

    @Then("user adds a file to resources")
    public void user_adds_a_file_to_resources() {
        pages.addResourcesPage().addResourcesElement.click();
        pages.addResourcesPage().addFileElement.click();
    }

    @Then("user attaches the file and clicks on the submit button")
    public void user_attaches_the_file_and_clicks_on_the_submit_button() {
        pages.addResourcesPage().attachFilesElement.sendKeys("/Users/yasinbekar/Downloads/oracle-certified-associate-java-se-8-programmer.png");
        pages.addResourcesPage().addButtonElement.click();
    }

}
