package com.schoology.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.schoology.utilities.Driver;
import org.openqa.selenium.support.ui.Select;

public class EventPage {
    @FindBy(xpath = "//li[contains(@class,'smart-box-tab-2')]")
    public WebElement eventTabElement;

    @FindBy(id= "edit-start-datepicker-popup-0")
    public WebElement clickOnDateElement;

    @FindBy(css = "select[class='ui-datepicker-new-month']")
    public WebElement searchForMonthElement;

    @FindBy(css = "input[id='edit-title']")
    public WebElement titleElement;

    @FindBy(id= "tinymce")
    public WebElement bodyElement;

    @FindBy(css = "div[class$='group-toggle']")
    public WebElement optionsElement;

    @FindBy(id= "browse-realm-button")
    public  WebElement searchButtonElement;

    @FindBy(css = "input[realmtitle='Chem Course: Section 2']")
    public WebElement section2CheckBoxElement;

    @FindBy(id = "popup_submit")
    public WebElement selectButtonElement;

    @FindBy(id = "edit-submit")
    public WebElement createButtonElement;

    public EventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void month(){
        Select select = new Select(Driver.getDriver().findElement(By.cssSelector("select[class='ui-datepicker-new-month']")));
        select.selectByVisibleText("October");
    }

    public void day(){
        WebElement table = Driver.getDriver().findElement(By.cssSelector("table[class='ui-datepicker']"));
        int num = table.findElements(By.xpath("//td[contains(@class,'ui-datepicker-days-cell')]")).size();
        String day;
        for(int i=0; i< num; i++) {
            day = table.findElements(By.xpath("//td[contains(@class,'ui-datepicker-days-cell')]")).get(i).getText();
            if (day.equals("18")) {
                Driver.getDriver().findElements(By.xpath("//td[contains(@class,'ui-datepicker-days-cell')]")).get(i).click();
                System.out.println(day);
            }
        }
    }

    public void rsvp(){
        Select select = new Select(Driver.getDriver().findElement(By.cssSelector("select[id='edit-rsvp']")));
        select.selectByVisibleText("Only invitees can RSVP");
    }

}
