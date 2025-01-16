import java.util.Scanner;

public class FractionGame {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        Fraction frac1 = new Fraction();        
        Fraction frac2 = new Fraction();

        frac1.randomize();
        frac2.randomize();

        boolean playing = true;
        int gamesPlayed = 0;
        int wins = 0;

        Fraction guessFrac = new Fraction();

        int operator =  1;
        while (playing == true) {
            frac1.randomize();
            frac2.randomize();
            operator = (int) (Math.random() * 4) + 1;
            
            // ADD
            if (operator == 1) {
                System.out.println ("What is "+ frac1 + " + " + frac2 + "?");
                Fraction answer = Fraction.add(frac1, frac2);
                answer.reduce();
                String guess = input.nextLine();

                //Compare answer to guess
                if (answer.toString().equals(guess)) {
                    System.out.println("Correct!");
                    wins += 1;
                    gamesPlayed += 1;
                } else if ("quit".equals(guess)) {
                    playing = false;
                    System.out.println("Game Over!\nYou Played " +
                    gamesPlayed + " games and won " + wins + " of them.\n" +
                    "your win rate was " + (int) (.5+ (double) wins/gamesPlayed*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    gamesPlayed += 1;
                    
                }
            }
            
            // SUBTRACT
            if (operator == 2) {
                System.out.println ("What is "+ frac1 + " - " + frac2 + "?");
                Fraction answer = Fraction.subtract(frac1, frac2);
                answer.reduce();
                String guess = input.nextLine();

                //Compare answer to guess
                if (answer.toString().equals(guess)) {
                    System.out.println("Correct!");
                    wins += 1;
                    gamesPlayed += 1;
                } else if ("quit".equals(guess)) {
                    playing = false;
                    System.out.println("Game Over!\nYou Played " +
                    gamesPlayed + " games and won " + wins + " of them.\n" +
                    "your win rate was " + (int) (.5+ (double) wins/gamesPlayed*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    gamesPlayed += 1;
                    
                }
            }
            
            // DIVIDE
            if (operator == 3) {
                System.out.println ("What is "+ frac1 + " divided by " + frac2 + "?");
                Fraction answer = Fraction.divide(frac1, frac2);
                answer.reduce();
                String guess = input.nextLine();

                //Compare answer to guess
                if (answer.toString().equals(guess)) {
                    System.out.println("Correct!");
                    wins += 1;
                    gamesPlayed += 1;
                } else if ("quit".equals(guess)) {
                    playing = false;
                    System.out.println("Game Over!\nYou Played " +
                    gamesPlayed + " games and won " + wins + " of them.\n" +
                    "your win rate was " + (int) (.5+ (double) wins/gamesPlayed*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    gamesPlayed += 1;
                    
                }
            }
            
            // MULTIPLY
            if (operator == 4) {
                System.out.println ("What is "+ frac1 + " * " + frac2 + "?");
                Fraction answer = Fraction.multiply(frac1, frac2);
                answer.reduce();
                String guess = input.nextLine();

                //Compare answer to guess
                if (answer.toString().equals(guess)) {
                    System.out.println("Correct!");
                    wins += 1;
                    gamesPlayed += 1;
                } else if ("quit".equals(guess)) {
                    playing = false;
                    System.out.println("Game Over!\nYou Played " +
                    gamesPlayed + " games and won " + wins + " of them.\n" +
                    "your win rate was " + (int) (.5+ (double) wins/gamesPlayed*100) + "%");
                } else {
                    System.out.println("Wrong, the answer was "+ answer.toString() + ".");
                    gamesPlayed += 1;
                    
                }
            }

            
        }
        
    
    }
}
