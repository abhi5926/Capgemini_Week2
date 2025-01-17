import java.util.Scanner;
import java.util.*;
public class PalindromeChecker {
    // Attribute to hold the text
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int length = text.length();

        // Compare characters from the start and end of the string
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false; // If characters do not match, it's not a palindrome
            }
        }

        return true; // If all characters match, it's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text +  " is a palindrome.");
        } else {
            System.out.println( text +" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
		
        // Example usage
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult(); // Output: "madam" is a palindrome.

        PalindromeChecker checker2 = new PalindromeChecker("hello");
        checker2.displayResult(); // Output: "hello" is not a palindrome.
    }
}
