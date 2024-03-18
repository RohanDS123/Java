import java.util.*;
public class IsPrime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number here:");
        int num = in.nextInt();
        boolean ans = isprime(num);
        System.out.println(ans);
    }
    // Creating a function to check number is prime or not.
    static boolean isprime(int num) {
        // This is a very good logic to solve this question :
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        else{        
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    return false;
                }
                else{
                    return true;
                }
            } 
        }
        return true;
    }
}