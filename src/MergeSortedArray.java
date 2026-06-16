import java.util.*;



public class MergeSortedArray {
    public static void main(String [] args){
        int m,n;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the no. of elements of array 1: ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements of array 1: ");
        while(true){
            String value = sc.nextLine();
            if(value.trim().isEmpty()){
                break;
            }else{
                arr1.add(Integer.parseInt(value.trim()));
            }
        }



        System.out.println("\nEnter the no. of elements of array 2: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements of array 2: ");
        while(true){
            String value = sc.nextLine();
            if(value.trim().isEmpty()){
                break;
            }else{
                arr2.add(Integer.parseInt(value.trim()));
            }
        }

        System.out.println(arr1);
        System.out.println(arr2);

        arr1.subList(arr1.size() - n, arr1.size()).clear();
        for(int i = 0; i < m; i++){
            int merger = arr2.get(i);
            arr1.add(merger);
        }

        Collections.sort(arr1);
        System.out.println(arr1);
    }
}
