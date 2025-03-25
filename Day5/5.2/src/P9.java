import java.util.Scanner;
public class P9 {
    public static String getComputerChoice() {
        double random = Math.random();
        if (random < 0.34) {
            return "rock";
        } else if (random < 0.67) {
            return "paper";
        } else {

            return "scissors";
        }
    }


    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "draw";
        } else if (userChoice.equals("rock")) {
            return (computerChoice.equals("scissors")) ? "user" : "computer";
        } else if (userChoice.equals("paper")) {
            return (computerChoice.equals("rock")) ? "user" : "computer";
        } else if (userChoice.equals("scissors")) {
            return (computerChoice.equals("paper")) ? "user" : "computer";
        } else {
            return "invalid";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userWinPercentage = (userWins * 100.0) / totalGames;
        double computerWinPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userWinPercentage) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerWinPercentage) + "%";

        return stats;
    }


    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("----------------------------------------");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        System.out.println("----------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("----------------------------");
        System.out.println("Player\tWins\tWin Percentage");
        System.out.println("----------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("user")) {
                userWins++;
            } else if (winner.equals("computer")) {
                computerWins++;
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(gameResults, stats);

        sc.close();
    }
}
