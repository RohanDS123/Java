import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the numbere here :");
        // int num = in.nextInt();
        // System.out.println(Armstrong(num));
        for(int i = 100; i < 1000; i++){
            if(Armstrong(i)){
                System.out.println(i + " ");
            }
        }

    }
    // Creating a function to check this is ArmstrongNumber or not :
    static boolean Armstrong(int num){
        int sum = 0;
        int original = num;
        while(num>0){
            int remain = num % 10;
            sum = sum + remain * remain * remain ;
            num = num / 10;
        }
        return sum == original;

    // With the help of for loop - 
        // int sum = 0;
        // int original = num;
        // for(int i = 0; i<3; i++){
        //     int remain = num % 10;
        //     sum = sum + remain * remain * remain;
        //     num = num / 10;
        // }
        // return sum == original;
    }
}