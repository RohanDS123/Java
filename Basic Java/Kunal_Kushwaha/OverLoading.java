import java.util.*;
public class OverLoading{
    public static void main (String[] args){
        fun(3);
        fun("Rohan Rathore");
    }
    // Creating the first function over here :
    static void fun(int a ){
        System.out.println(a);
    }
    // Creating the second function with same name :
    static void fun(String name){
        System.out.println(name);
    }

    // We can create the two function with same name but the important thing is parameter must be different .
}