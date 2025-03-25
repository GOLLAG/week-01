import java.util.Scanner;
public class P3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.nextLine();


        String[] words = splitTextIntoWords(text);


        String[][] wordLengthArray = generateWordLengthArray(words);


        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t" + length);
        }


    }


    public static String[] splitTextIntoWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                words[wordIndex] = currentWord;
                wordIndex++;
                currentWord = "";
            }
        }


        words[wordIndex] = currentWord;

        return words;
    }


    public static int findLength(String str) {
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


    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }
}
