package com.schoology.utilities;

import com.schoology.pages.courses.CoursePage;
import com.schoology.pages.groups.CreateGroupsPage;
import com.schoology.pages.home.EventPage;
import com.schoology.pages.home.HomePage;
import com.schoology.pages.home.UpdatePostPage;
import com.schoology.pages.login.LoginPage;
import com.schoology.pages.resources.AddResourcesPage;

public class Pages {

    private CoursePage coursePage;
    private CreateGroupsPage createGroupsPage;
    private EventPage eventPage;
    private HomePage homePage;
    private UpdatePostPage updatePostPage;
    private LoginPage loginPage;
    private AddResourcesPage addResourcesPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CoursePage coursePage() {
        if (coursePage == null) {
            coursePage = new CoursePage();
        }
        return coursePage;
    }

    public CreateGroupsPage createGroupsPage() {
        if (createGroupsPage == null) {
            createGroupsPage = new CreateGroupsPage();
        }
        return createGroupsPage;
    }

    public EventPage eventPage() {
        if (eventPage == null) {
            eventPage = new EventPage();
        }
        return eventPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public UpdatePostPage updatePostPage() {
        if (updatePostPage == null) {
            updatePostPage = new UpdatePostPage();
        }
        return updatePostPage;
    }

    public AddResourcesPage addResourcesPage() {
        if (addResourcesPage == null) {
            addResourcesPage = new AddResourcesPage();
        }
        return addResourcesPage;
    }


}
