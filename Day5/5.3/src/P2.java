import java.util.Scanner;

public class P2 {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] unique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount++] = c;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);

        System.out.println("Unique characters:");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
