import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("age of Anthony: ");
        int ageAnthony = input.nextInt();

        System.out.print("height of Amar : ");
        int heightAmar = input.nextInt();
        System.out.print("height of Akbar : ");
        int heightAkbar = input.nextInt();
        System.out.print("height of Anthony : ");
        int heightAnthony = input.nextInt();

        String youngestFriend;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngestFriend = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngestFriend);

        // Finding the tallest friend using if-else
        String tallestFriend;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallestFriend = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}
