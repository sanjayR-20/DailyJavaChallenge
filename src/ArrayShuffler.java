import java.util.*;
public class ArrayShuffler{
    static void main(String [] args){
        ArrayList<Integer> value = new ArrayList<>();
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the items in the inventory( -1 to stop ) : ");
        while(sc.hasNextInt()){
            input = sc.nextInt();
            if(input == -1) {
                break;
            }
            value.add(input);
        }
        System.out.println(value);
        logic(value);
    }
    public static void logic(ArrayList<Integer> value) {
        int zeros = 0;

        ListIterator<Integer> i = value.listIterator();

        while(i.hasNext()){
            if(i.next() == 0){
                value.remove(i);
                zeros++;
            }
        }

        while (zeros-- > 0) {
            value.add(0);
        }

        System.out.println(value);
    }
}
