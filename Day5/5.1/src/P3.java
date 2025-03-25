import java.util.Arrays;
import java.util.Scanner;
public class P3 {

    public static char[] arr(String s){
        char[] str = new char[s.length()];
        for(int i=0;i<s.length();i++){
            str[i] = s.charAt(i);
        }
        return str;
    }

    public static boolean x(char[] n, char[] n1){
        return Arrays.equals(n, n1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] i = arr(s);
        char[] j = s.toCharArray();
        System.out.println("char_str = "+ Arrays.toString(arr(s)));
        System.out.println("Equal arrays = " + x(i,j));
    }
}
