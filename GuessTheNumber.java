import java.util.Scanner;
public class GuessTheNumber {
    /*this program generates a random number, and asks the user to guess which number the program generated
    this project helped me practice the following:
        - while loops
        - random numbers
        - user input
     */

    public static void main (String[] args){
        game(1,10);
        System.out.println();
        System.out.println("Level 2:");
        game(10, 100);
        System.out.println();
        System.out.println("Level 3:");
        game(50, 500);
    }

     public static void game (int min, int max){
        //keeps track of how many guesses the user makes
        int tries = 0;

        //generate a humber for the user to guess
        int rightGuess = min + (int)(max * Math.random());

        //ask user to guess which the generated number
        System.out.println("I'm thinking of a number between " + min + " and " + max + ". Guess which number it is.");
        System.out.println("Your guess: ");

        //user guesses a number
        Scanner console = new Scanner(System.in);
        int userGuess = console.nextInt();

        //runs until the user gets right answer
        while(userGuess != rightGuess){
            //user's guess was lower than the generated number
            if (userGuess < rightGuess){
                //update number of guesses the user has made
                tries++;
                //ask user to guess again
                System.out.println("Guess higher.\nYour guess: ");
                userGuess = console.nextInt();
            } else if (userGuess > rightGuess){
                //same function as when the user guesses lower
                tries++;
                System.out.println("Guess lower.\n Your guess: ");
                userGuess = console.nextInt();
            }

            if (userGuess == rightGuess){
                tries++;
                System.out.println("Correct! Your got the right answer after " + tries + " tries.");
            }
        }
    }
}
