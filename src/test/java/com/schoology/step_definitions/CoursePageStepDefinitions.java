package com.schoology.step_definitions;

import com.schoology.utilities.Driver;
import com.schoology.utilities.Pages;
import com.schoology.utilities.Utilities;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class CoursePageStepDefinitions {

    Pages pages = new Pages();

    @Then("user goes to the dashboard and selects the course")
    public void user_goes_to_the_dashboard_and_selects_the_course() {
        pages.coursePage().courseDashboardElement.click();
    }

    @Then("user collects the course materials")
    public void user_collects_the_course_materials() {
        pages.coursePage().courseSelection2.click();
        pages.coursePage().courseMaterials();
    }

    @Then("user takes the attendance")
    public void user_takes_the_attendance() {
        pages.coursePage().attendanceElement.click();
        pages.coursePage().takeAttendenaceButtonElement.click();
        pages.coursePage().saveChangesButtonElement.click();

        String attendance = Driver.getDriver().findElement(By.xpath("//td[@id='attendance-taken-status-tuesday'] //span[text()='Saved']")).getText();
        Assert.assertEquals(attendance, "Saved");
        System.out.println(attendance);
    }

    @Then("user should be able to see the course materials as")
    public void user_should_be_able_to_see_the_course_materials_as(List<String> course) {
        System.out.println(course);
        System.out.println(course.size());

    }

    @Then("user clicks on gradebook")
    public void user_clicks_on_gradebook() {
        Utilities.waitPlease(2);
        pages.coursePage().gradebookElement.click();
    }

    @Then("user should see the information as")
    public void user_should_see_the_information_as(Map<String, String> userInfo) {
        System.out.println(userInfo);
        System.out.println("name = " + userInfo.get("name"));
        System.out.println("grade = " + userInfo.get("grade"));
        System.out.println("calcs = " + userInfo.get("calcs"));
    }


    @Then("user collects usernames")
    public void user_collects_usernames() {
        Utilities.waitPlease(2);

        int size = Driver.getDriver().findElements(By.cssSelector("div[ng-repeat='id in row_header_ids'] a[class='ng-binding']")).size();
        System.out.println(size);

        for(int i =0; i< size; i++) {
            //SOMEHOW can not scroll down and get the all elements since we get only visible ones
            String spot = (Driver.getDriver().findElements(By.cssSelector("div[ng-repeat='id in row_header_ids'] a[class='ng-binding']"))).get(i).getText();
            System.out.println(spot);
            Utilities.waitPlease(1);
            //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver().findElement(By.cssSelector("div[class='grader-grid-table-body-wrapper s-js-table-body-wrapper']"));
            //js.executeScript("window.scrollBy(0,10000)");

        }
    }

}
