import java.util.*;
public class commandparser{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome : \n");
        String inputString = sc.nextLine();
        String formattedString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();
        palindromeChecker(formattedString);
    }
    public static void palindromeChecker( String formattedString){
        String reversedString = new StringBuilder(formattedString).reverse().toString();
        if (formattedString.equals(reversedString)){
            System.out.println("It is a Palindrome!");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}