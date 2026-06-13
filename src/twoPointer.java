import java.util.*;

public class twoPointer {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        
        // Fixed prompt from String to Integers
        System.out.println("Enter the integers in Ascending order : "); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();
        
        int [] result = logic(arr, target);
        System.out.println("Indices found: " + Arrays.toString(result));
    }
    
    public static int[] logic(int [] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
    
        
        while (left < right) { 
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return new int[]{left, right}; 
            }
            else if (sum > target) {
                right--;
            }
            else{
                left++;  
            }
        }
        
        return new int[]{-1, -1}; 

    }
}
