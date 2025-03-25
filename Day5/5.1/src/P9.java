import java.util.Scanner;
public class P9 {

    public static String convertor(String s){
        String str = "";
        for(int i=0;i<s.length();i++){
            if((int) s.charAt(i)>=97 && (int) s.charAt(i)<=122){
                str+=(char)((int)s.charAt(i)-32);
            }else{
                str+=s.charAt(i);
            }
        }
        return str;
    }

    public static boolean compare(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String s1 = s.toUpperCase();
        System.out.println(convertor(s));
        System.out.println(convertor(s1));
        System.out.println("Same = "+compare(convertor(s),s1));
    }
}
