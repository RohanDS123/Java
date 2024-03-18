import java.util.*;
public class swap{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number over hre:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number over hre:");
        int num2 = in.nextInt();
        swp(num1,num2); 

    }
    // Creating the function which swaping of two variable - 
    static void swp(int num1, int num2){
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;
    // Without creating third variable - 
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " " + num2);
        
    // This change will be valid in this functions scope only .
    }
}