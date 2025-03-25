import java.util.Scanner;
public class P12 {
    public int[] generate4DigitRandomArray(int size){
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(int)((Math.random()*9000)+1000);
        }
        return  arr;
    }
    public double[] findAverageMinMax(int[] numbers){
        double avg=0;
        double min = numbers[0];
        double max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            avg += numbers[i];
            min=Math.min(min,numbers[i]);
            max=Math.max(max,numbers[i]);
        }
        avg= avg/numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        P12 num = new P12();
        int[] nums = num.generate4DigitRandomArray(n);
        double[] val =num.findAverageMinMax(nums);
        System.out.println("Avg = "+val[0]);
        System.out.println("Min = "+val[1]);
        System.out.println("Max = "+val[2]);

    }
}
