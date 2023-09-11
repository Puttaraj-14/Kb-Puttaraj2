package StepDefinitions;
import Const.CommonMethods;
import Const.Main;
import PageObject.AddDiarySection;
import cucumber.api.java.en.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

import static Const.CommonMethods.driver;


public class AddDairyEvent {
    @BeforeClass
    public static void setUpClass() {
        // Import necessary libraries
        // ...
    }

    @Before
    public void setUp() {
        // Clear local storage snapshot
        // ...
        // Clear local storage "savedEvents"
        // ...
    }

    @After
    public void tearDown() {
        // Save local storage "savedEvents"
        // ...
    }

    @AfterClass
    public static void tearDownClass() {
        // ...
    }

    @Given("The app is running")
    public void theAppIsRunning() {
        CommonMethods.visitSite(driver);
    }

    @And("I am logged in as a valid user")
    public void iAmLoggedInAsValidUser() {
        // Restore local storage "savedEvents"
        // ...
    }

    @When("I add single diary events named {string} on the {int} August")
    public void addSingleDiaryEvent(String eventIdentifier, int dateOfscreening) {
        AddDiarySection.addEventinDiary(String.valueOf(dateOfscreening), eventIdentifier);
    }

    @When("I add three diary events named {string} {string} - {string} on the {int} August")
    public void addThreeDiaryEvents(String eventType, String startTime, String endTime, int dateOfFinalInterview) {
        AddDiarySection.addEventsinDiary(String.valueOf(dateOfFinalInterview), startTime, endTime, eventType);
    }

    @Then("The diary event {string} should be visible on the main page")
    public void diaryEventShouldBeVisible(String choice) {
        switch (choice) {
            case Main.SCREENING_EVENT_TITLE:
                AddDiarySection.viewtheAddedEvent(choice);
                break;
            case Main.FINAL_INTERVIEW_TITLE:
                AddDiarySection.assertFinalInterviewEventsCreated(choice);
                break;
        }
    }
}