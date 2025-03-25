import java.util.Scanner;
public class P4 {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;
        boolean[] counted = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!counted[c]) {
                result[index][0] = c + "";
                result[index][1] = freq[c] + "";
                counted[c] = true;
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] freq = findFrequency(text);

        System.out.println("Character | Frequency");
        for (String[] f : freq) {
            System.out.println("    " + f[0] + "     |     " + f[1]);
        }
    }
}
