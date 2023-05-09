import java.util.Scanner;

public class CurrencyConversion {
    public static void main (String[] args) {
        /*this program converts USD to different currencies, and was designed to help me practice the following:
            - if/else statements
            - basic math operations
            - while loops
         - ask user to select which currency to convert to - choose from CAD, JPY, GBP, EUR
         - display monetary value in USD and selected currency
         - program runs until the user decides to exit*/

        Scanner input = new Scanner(System.in);
        System.out.println("This program can convert USD to CAD, GBP, EUR, or JPY.");
        System.out.println("Select a which currency you want to convert to...");
        choose('C', "CAD");
        choose('G', "GBP");
        choose('E', "EUR");
        choose('J', "JPY");
        System.out.println("Or type (X) to exit");
        String in = input.next().toLowerCase();
            while (!in.equals("x")){
                if (in.equals("c")) {
                    cad();
                }
                if (in.equals("g")) {
                    gbp();
                }
                if (in.equals("e")) {
                    eur();
                }

                if (in.equals("j")) {
                    jpy();
                } if (in.equals("x")){
                    System.out.println("program exited");
                } else {
                    System.out.println("Select a which currency you want to convert to...");
                    choose('C', "CAD");
                    choose('G', "GBP");
                    choose('E', "EUR");
                    choose('J', "JPY");
                    System.out.println("Or type (X) to exit");
                    in = input.next().toLowerCase();
                }
                System.out.println("Select a which currency you want to convert to...");
                choose('C', "CAD");
                choose('G', "GBP");
                choose('E', "EUR");
                choose('J', "JPY");
                System.out.println("Or type (X) to exit");
                in = input.next().toLowerCase();
            }
    }

    //I did not want to type the same sentence over again, hence why this method exists
    public static void choose(char x, String y){
        System.out.println("Type (" + x + ") to convert to " + y);
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
        //display value in USD and given currency
        System.out.println(value + " USD is worth " + jpy + " JPY.");
    }
    public static void eur(){
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        double eur = value * 0.91;
        System.out.println(value + " USD is worth " + eur + " EUR.");
    }
    public static void gbp(){
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        double gbp = value * 0.8;
        System.out.println(value + " USD is worth " + gbp + " GBP.");
    }
    public static void cad(){
        System.out.println("Enter a number: ");
        Scanner console = new Scanner(System.in);
        double value = console.nextDouble();
        if (value < 0){
            throw new IllegalArgumentException("Please enter a value greater than or equal to 0.");
        }
        double cad = value * 1.35;
        System.out.println(value + " USD is worth " + cad + " CAD.");
    }
}
