import java.util.*;


public class validAnagram {
    public static void main(String [] args){
        String s,t;
        System.out.println("Enter the S word: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("Enter the t word: ");
        t = sc.nextLine();
        System.out.println("The input words are: " + s + " and " + t);
        logic(s,t);
    }
    public static void logic(String s, String t){
        char [] arr1 = s.toCharArray();
        char [] arr2 = s.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)) {
            System.out.println("The words are anagram");
        }
        else{
            System.out.println("The words are not anagram");
        }
    }
}

