import java.util.Arrays;
public class Varargs {
    public static void main(String[] args){
        fun(1,2,3,4,5,5,6,6);
        multiple(2,5,"Rohan Rathore");
    }
    // Creating a function for variable length arguments - 
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
    // Creating an Other array over here:
    static void multiple(int a,int b ,String ...v){
        System.out.println(Arrays.toString(v));
    }
} 