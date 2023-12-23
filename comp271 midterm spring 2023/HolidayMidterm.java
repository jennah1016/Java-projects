public class HolidayMidterm extends DayMidterm {
    public HolidayMidterm(String w, int m, int d) {
        super(w, m, d);
    }

    @Override
    public int getTotalEffectiveSteps() {
        return super.getTotalEffectiveSteps() * 3;
    }

    public String toString() {
        String s = getMonth() + "/" + getDay() + ", " + getDayOfWeek() + ". Today is a holiday";
        String day = getDayOfWeek();
        if (day == "Saturday" || day == "Sunday") {
            s += " and a weekend!";
        } else {
            s += "!";
        }
        return s;
    }
}
