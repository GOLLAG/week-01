import java.util.Arrays;
import java.util.Scanner;
public class P4 {

    public static int con(int num) {
        return String.valueOf(num).length();
    }

    public static int[] Digi_Arr(int num) {
        int count = con(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean Arrays_Equal(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean Palindrome(int num) {
        int[] digits = Digi_Arr(num);
        int[] reversedDigits = reverse(digits);
        return Arrays_Equal(digits, reversedDigits);
    }

    public static boolean Duck(int num) {
        int[] digits = Digi_Arr(num);

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();

        int count = con(num);
        int[] digits = Digi_Arr(num);
        int[] reversedDigits = reverse(digits);
        boolean isPalindrome = Palindrome(num);
        boolean isDuck = Duck(num);

        System.out.println("Count of digits = " + count);
        System.out.println("Digits array = " + Arrays.toString(digits));
        System.out.println("Reversed array = " + Arrays.toString(reversedDigits));
        System.out.println("Is Palindrome = " + isPalindrome);
        System.out.println("Is Duck Number = " + isDuck);
    }
}

