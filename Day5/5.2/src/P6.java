import java.util.Scanner;
public class P6 {
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


    public static String[][] findCharacterTypes(String text) {
        int n = getLength(text);
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }


    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e){}
        return count;
    }


    public static void displayCharacterTypes(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < getLength2D(data); i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }


    public static int getLength2D(String[][] arr) {
        int count = 0;
        try {
            while (true) {
                arr[count][0] = arr[count][0];
                count++;
            }
        } catch (Exception e) {
            // End of array
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findCharacterTypes(input);

        displayCharacterTypes(result);

        scanner.close();
    }
}
