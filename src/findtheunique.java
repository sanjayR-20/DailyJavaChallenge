import java.util.HashMap;

public class findtheunique {
//    the problem is to find the unique value among the list of duplicate values.
    public static void main(String [] args){
        int [] arr = {2,3,2,2,3,4,5,6,6,2,3,12,12,18};
        UniqueFinder(arr);

    }
    public static void UniqueFinder(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i : arr){
            hash.put(i,hash.getOrDefault(i,0)+1 );
        }
        for(int i : hash.keySet()){
            if(hash.get(i) == 1){
                System.out.println(i-1 + hash.get(i));
            }
        }
    }
}
