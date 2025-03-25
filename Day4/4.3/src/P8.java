import java.util.Scanner;
public class P8 {
    static String[] months = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};
    static int[] days_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void calendar(int month, int year) {
        System.out.println("\n  " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int days = DaysinMonth(month, year);
        int firstDay = Firstday(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int DaysinMonth(int month, int year) {
        if (month == 2 && Leap(year)) {
            return 29;
        }
        return days_month[month - 1];
    }

    public static boolean Leap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int Firstday(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
//        System.out.println((1 + x + (31 * m0) / 12) % 7);
        return (1 + x + (31 * m0) / 12) % 7;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        calendar(month, year);
    }
}
