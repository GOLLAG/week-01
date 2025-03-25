import java.util.Scanner;
public class P10 {
    public static String convertor(String s){
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((int) s.charAt(i)>=65 && (int) s.charAt(i)<=90){
                str.append((char) ((int)s.charAt(i)+32));
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    
    public static boolean compare(String s1,String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String s2 = s.toLowerCase();
        System.out.println(convertor(s));
        System.out.println(s2);
        System.out.println(compare(convertor(s),s2));
    }
}