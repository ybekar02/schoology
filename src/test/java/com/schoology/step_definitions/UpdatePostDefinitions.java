package com.schoology.step_definitions;

import com.schoology.utilities.Driver;
import com.schoology.utilities.Pages;
import cucumber.api.java.en.Then;

public class UpdatePostDefinitions {

    Pages pages = new Pages();

    @Then("User logs on as hpschem")
    public void user_logs_on_as_hpschem() {
        pages.loginPage().login();
    }
    @Then("User clicks on the update icon")
    public void user_clicks_on_the_update_icon() {
        pages.updatePostPage().updatePostElement.click();
    }

    @Then("User enters informative text")
    public void user_enters_informative_text() {
        String post = "Welcome to Java";

        Driver.getDriver().switchTo().frame("edit-body_ifr");
        pages.updatePostPage().bodyElement.sendKeys(post);
        Driver.getDriver().switchTo().parentFrame();
    }


    @Then("User clicks on the on insert icon, clicks on link and sends data")
    public void user_clicks_on_the_on_insert_icon_clicks_on_link_and_sends_data() {
        pages.updatePostPage().insertContentElement.click();
    }

    @Then("User clicks on browse icon and selects the courses")
    public void user_clicks_on_browse_icon_and_selects_the_courses() {
        String link = "app.schoology.com/home";
        String title = "Title";

        pages.updatePostPage().linkElement.click();
        Driver.getDriver().switchTo().frame("mce_52_ifr");
        pages.updatePostPage().linkBoxElement.sendKeys(link);
        pages.updatePostPage().titleBoxElement.clear();
        pages.updatePostPage().titleBoxElement.sendKeys(title);
        pages.updatePostPage().insertElement.click();
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User clicks on post icon")
    public void user_clicks_on_post_icon() {
        pages.updatePostPage().postSearchElement.click();
        pages.updatePostPage().courseSelectElement.click();
        pages.updatePostPage().selectElement.click();
        pages.updatePostPage().postElement.click();
    }

}
