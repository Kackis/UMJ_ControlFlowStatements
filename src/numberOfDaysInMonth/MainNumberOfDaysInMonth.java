package numberOfDaysInMonth;

public class MainNumberOfDaysInMonth {
    public static void main (String[]Args){
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));

        System.out.println(NumberOfDaysInMonth.isLeapYear(2020));
    }
}
