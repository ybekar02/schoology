package com.schoology.step_definitions;

import com.schoology.utilities.Driver;
import com.schoology.utilities.Pages;
import cucumber.api.java.en.Then;

public class HomePageStepDefinitions {

    Pages pages = new Pages();

    @Then("user clicks on the upgrade tab and findOutMore box")
    public void user_clicks_on_the_upgrade_tab_and_findOutMore_box() {
        pages.homePage().logOn();
        System.out.println(Driver.getDriver().getTitle());
    }
}
