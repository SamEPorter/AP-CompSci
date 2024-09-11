import java.util.Scanner;
public class CtoF {
     public static void main(String[] args){      
       Scanner input = new Scanner(System.in);
       
       System.out.println("*** Celsius --> Fahrenheit ***");
       System.out.print("What temperature would you like to convert to Farenheit?");
       double deg = input.nextDouble();
       System.out.println(deg + "° Celsius in Farenheit is: " + (deg*9/5+32));
       
       // BMI ========================================================
       System.out.println("*** BMI Calculator ***");
       System.out.println("What is your height in Metres?");
       double height = input.nextDouble();
       System.out.println("What is your weight in Kilograms?");
       double weight = input.nextDouble();
       System.out.println("A "+height +"m tall adult who weighs "+weight+"kg has a BMI of " + weight/(height*height));
       
       // Days to Weeks and days
       System.out.println("*** Days --> Weeks and Days ***");
       System.out.println("Enter a number of days: ");
       int days = input.nextInt();
       System.out.println(days + " days is "+ days/7 + " weeks and " + days%7+ "  days");
       
      
       System.out.println("*** Receipt Generator ***");
       System.out.println("Number of units you're buying: ");
       double units = input.nextDouble();
       System.out.println("Price per unit: ");
       double price = input.nextDouble();
       System.out.println("Tax rate: ");
       double tax = input.nextDouble();
       System.out.println("Purchasing "+units+ " units at $" +price+" with " +tax+ "% tax will cost "+ (units*price)*(tax/100+1));
       
      
       System.out.println("*** Sum of digits ***");
       System.out.println("Enter a positive, three-digit number: ");
       int number = input.nextInt();
       int number100 = number/100;
       int number10 = (number-number100*100)/10;
       int number1 = (number-number100*100)%10;
       System.out.println("The sum of the digits of "+ number + " is " + (number100+number10+number1));
     } 
}



