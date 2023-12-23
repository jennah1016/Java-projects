public class SnowDay extends DayMidterm {
    private int totalDailySnow;
    private int accumulatedSnow;

    public SnowDay(String w, int m, int d) {
        super(w, m, d);
    }

    public void addSnow(int recordedSnow) {
        totalDailySnow += recordedSnow;
        accumulatedSnow += totalDailySnow;
    }

    public int getTotalDailySnow() {
        return totalDailySnow;
    }

    @Override
    public int getTotalEffectiveSteps() {
        if (totalDailySnow > 0) {
            return super.getTotalEffectiveSteps() * 2;
        }
        return super.getTotalEffectiveSteps();
    }

    public String toString() {
        String s = getMonth() + "/" + getDay() + ", " + getDayOfWeek();
        if (totalDailySnow > 0) {
            s += ". Total snowfall: " + totalDailySnow + " inches";
        } else {
            s += ".";
        }
        return s;
    }
}
