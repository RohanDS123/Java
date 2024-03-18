/*
There are two data types in java programing language - 
1. primitive data types
2. none-primitive data type .


Primitive data types in Java include int, float, double, char, boolean, byte, short, long; non-primitive types include objects like String, arrays, and user-defined classes.

*/

import java.util.Scanner;
public class dataType{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your number here :");
        int num = in.nextInt();
        System.out.println(num);
        in.nextLine();

        System.out.println("Enter the your name here ;");
        String name = in.nextLine();
        System.out.println(name);
        
        System.out.println("Enter the any number here :");
        float marks = in.nextFloat();
        System.out.println(marks);

        System.out.println("Enter the first number here :");
        int first = in.nextInt();
        System.out.println("Enter the second number here :");
        int second = in.nextInt();
        int sum = first + second;
        System.out.println(String.format("The sum of %d and %d is %d ",first,second,sum));
    }
}
// Note - We can not further broken of int that's why int is a primitive data type and we can further broken of String that's why String is a none-primitive data type,

// Primitive data type = The data type which we can't break is called primitive data type.
// None - Primitive data type = The data type which we can break is called none-primitive data type.










