import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter heights of 11 members");
        double[] arr = new double[11];
        double total =0;
        for(int i=0;i<11;i++){
            arr[i] = n.nextDouble();
            if (arr[10]>0){
                break;
            }
        }
        for(int i=0;i<11;i++){
            total+=arr[i];
        }
        System.out.println(total/11);
    }
}
