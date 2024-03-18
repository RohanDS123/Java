import java.util.*;
public class sum{
    public static void main(String[] args){
        int ans = sum();
        System.out.println(ans);
    }
    // Creating the functin here for sum of two numbers - 
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number here: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number here: ");
        int num2 = in.nextInt();
        System.out.print("The sum of two number is  = ");
        int add  = num1 + num2;
        return add;
    }
}