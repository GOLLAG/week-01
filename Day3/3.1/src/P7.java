import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("enter number = ");
        int num = n .nextInt();
        int size = (num/2) + 1;
        int o_idx=0;
        int e_idx=0;
        int[] odd_arr = new int[(num/2) + 1];
        int[] even_arr = new int[(num/2) + 1];
        for(int i =1;i<num;i++){
            if (i%2==0){
                even_arr[e_idx] = i;
                e_idx++;
            }else {
                odd_arr[o_idx] = i;
                o_idx++;
            }
        }
        System.out.print("\nOdd Numbers= ");
        for (int i =0;i<o_idx;i++){
            System.out.print(odd_arr[i] +" ");
        }
        System.out.print("\nEven Numbers= ");
        for (int i=0;i<e_idx;i++){
            System.out.print(even_arr[i] + " ");
        }
    }
}

