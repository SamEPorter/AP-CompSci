import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();
            
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------\n");
        //more test cases for other exercises to follow...
        
        System.out.println("Formatting Phone Number:");
        System.out.println("Enter a ten digit phone number: ");
        String answer2 = input.nextLine();
        System.out.println("The Formatted number is: " + sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------\n");
        
        System.out.println("Middle Three:");
        System.out.println("Enter a 3-or-more letter word with an odd number of characters: ");
        String answer3 = input.nextLine();
        System.out.println("The Middle three letters are: " + sTools.middleThree(answer3));
        System.out.println("---------------------\n");
        
        System.out.println("Swap Last:");
        System.out.println("Enter a 2-or-more letter word: ");
        String answer4 = input.nextLine();
        System.out.println("The word with the last two letters swapped is:\n " + sTools.swapLastTwo(answer4));
        System.out.println("---------------------\n");
        
        System.out.println("Front again:");
        System.out.println("Enter a word: ");
        String answer5 = input.nextLine();
        int answer6 = input.nextInt();
        System.out.println("Are the front and back letters the same?\n " + sTools.frontAgain(answer5, answer6));
        System.out.println("---------------------\n");
    }
}

