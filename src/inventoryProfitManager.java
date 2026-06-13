import java.util.*;

public class inventoryProfitManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 daily prices:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Prices: " + Arrays.toString(arr));
        logic(arr);
        sc.close();
    }

    public static void logic(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = 0;
        
        int buyDay = 1;  
        int sellDay = 1; 
        int tempBuyDay = 1; 

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] < minPrice) {
                minPrice = arr[i];
                tempBuyDay = i + 1; 
            } 
            
            else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
                buyDay = tempBuyDay;  
                sellDay = i + 1;      
            }
        }

        
        System.out.println("The Maximum profit is " + maxProfit + ". " + 
                           "Where the item is bought on Day " + buyDay + 
                           " and sold on Day " + sellDay + ".");
    }
}
