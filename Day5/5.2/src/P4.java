import java.util.Scanner;
public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the text:");
        String text = sc.nextLine();


        String[] words = splitTextIntoWords(text);


        String[][] wordLengthArray = generateWordLengthArray(words);


        int[] shortestAndLongestIndexes = findShortestAndLongest(wordLengthArray);

        int shortestIndex = shortestAndLongestIndexes[0];
        int longestIndex = shortestAndLongestIndexes[1];


        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t" + length);
        }


        System.out.println("\nShortest Word: " + wordLengthArray[shortestIndex][0] + " (Length: " + wordLengthArray[shortestIndex][1] + ")");
        System.out.println("Longest Word: " + wordLengthArray[longestIndex][0] + " (Length: " + wordLengthArray[longestIndex][1] + ")");


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
            // when we go out of bounds
        }
        return count;
    }


    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }

        return result;
    }
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[] {shortestIndex, longestIndex};
    }
}
