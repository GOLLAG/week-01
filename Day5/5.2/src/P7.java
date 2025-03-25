import java.util.Scanner;
public class P7 {
    public static int[] findStartEndIndexes(String text) {
        int n = getLength(text);
        int start = 0;
        int end = n - 1;

        while (start < n && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }


        if (start > end) {
            start = 0;
            end = -1;
        }

        return new int[]{start, end};
    }


    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }


    public static boolean compareStrings(String s1, String s2) {
        int len1 = getLength(s1);
        int len2 = getLength(s2);

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }


    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();


        int[] indexes = findStartEndIndexes(input);
        String trimmedManual = manualSubstring(input, indexes[0], indexes[1]);


        String trimmedBuiltIn = input.trim();

        boolean isSame = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("String after manual trimming: '" + trimmedManual + "'");
        System.out.println("String after built-in trimming: '" + trimmedBuiltIn + "'");
        System.out.println("Both results are same? " + isSame);

        scanner.close();
    }
}
