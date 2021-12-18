/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PalindromeChecker.java
 * Author: Frank M. Carrano
 * Author: Timothy M. Henry
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment3partb;
import java.util.Stack;
import java.util.Scanner;

//
// - Do not change the "main" method.
// - Please ADD CODE to complete implementing the program
//
public class PalindromeChecker {

    private static boolean isPalindrome(String  string) {
      Stack stack = new Stack();
      boolean result = true;
      for (int i = 0; i < string.length(); i++){
          stack.push(string.charAt(i));
      }
      
      String reverseString = "";
      
      while (!stack.isEmpty()) {
          reverseString = reverseString + stack.pop();
      }
       
      if (string.replaceAll("\\p{Punct}", "").replaceAll("\\s" , "").toLowerCase().equals(reverseString.replaceAll("\\p{Punct}", "").replaceAll("\\s" , "").toLowerCase())){
            result = true;
      }
      else {
            result = false;
      }      
      return result;
    } 

    //
    // - Do not change the "main" method.
    // - Please ADD CODE to complete implementing the program
    //
    public static void main(String[] args) {
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
        Scanner input = new Scanner(System.in);
        System.out.print("[>>] Enter a string (or a ! to exit): ");
        String string = input.nextLine();

        while (!string.equals("!")) {
            if (isPalindrome(string)) {
                System.out.println(" [+] Yes. \"" + string + "\" IS a palindrome!");
            } else {
                System.out.println(" [-] No. \"" + string + "\" is NOT a palindrome!");
            }
            System.out.print("[>>] Enter a string: ");
            string = input.nextLine();
        }

        System.out.println("[<<] Thank you!");
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
    }
}