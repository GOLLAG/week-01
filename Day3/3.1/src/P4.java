import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        double[] arr = new double[10];
        int total = 0;
        int index=0;
        while (true){
            int i = n.nextInt();
            if(arr[9]>0){
                break;
            }else if(i>0){
                arr[index] = i;
                index+=1;
            }else{
                break;
            }
        }
        for(int i =0;i<10;i++) {
            total += arr[i];
        }
        System.out.println(total);
    }
}
