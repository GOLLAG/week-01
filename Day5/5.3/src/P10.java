import java.util.Scanner;
public class P10 {

    public static String[] initializeDeck() {
        String[] suits = {"Heart" +
                "]s", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCard = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cannot distribute cards evenly.");
            return null;
        }
        String[][] playerCards = new String[players][n/players];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n/players; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, n, players);

        if (playersCards != null) {
            printPlayersCards(playersCards);
        }
    }
}
