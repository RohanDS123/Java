import java.util.*;
public class scoping{
    public static void main(String[] args){
        int a = 10; 
        int b = 20;
        System.out.println(a);
        random();
        System.out.println(num);
    }
    // Creating a function  here :
    static void random(){
        // System.out.println(a);
        int num = 45;
        System.out.println(num);
    }
}