import java.util.*;



public class inventoryProfitManager{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        logic(arr);
    }
    public static void logic(int [] arr){
        int lowest = arr[0];
        int highest = arr[0];
        for(int i = 1; i < 6; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }
            else if (arr[i] > highest ){
                highest = arr[i];
            }
        }
        int profit = highest - lowest;
        System.out.println("The Maximum profit is " + profit + ". " + "Where the item is bought on " + lowest + " day of the week and sold on " + highest + " day of the week");
    }
}