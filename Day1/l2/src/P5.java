import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        float faren = num.nextFloat();
        float cel = (faren-32)*(((float)5/9));
        System.out.println("The "+faren+" fahrenheit is "+cel+" celsius");
    }
}
