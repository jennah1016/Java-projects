import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("How many dice do you want to throw?\nEnter a number:");
        int numberOfRolls = console.nextInt();

        if(numberOfRolls <= 0){
            System.out.println("Please choose an integer greater than zero.\nEnter a number:");
            numberOfRolls = console.nextInt();
        }
        for(int i = 1; i <= numberOfRolls; i++){
            int roll = (int)Math.ceil((6 * Math.random()));
            System.out.println("Roll "+ i + ": " + roll);
        }
    }
}
