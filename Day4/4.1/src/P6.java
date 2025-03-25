import java.util.Scanner;
public class P6 {
    public void SpringSeason(int month,int day){
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("Spring Season");
        }else {
            System.out.println("Not Spring Season");
        }
    }

    public static void main(String[] args) {
        int day,month;
        Scanner input = new Scanner(System.in);
        System.out.println("enter day");
        day =  input.nextInt();
        System.out.println("enter month ");
        month = input.nextInt();

        P6 obj = new P6();
        obj.SpringSeason(month,day);
    }

}