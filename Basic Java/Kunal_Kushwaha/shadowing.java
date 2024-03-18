import java.util.*;
public class shadowing{
    static int x = 90;   // This will be shadowed at line 8 .   
    public static void main(String[] args){
        System.out.println(x);
        int x = 100;
        System.out.println(x);
        fun();
    }
    // Creating the new function over here :
    static void fun(){
        System.out.println(x);
    }
}   