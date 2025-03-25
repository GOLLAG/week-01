import java.util.Scanner;
public class P1 {

    public static int cnt(String str){
        int count =0;
        try {
            while (true) {
                str.charAt(count);
                    count++;
                }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(cnt(s));
    }
}
