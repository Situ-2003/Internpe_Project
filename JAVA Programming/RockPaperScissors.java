import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        String playAgain = null;

        do {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine().trim();

            if (!isValidChoice(userChoice, options)) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }

            String computerChoice = options[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isValidChoice(String choice, String[] options) {
        for (String option : options) {
            if (option.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice.toLowerCase()) {
            case "rock":
                return computerChoice.equalsIgnoreCase("scissors") ?
                        "You win! Rock crushes Scissors." : "You lose! Paper covers Rock.";
            case "paper":
                return computerChoice.equalsIgnoreCase("rock") ?
                        "You win! Paper covers Rock." : "You lose! Scissors cut Paper.";
            case "scissors":
                return computerChoice.equalsIgnoreCase("paper") ?
                        "You win! Scissors cut Paper." : "You lose! Rock crushes Scissors.";
            default:
                return "Something went wrong.";
        }
    }
}

/* Output:-
Welcome to Rock, Paper, Scissors!
Enter your choice (Rock, Paper, Scissors): Rock
Computer chose: Rock
It's a tie!
Do you want to play again? (yes/no): yes
Enter your choice (Rock, Paper, Scissors): Paper
Computer chose: Rock
You win! Paper covers Rock.
Do you want to play again? (yes/no): no
Thanks for playing!

 */

