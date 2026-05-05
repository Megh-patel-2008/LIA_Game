import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static Game_Library library = new Game_Library();
    public static void main(String[] args)
    {
        System.out.println("=================================");
        System.out.println("   Welcome to the Game Library   ");
        System.out.println("=================================");
        boolean keepGoing = true;
        while(keepGoing)
        {
            System.out.println("What type of game are you looking for?");
            System.out.println("1. Single Player");
            System.out.println("2. Multi Player");
            System.out.println("0. Exit");
            int typeChoice = readInt("Your choice: ");
        }
    }
    static int readInt(String prompt){
        System.out.print(prompt);
        while(!scanner.hasNextInt()){
            System.out.print("Please enter a number");
        }
        return scanner.nextInt();
    }
}