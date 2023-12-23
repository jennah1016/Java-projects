public class DayMidterm {
    //provide month name and/or number
    private int month;

    //provide day number
    private int day;

    //provide day of the week
    private String dayOfWeek;

    //record if given day is a holiday
    //record amount of snow, should be able to add snowfall throughout the day
    //record amount of hours worked
    //record amount of steps taken in a day
    private int totalNumSteps;
    private int totalEffectiveSteps;

    //constructor methods

    public DayMidterm() {

    }

    public DayMidterm(String w, int m, int d) {
        this.dayOfWeek = w;
        this.month = m;
        this.day = d;

        if (day > 31 || day < 1) {
            throw new IllegalStateException("invalid day input");
        }
        if (month > 12 || month < 1) {
            throw new IllegalStateException("invalid month input");
        }
        if (month == 2 && day > 28) {
            throw new IllegalStateException("invalid date input");
        }
        if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            throw new IllegalStateException("invalid date input");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    //if recording on a holiday, count triple
    //if recording on a snow day, count double
    //if recording on a work day, count none
    //if recording on a weekend, count 1.5x

    public int getTotalNumSteps() {
        return totalNumSteps;
    }

    public int getTotalEffectiveSteps() {
        return totalEffectiveSteps;
    }

    public void addSteps(int dailySteps) {
        totalNumSteps += dailySteps;

        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            dailySteps *= 1.5;
        }
        totalEffectiveSteps += dailySteps;
    }

    public String toString() {
        String s = month + "/" + day + ", " + dayOfWeek;
        if (dayOfWeek == "Saturday" || dayOfWeek == "Sunday") {
            s += ".  Today is a weekend!";
        }
        return s;
    }
}
