import java.util.Scanner;

public class Questions {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favourite sport? ");
        String sport = input.nextLine();
        System.out.println("Your favourite sport is " + sport);
        System.out.print("What is your favourite Videogame? ");
        String game = input.nextLine();
        System.out.println("Your favourite Videogame is " + game);
        System.out.println("How many hours do you play " + sport + " each day?");
        int WeekS = input.nextInt();
        System.out.println("How many hours do you play " + game + " each day?");
        int WeekV = input.nextInt();
        System.out.println("You play " + sport +" for " + WeekS + " hours each day");
        System.out.println("You play " + game +" for " + WeekV + " hours each day");
        System.out.println("In total, you play for " + (WeekS + WeekV) + " hours each day");
    }
}