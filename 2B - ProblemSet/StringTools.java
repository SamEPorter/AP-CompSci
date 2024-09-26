
/**
 * Sam Porter
 * Sept 25th, 2024
 * Problem set 2B
 */

public class StringTools {
    
    
    
//solution method for problem 1
public String lastLetter(String str) {
   //int len = str.length();
   return str.substring(str.length()-1);
}

public String formatPhoneNumber(String str1) {
    return "(" + str1.substring(0,3) + ") " + str1.substring(3,6) +  
    "-" + str1.substring(6,10);
}

public String middleThree(String str2) {
    return str2.substring(str2.length()/2-1, str2.length()/2+2);
}

public String swapLastTwo (String str3) {
    return str3.substring(0, str3.length()-2) + str3.substring(str3.length()-1) +
    str3.substring(str3.length()-2, str3.length()-1);
}

public boolean frontAgain (String str4, int n) {
    return str4.substring(0,n).equals(str4.substring(str4.length()-n));
}

}


