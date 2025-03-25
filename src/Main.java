//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//                    #1
//public class Main{
//    public static void main(String[] args){
//        int Harry_yr = 2000;
//        int curr_yr  = 2024;
//        System.out.println("Harry's age in 2024 is " + (curr_yr-Harry_yr));
//    }
//}

//                     #2
//public class Main{
//    public static void main(String[] args){
//        int maths     = 94;
//        int physics   = 95;
//        int chemistry = 96;
//        System.out.println("Sam’s average mark in PCM is " + ((maths+physics+chemistry)/3));
//    }
//}

//                      #3
//public class Main{
//    public static void main(String[] args){
//        float dist = 10.8f;
//        System.out.println("The distance  10.8 km in miles is " + (dist/1.6));
//    }
//}

//                      #4
//public class Main{
//    public static void main(String[] args){
//        int cost_pr = 129;
//        int selling_pr = 191;
//        if (selling_pr > cost_pr) {
//            float profit = selling_pr-cost_pr;
//            float profit_per = (profit/cost_pr)*100;
//            System.out.println("The Cost Price is INR "+ cost_pr + " and Selling Price is INR "+selling_pr+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profit_per);
//        } else{
//            float loss = cost_pr-selling_pr;
//            float loss_per = (loss/cost_pr)*100;
//            System.out.println("The Cost Price is INR "+ cost_pr + " and Selling Price is INR "+selling_pr+"\nThe Loss is INR "+loss+" and the Profit Percentage is "+loss_per);
//
//        }
//    }
//}

//                      #5
//public class Main{
//    public static void main(String[] args){
//        int pens = 14;
//        int n = 3;
//        int rem = pens%n;
//        int x = (pens-rem)/n;
//        System.out.println("The Pen Per Student is "+x+ " and the remaining pen not distributed is "+rem);
//    }
//}

//                      #6
//public class Main{
//    public static void main(String[] args){
//        int fee = 125000;
//        float dis_percent = (float) 10 /100;
//        float dis_amt = fee*dis_percent;
//        float dis_fee = fee-dis_amt;
//        System.out.println("The discount amount is INR "+dis_amt+ "and final discounted fee is INR "+dis_fee);
//
//    }
//}

//                      #7
//public class Main{
//    public static void main(String[] args){
//        int r = 6378;
//        double vol_km = (((double)4 /3)*Math.PI*Math.pow(r,3));
//        double conversion = Math.pow(0.621371, 3);
//        double vol_ml = vol_km * conversion;
//        System.out.println("Volume of a Earth in km is "+vol_km+" and in miles is "+vol_ml);
//    }
//}

//                      #8
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        double miles = ((float)num*(1.6));
//        System.out.println("The total miles is "+ miles +" mile for the given "+num+" km");
//    }
//}

//                      #9
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int fee = scanner.nextInt();
//        double discountPercent = scanner.nextDouble();
//        double dis = fee*(discountPercent/100);
//        double final_dis = fee-dis;
//        System.out.println("The discount amount is INR "+dis+" and final discounted fee is INR "+final_dis);
//    }
//}

//                      #10
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int height = scanner.nextInt();
//        double inches = (float)height/2.54;
//        float feet = (float)inches/12;
//        float reminches = ((float)inches%12);
//        System.out.println("Your Height in cm is "+height+" while in feet is "+ feet +" and inches is "+inches);
//    }
//}

//                      #11
//import java.io.PrintStream;
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        float var1 = scanner.nextFloat();
//        float var2 = scanner.nextFloat();
//        float sum = var1+var2;
//        float diff = var1-var2;
//        float product = var1*var2;
//        float rem = var1/var2;
//        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers " + var1 + " and " + var2 + " is %.2f, %.3f, %.4f, and %.5f", sum, diff, product, rem);
//    }
//}

//                      #12
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        float base = scanner.nextFloat();
//        float height = scanner.nextFloat();
//        double area_cm = (0.5) * base * height;
//        double area_in = area_cm/(Math.pow(2.54, 2));
//        System.out.println("Area in sq.cm is "+area_cm+" and in sq.inches is "+area_in);
//    }
//        }

//                      #13
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int peri = scanner.nextInt();
//        int side = peri/4;
//        System.out.println(" The length of the side is "+side+" whose perimeter is "+peri);
//
//}
//}

//                      #14
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        float feet = scanner.nextFloat();
//        float yards = feet/3;
//        float miles = yards/1760;
//        System.out.println("Your Dist in yards is "+yards+" while in miles is "+miles);
//    }
//        }

//                      #15
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        float price = scanner.nextFloat();
//        int quantity = scanner.nextInt();
//        float total = price*quantity;
//        System.out.println("The total purchase price is INR "+total+" if the quantity is "+quantity+" and unit price is INR"+price);
//    }
//}

//                      #16
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        float total = (float) (n * (n - 1)) /2;
//        System.out.println("number of possible handshakes "+total);
//    }
//}