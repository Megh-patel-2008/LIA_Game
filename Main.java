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
            System.out.println("\nWhat type of game are you looking for?");
            System.out.println("1. Single Player");
            System.out.println("2. Multi Player");
            System.out.println("0. Exit");
            int typeChoice = readInt("Your choice: ");
            if(typeChoice == 0)
            {
                System.out.println("\nSee you next time!");
                break;
            }
            if(typeChoice !=1 && typeChoice !=2)
            {
                System.out.println("Please choose a valid option.");
                continue;
            }
            boolean isSinglePlayer = (typeChoice == 1);
            
            System.out.println("\nWhich platform do you wish to play on");
            System.out.println("1. PC");
            System.out.println("2. Mobile");
            System.out.println("3. PlayStation");
            System.out.println("4. XBox");
            System.out.println("5. Nintendo");
            int platChoice = readInt("Your choice of platform: ");
            
            Platform platform;
            switch(platChoice)
            {
                case 1: platform = Platform.PC;
                break;
                case 2: platform = Platform.MOBILE;
                break;
                case 3: platform = Platform.PLAYSTATION;
                break;
                case 4: platform = Platform.XBOX;
                break;
                case 5: platform = Platform.NINTEND0;
                break;
                default:
                    System.out.println("Please choose a valid option.");
                    continue;
            }
            System.out.println("\nWhich age category?");
            System.out.println(" 1. Child");
            System.out.println(" 2. Teen");
            System.out.println(" 3. Adult");
            int ageChoice = readInt("Your choice: ");
            
            AgeRating ageRating;
            switch(ageChoice){
                case 1: ageRating = AgeRating.CHILD;
                break;
                case 2: ageRating = AgeRating.TEEN;
                break;
                case 3: ageRating = AgeRating.ADULT;
                break;
                default:
                    System.out.println("Please choose a valid option.");
                    continue;
            }
            //Also a loop to repeat the whole process
        }
        scanner.close();
    }
    static int readInt(String prompt){
        System.out.print(prompt);
        while(!scanner.hasNextInt()){
            System.out.print("Please enter a number");
        }
        return scanner.nextInt();
    }
}