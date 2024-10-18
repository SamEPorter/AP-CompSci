import java.util.Scanner;
public class Guess100 {
    public static void main(String[]args) {
Scanner input = new Scanner(System.in);
int num = (int) (Math.random()*100)+1;
int Answer = 0;
int tries = 0;
System.out.println("Guess a number between 1 and 100");
while (Answer != num) {
    Answer = input.nextInt();
    if (Answer > num) System.out.println("Nope, Too High!");
    if (Answer < num) System.out.println("Nope, Too Low!");
    tries++;
}

System.out.println("You Got It! It took you "+tries+" tries!");
}
}