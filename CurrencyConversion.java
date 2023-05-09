import java.text.DecimalFormat;
import java.util.Scanner;
public class CurrencyConversion {
    public static void main (String[] args){
        /*this program converts USD to different currencies, and was designed to help me practice the following:
            - if/else statements
            - basic math operations in Java, math class operations
            - while loops
            - decimal format
         - ask user to select which currency to convert to - choose from CAD, GBP, EUR, or JPY
         - display monetary value in USD and selected currency
         - program runs until the user decides to exit
         */

        Scanner input = new Scanner(System.in);
        System.out.println("This program can convert USD to CAD, GBP, EUR, or JPY.");
        System.out.println("Select which currency you want to convert to...");
        choose('C', "CAD");
        choose('G', "GBP");
        choose('E', "EUR");
        choose('J', "JPY");
        System.out.println("Or type (X) to exit");
        String in = input.next().toLowerCase();
        while (!in.equals("x")){
            if(in.equals("c")){
                cad();
            }
            if(in.equals("g")){
                gbp();
            }
            if (in.equals("e")){
                eur();
            }
            if (in.equals("j")){
                jpy();
            }
            if (in.equals("x")){
                System.out.println("program exited");
            } else {
                System.out.println("Select which currency you want to convert to...");
                choose('C', "CAD");
                choose('G', "GBP");
                choose('E', "EUR");
                choose('J', "JPY");
                System.out.println("Or type (X) to exit");
                in = input.next().toLowerCase();
            }
            System.out.println();
        }
    }

    //individual methods for currency conversion
    public static void jpy(){
        //take user input
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        //convert USD to given currency
        double jpy = value * 134.74;

        //display value in USD and given currency, round JPY to nearest whole number
        System.out.println(value + " USD is worth " + Math.round(jpy) + " JPY.");
        System.out.println();
    }
    public static void eur(){
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        //round euro, gbp, and cad to 2 decimal places
        DecimalFormat dec = new DecimalFormat("##.00");
        double eur = value * 0.91;
        System.out.println(value + " USD is worth " + dec.format(eur) + " EUR.");
        System.out.println();
    }
    public static void gbp(){
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        DecimalFormat dec = new DecimalFormat("##.00");
        double gbp = value * 0.8;
        System.out.println(value + " USD is worth " + dec.format(gbp) + " GBP.");
        System.out.println();
    }
    public static void cad(){ //multiply by 1.35
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        DecimalFormat dec = new DecimalFormat("##.00");
        double cad = value * 1.35;
        System.out.println(value + " USD is worth " + dec.format(cad) + " CAD.");
        System.out.println();
    }

    public static void choose(char x, String y){
        System.out.println("Type (" + x + ") to convert to " + y);
    }
}
