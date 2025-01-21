package enhancedswitch;

import java.time.Year;

public class Utils {

    public static int getDaysV1(Month month, int year) {
        int noOfDays = 0;
        switch (month) {
            case JAN, MAR, MAY, JUL, AUG, OCT, DEC:
                noOfDays = 31;
                break;
            case FEB:
                noOfDays = Year.isLeap(year) ? 29 : 28;
                break;
            case APR, JUN, SEP, NOV:
                noOfDays = 30;
                break;
        }
        return noOfDays;
    }

    public static int getDaysV2(Month month, long year) {
        return switch (month) {
            case JAN, MAR, MAY, JUL, AUG, OCT, DEC -> 31;
            case FEB -> Year.isLeap(year) ? 29 : 28;
            case APR, JUN, SEP -> 30;
            default -> 0;
        };
    }
}
