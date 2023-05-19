import java.io.*;
import java.util.*;

public class FileReadingPractice {
    /*this file takes in a file pathname as a parameter, and then gives the user the option to count
    words in a file or to print out the entire file
     */
    public static void main (String[] args) throws FileNotFoundException {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a file pathname: ");
        String pathname = input.nextLine();
        System.out.println("Press 1 to count words or press 2 to print the entire script");
        int choose = input.nextInt();
        if (choose == 1){
            countWords(pathname);
        } else if (choose == 2){
            print(pathname);
        } else {
            System.out.println("Press 1 to count words or press 2 to print the entire script");
            choose = input.nextInt();
        }
    }
    public static void print(String p) throws FileNotFoundException{
        Scanner s = new Scanner(new File(p));
        while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }
    }
    public static void countWords(String p)throws FileNotFoundException{
        Scanner s = new Scanner(new File(p));
        int count = 0;
        while (s.hasNext()){
            String word = s.next();
            count++;
        }
        System.out.println(count);
    }
}
