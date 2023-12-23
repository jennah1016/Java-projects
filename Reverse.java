import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        //Reverse r = new Reverse();
        System.out.println("enter a string: ");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String reverseInput = "";
        for (int i = input.length(); i > 0; i--){
            reverseInput+= input.charAt(i - 1);
        }
        System.out.println(reverseInput);
    }
}
