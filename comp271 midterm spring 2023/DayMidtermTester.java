import javax.lang.model.element.Element;
import java.util.ArrayList;

public class DayMidtermTester {
    public static void main(String[] args) {
        HolidayMidterm nY = new HolidayMidterm("Sunday", 1, 1);
        HolidayMidterm nH = new HolidayMidterm("Monday", 1, 2);
        HolidayMidterm tT = new HolidayMidterm("Tuesday", 1, 3);
        SnowDay sA = new SnowDay("Wednesday", 1, 4);
        WorkDay wA = new WorkDay("Thursday", 1, 5);
        HolidayMidterm eP = new HolidayMidterm("Friday", 1, 6);
        WorkDay wB = new WorkDay("Saturday", 1, 7);
        DayMidterm a = new DayMidterm("Sunday", 1, 8);
        HolidayMidterm cA = new HolidayMidterm("Monday", 1, 9);
        DayMidterm b = new DayMidterm("Tuesday", 1, 10);
        WorkDay wC = new WorkDay("Wednesday", 1, 11);
        SnowDay sB = new SnowDay("Thursday", 1, 12);
        DayMidterm c = new DayMidterm("Friday", 1, 13);
        DayMidterm d = new DayMidterm("Saturday", 1, 14);
        DayMidterm e = new DayMidterm("Sunday", 1, 15);
        DayMidterm f = new DayMidterm("Monday", 1, 16);
        SnowDay sC = new SnowDay("Tuesday", 1, 17);
        DayMidterm g = new DayMidterm("Wednesday", 1, 18);
        DayMidterm h = new DayMidterm("Thursday", 1, 19);
        WorkDay wD = new WorkDay("Friday", 1, 20);
        HolidayMidterm sF = new HolidayMidterm("Saturday", 1, 21);
        DayMidterm i = new DayMidterm("Sunday", 1, 22);
        DayMidterm j = new DayMidterm("Monday", 1, 23);
        DayMidterm k = new DayMidterm("Tuesday", 1, 24);
        DayMidterm l = new DayMidterm("Wednesday", 1, 25);
        DayMidterm m = new DayMidterm("Thursday", 1, 26);
        DayMidterm n = new DayMidterm("Friday", 1, 27);
        DayMidterm o = new DayMidterm("Saturday", 1, 28);
        DayMidterm p = new DayMidterm("Sunday", 1, 29);
        DayMidterm q = new DayMidterm("Monday", 1, 30);
        DayMidterm r = new DayMidterm("Tuesday", 1, 31);

        //store days in ArrayList
        ArrayList<Object> dates = new ArrayList<>();
        dates.add(nY);
        dates.add(nH);
        dates.add(tT);
        dates.add(sA);
        dates.add(wA);
        dates.add(eP);
        dates.add(wB);
        dates.add(a);
        dates.add(cA);
        dates.add(b);
        dates.add(wC);
        dates.add(sB);
        dates.add(c);
        dates.add(d);
        dates.add(e);
        dates.add(f);
        dates.add(sC);
        dates.add(g);
        dates.add(h);
        dates.add(wD);
        dates.add(sF);
        dates.add(i);
        dates.add(j);
        dates.add(k);
        dates.add(l);
        dates.add(m);
        dates.add(n);
        dates.add(o);
        dates.add(p);
        dates.add(q);
        dates.add(r);

        //add snow days
        sA.addSnow(3);
        sA.addSnow(10);
        sB.addSnow(7);
        sC.addSnow(3);
        sC.addSnow(5);
        sC.addSnow(6);

        //add work hours
        wA.addWorkHours(5);
        wB.addWorkHours(7);
        wC.addWorkHours(9);
        wD.addWorkHours(9);

        //record steps
        sA.addSteps(1000);

        wA.addSteps(1500);
        wD.addSteps(5000);

        cA.addSteps(5000);

        a.addSteps(1000);
        c.addSteps(3000);
        e.addSteps(5000);
        h.addSteps(2000);
        l.addSteps(1000);

        int totalEffectivesSteps = wA.getTotalEffectiveSteps() + wD.getTotalEffectiveSteps() + sA.getTotalEffectiveSteps() + cA.getTotalEffectiveSteps() + a.getTotalEffectiveSteps() + c.getTotalEffectiveSteps() + e.getTotalEffectiveSteps() + h.getTotalEffectiveSteps() + l.getTotalEffectiveSteps();
        //print out ArrayList
        for (int x = 0; x < dates.size(); x++) {
            System.out.println(dates.get(x));
        }
        System.out.println("Total effective steps: " + totalEffectivesSteps);
        //print out total number of effective steps
    }
}
