package com.schoology.step_definitions;

import com.schoology.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import com.schoology.utilities.Pages;

public class LoginStepDefinitions {
    Pages pages = new Pages();
    private static final Logger logger = LogManager.getLogger(LoginStepDefinitions.class); //(LoginStepDefinitions.class.getName());

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @Then("user logs in as a user")
    public void user_logs_in_as_a_user() {
        pages.loginPage().login();
    }

    @Then("user verifies that webpage name is displayed as {string}")
    public void user_verifies_that_webpage_name_is_displayed_as(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("user logs on with {string} and {string}")
    public void user_logs_on_with_and(String string, String string2) {
        pages.loginPage().login(string, string2);
        String title = Driver.getDriver().getTitle();
        if(title.equals("Home | Schoology")){
            System.out.println("user could log on with correct username and password and the title is: " + title);
        }else{
            logger.error("Incorrect user name or password! Try again, please!");
            System.out.println("user could NOT log on with the username and password and the title is: " + title);
        }
    }

    @Then("user verifies the error as")
    public void user_verifies_the_error_as() {
        System.out.println(pages.loginPage().getErrorMessage());
        String errorMessage = "Error: All highlighted fields are required\n" +
                "The username, password and school combination you entered is not " +
                "recognized or does not exist. Please try again.";
        Assert.assertEquals(errorMessage, pages.loginPage().getErrorMessage());
    }

}
