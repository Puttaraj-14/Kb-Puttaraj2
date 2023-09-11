# Kb-Puttaraj2
For testing User Story 1 (unauthenticated user navigation through months), we will perform an end-to-end black-box integration test. Here are the steps to validate this user story:

Access the App: Open your web browser and go to http://localhost:3000 (assuming you have already started the app as mentioned above).

Navigate Through Months: Interact with the app's user interface to navigate through different months of the year. Verify that you can click through the months and that all days of the selected month are displayed correctly.

Validation: Manually inspect the app's behavior to ensure that it meets the requirements specified in User Story 1.

Report Issues: If you encounter any issues or unexpected behavior while testing User Story 1, please report them to the development team.



For testing User story 2

Step 1: Set Up the Test Environment

Ensure that you have a test environment with the application running.
Authenticate as a user and navigate to the calendar page.
Step 2: Test Scenario 2a - Creating a Diary Event (Single Event)
3. Locate the date of your screening call on the calendar.

Click on that date to open the date's details.
Click on the "Add Event" or similar button to add a diary event.
Set the event name as "[Your Name] Interview (DONE)."
Leave the color as default.
Save the event.
Navigate back to the main page of the calendar.
Step 3: Assert Diary Event Existence (Scenario 2a)

10. Verify that the diary event "[Your Name] Interview (DONE)" is displayed on the main calendar page. You can do this by checking for its name or any unique identifier.

Step 4: Test Scenario 2b - Creating Multiple Diary Events
11. Identify a future date when you'd be available for interviews (e.g., a week from today).

Click on that date to open the date's details.
Reuse code from Scenario 2a to create up to three events named "Final Interview Slot [start time] – [end time]."
Set the color of each event to Red.
Save each event.
Step 5: Assert Diary Event Existence and Color (Scenario 2b)
16. Verify that the three diary events with names "Final Interview Slot [start time] – [end time]" are displayed on the calendar for the future date.

Ensure that all three events have the color set to Red. You can do this by checking the CSS color attribute or any other identifier.
Step 6: Complete the Test
18. Cleanup: Delete the test events created during the test to keep the environment clean.


For User story 3
Test 3a: Delete Diary Event
Description: This test will verify that an authenticated user can delete a diary event.
Steps:
Authenticate as a user.
Navigate to the list of diary events.
Select two of the "Final Interview Slots" for deletion.
Confirm the deletion action.
Expected Result: The selected diary events should be deleted successfully.
Test 3b: Verify Event Deletion
Description: This test will verify that a deleted diary event is no longer present.
Steps:
Authenticate as a user.
Navigate to the list of diary events.
Check that the previously deleted events are no longer visible.
Expected Result: The deleted diary events should not be visible in the list.


