import java.util.Scanner;
public class P5 {
    public static String checkCharacterType(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        else {
            return "Not a Letter";
        }
    }
    public static int[] findVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            String result = checkCharacterType(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
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

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] result = findVowelsAndConsonants(input);

        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);


    }
}
