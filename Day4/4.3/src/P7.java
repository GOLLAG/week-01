public class P7 {
    public static int[] arr(){
        int x=10;
        int y;
        int[] a = new int[x];
        for(int i=0;i<x;i++){
            y= (int) ((Math.random()*900000)+100000);
            a[i] = y;
        }
        return a;
    }
    public static boolean check(int[] arr){
        for(int i=0;i<(arr.length-1);i++){
            for(int j=1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] otps = arr();
        for(int i : otps){
            System.out.println(i);
        }
        System.out.println(check(otps));
    }
}
