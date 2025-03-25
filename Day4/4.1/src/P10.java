import java.util.Scanner;
public class P10 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int chocolatesEach = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{chocolatesEach, remaining};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int chocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int children = input.nextInt();
        if (children == 0) {
            System.out.println("Cannot divide chocolates among zero children.");
        } else {

            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
