package Const;

//import.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static final String CURRENT_MONTH = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM"));
    public static final int CURRENT_YEAR_IN_NUMBER = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy")));
    public static int CURRENT_MONTH_IN_NUMBER = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("MM")));
    public static final LocalDate DATES = LocalDate.now();
    public static final String NEXT_MONTH = DATES.plusMonths(1).format(DateTimeFormatter.ofPattern("MMMM"));
    public static int NEXT_MONTH_IN_NUMBER = Integer.parseInt(DATES.plusMonths(1).format(DateTimeFormatter.ofPattern("MM")));
    public static final String PREVIOUS_MONTH = DATES.minusMonths(1).format(DateTimeFormatter.ofPattern("MMMM"));
    public static int PREVIOUS_MONTH_IN_NUMBER = Integer.parseInt(DATES.minusMonths(1).format(DateTimeFormatter.ofPattern("MM")));
    public static final String SCREENING_EVENT_TITLE = "Mudit Maheshwari";
    public static final int MAX_EVENTS = 3;
    public static final String FINAL_INTERVIEW_TITLE = "Final Interview Slot";
    public static final String NEXT = "next";
    public static final String PREVIOUS = "previous";

    public static void main(String[] args) {
        // Code logic here
    }
}