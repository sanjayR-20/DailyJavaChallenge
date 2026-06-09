import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayreverse {
    public static void main(String [] args){
        int [] ogarr = {1,2,3,4,5};
        System.out.println("Original Array -> " + Arrays.toString(ogarr));
        int [] revarr = new int[5];

        for (int i = 0; i < ogarr.length; i++){
            revarr[i] = ogarr[4-i];
        }
        System.out.println("Reversed Array -> " + Arrays.toString(revarr));
    }
}
