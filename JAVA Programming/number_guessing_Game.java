import java.util.Scanner;
import java.util.Random;

public class number_guessing_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String play="yes";

        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randNum=rand.nextInt(10);
            int guess=-1;
            int tries=0;

            while(guess !=randNum)
            {
                System.out.println("Guess a number between 0 and 10:");
                guess=sc.nextInt();
                tries++;

                if (guess==randNum)
                {
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you "+tries+" guesses!");
                    System.out.println("Would you like to play again? Yes or No:");
                    play= sc.next().toLowerCase();
                }
                else if (guess>randNum)
                {
                    System.out.println("Your guess is too high,try again.");
                }
                else
                {
                    System.out.println("Your guess is too low, try again.");
                }
            }
        }
        sc.close();
    }
}

/* Output:-
Guess a number between 0 and 10:
4
Awesome! You guessed the number!
It only took you 1 guesses!
Would you like to play again? Yes or No:
yes
Guess a number between 0 and 10:
5
Your guess is too low, try again.
Guess a number between 0 and 10:
7
Your guess is too high,try again.
Guess a number between 0 and 10:
6
Awesome! You guessed the number!
It only took you 3 guesses!
Would you like to play again? Yes or No:
no
 */
