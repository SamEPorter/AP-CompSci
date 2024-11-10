 import java.util.Scanner;
public class ReviewDriver {
    Scanner input1 = new Scanner(System.in);
    /*
    public static void main(String[] args) {
        double a = Review.sentimentVal("stuff");
        System.out.println(a);
    }
    */
    
   
    public static void main(String[] args) {
        /* String whole = Review.textToString("SimpleReview.txt");
        whole = Review.removePunctuation(whole);
        whole.
        while (whole.indexOf(" ") >= 0) {
            int fsi = whole.indexOf(" ");
            String word = whole.substring(0, fsi);
            System.out.println(word);
            whole = whole.substring(fsi+1);
        } */
        
        System.out.println(Review.fakeReview("happy.txt"));
        
        
    }
}