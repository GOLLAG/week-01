import java.util.Scanner;
public class P5 {
    public static char[] uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }
        return unique.toCharArray();
    }

    public static String[][] characterFrequency(String text) {
        int[] freq = new int[256]; // ASCII size
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        String[][] frequency = characterFrequency(text);

        System.out.println("Character Frequencies:");
        for (String[] pair : frequency) {
            System.out.println(pair[0] + " : " + pair[1]);
        }
    }
}
