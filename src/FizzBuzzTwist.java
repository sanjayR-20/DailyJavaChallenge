//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FizzBuzzTwist {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            if( (i % 5 == 0) && (i % 3 == 0)){
                System.out.println(i + "  ->  FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println(i + "  ->  Fizz");
            }
            else if( i % 5 == 0){
                System.out.println(i + "  ->  Buzz");
            }
            else{
                continue;
            }
        }
    }
}

