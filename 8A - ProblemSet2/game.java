import java.util.Scanner;
import java.util.ArrayList;

public class game {
    static String[][] grid;
    public static void main(String[] args) {
        InitializeGrid();
        printGrid();

        Scanner input = new Scanner(System.in);

        //String a2 = input.nextLine
        ArrayList<String> answers = new ArrayList<String>();
        //int TurnCount = answers.size();
        boolean turnX = true;
        boolean Ongoing = true;
        boolean valid = false;
        boolean playAgain = true;

        // DOESNT WORK ASK MR. P
        while (playAgain) {
            while(!WinX() && !WinCircle() && !Tie()) {

                if (turnX) {

                    System.out.println("\nPlayer 1's turn\nPlease choose a spot to place an X (row,col)");
                    String a1 = input.nextLine(); 

                    while (!Compatible(a1)) {
                        System.out.println("\nPlayer 1's turn\nTry again");
                        a1 = input.nextLine();                   
                    }

                    answers.add(a1);
                    AddX(answers.get(answers.size()-1));  
                    turnX = false;

                } else if (!turnX) {

                    System.out.println("\nPlayer 2's turn\nPlease choose a spot to place an Circle (row,col)");
                    String a1 = input.nextLine();    

                    while (!Compatible(a1)) {
                        System.out.println("\nPlayer 2's turn\nTry again");
                        a1 = input.nextLine();
                    }

                    answers.add(a1);
                    AddCircle(answers.get(answers.size()-1));  
                    turnX = true;

                }
            }
            if (WinX()) System.out.println("\nPlayer 1 Wins!!!");
            else if (WinCircle()) System.out.println("\nPlayer 2 Wins!!!");
            else if (Tie()) System.out.println("\nIt's a Tie!");

            String Restart = input.nextLine();
            if (Restart.length() > 0) {
                InitializeGrid();
                printGrid();
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
    }

    public static void printGrid() {
        System.out.println("  1  2  3");
        for (int row = 0; row < grid.length; row++) {
            System.out.print(row+1);
            for (int col = 0; col < grid[0].length; col++) {

                System.out.print("["+grid[row][col]+"]"); 
            }
            System.out.println();
        }

    }

    public static void InitializeGrid() {
        grid = new String[3][3];
        String blank = " ";

        for (int row = 0; row < grid.length; row++) {        

            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = blank;
            }
        }

    }

    public static void AddX(String a) {
        int row = Integer.parseInt(a.substring(0, 1));
        int col = Integer.parseInt(a.substring(2));
        grid[row-1][col-1] = "X";
        printGrid();
    }

    public static void AddCircle(String a) {
        int row = Integer.parseInt(a.substring(0, 1));
        int col = Integer.parseInt(a.substring(2));
        grid[row-1][col-1] = "O";
        printGrid();
    }

    public static boolean Compatible(String a) {
        if(Integer.parseInt(a.substring(0, 1)) > 0 && Integer.parseInt(a.substring(0, 1)) <= 3) {
            if(Integer.parseInt(a.substring(2)) > 0 && Integer.parseInt(a.substring(2)) <= 3) {
                if(grid[Integer.parseInt(a.substring(0, 1))-1][Integer.parseInt(a.substring(2))-1].equals(" ")) {
                    return true;
                }
            }
        } 
        return false;       
    }

    public static boolean WinX() {
        /**             row wins            **/
        if (XatLoc(1,1) && XatLoc(1,2) && XatLoc(1,3)) return true;
        else if (XatLoc(2,1) && XatLoc(2,2) && XatLoc(2,3)) return true;   
        else if (XatLoc(3,1) && XatLoc(3,2) && XatLoc(3,3)) return true; 
        /**             Column wins            **/
        else if (XatLoc(1,1) && XatLoc(2,1) && XatLoc(3,1)) return true; 
        else if (XatLoc(1,2) && XatLoc(2,2) && XatLoc(3,2)) return true; 
        else if (XatLoc(1,3) && XatLoc(2,3) && XatLoc(3,3)) return true;
        /**             Diagonal wins            **/
        else if (XatLoc(1,1) && XatLoc(2,2) && XatLoc(3,3)) return true; 
        else if (XatLoc(3,1) && XatLoc(2,2) && XatLoc(1,3)) return true; 
        else return false;
    }

    public static boolean WinCircle() {
        /**             row wins            **/
        if (OatLoc(1,1) && OatLoc(1,2) && OatLoc(1,3)) return true;
        else if (OatLoc(2,1) && OatLoc(2,2) && OatLoc(2,3)) return true;   
        else if (OatLoc(3,1) && OatLoc(3,2) && OatLoc(3,3)) return true; 
        /**             Column wins            **/
        else if (OatLoc(1,1) && OatLoc(2,1) && OatLoc(3,1)) return true; 
        else if (OatLoc(1,2) && OatLoc(2,2) && OatLoc(3,2)) return true; 
        else if (OatLoc(1,3) && OatLoc(2,3) && OatLoc(3,3)) return true;
        /**             Diagonal wins            **/
        else if (OatLoc(1,1) && OatLoc(2,2) && OatLoc(3,3)) return true; 
        else if (OatLoc(3,1) && OatLoc(2,2) && OatLoc(1,3)) return true; 
        else return false;
    }

    public static boolean XatLoc(int row, int col) {
        if (grid[row-1][col-1].equals("X")) return true;
        return false;
    }

    public static boolean OatLoc(int row, int col) {
        if (grid[row-1][col-1].equals("O")) return true;
        return false;
    }

    public static boolean Tie() {
        if (Used(1,1) && Used(1,2) && Used(1,3) &&
        Used(2,1) && Used(2,2) && Used(2,3) &&
        Used(3,1) && Used(3,2) && Used(3,3)) return true;
        return false;
    }

    public static boolean Used(int row, int col) {
        if (grid[row-1][col-1].equals("O") || grid[row-1][col-1].equals("O")) return true;
        return false;
    }

}
