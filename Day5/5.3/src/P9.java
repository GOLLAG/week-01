import java.util.Scanner;
public class P9 {
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31*m/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");

        int startDay = getFirstDayOfMonth(month, year);
        int numDays = getNumberOfDays(month, year);

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
    }
}
