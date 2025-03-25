import java.util.Scanner;
public class P2 {

    public static String str(String s, int n1, int n2){
        String res ="";
        for(int i=n1;i<n2;i++){
            res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String s= input.next();
        int start = input.nextInt();
        int end = input.nextInt();
        String re = s.substring(start,end);
        if(re.equals(str(s,start,end))){
            System.out.println(re);
        }
    }
}
