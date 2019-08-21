package com.schoology.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.schoology.utilities.ConfigurationReader;
import com.schoology.utilities.Driver;

public class LoginPage {

    @FindBy(id ="edit-mail")
    public WebElement userNameElement;

    @FindBy (id ="edit-pass")
    public WebElement passwordElement;

    @FindBy (id ="edit-submit")
    public WebElement submitElement;

    @FindBy (css = ".message-text")
    public WebElement errorElement;


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String username, String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        submitElement.click();
    }

    public void login() {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        submitElement.click();
    }

    //check this method , I do not have it????
    public String getErrorMessage(){
        return errorElement.getText();
    }

    public void goToLandingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


}
