import java.util.*;

public class typeCasting{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number here:");
        float num = in.nextInt();
        System.out.println(num);

// I take the input as an integer but it is give value to me as a float . This is automaticaly convert the one data type into the another data type .

// int integer you can add only integer value but in float you can add integer and decimal values that's why we can say float is a greater than int .So whatever you have on the left hand side should be greater than of right hand side.ex - float num = in.nextFloat();

// typeCasting - 
        int n = (int)(78.55f);
        System.out.println(n);
    // We can also do this with user input :
        System.out.println("Enter the number here:");
        float n2 = in.nextFloat();
        int ne = (int) n2 ;
        System.out.println(ne);

// Automatic type promosion in expression : 

        // int a = 258;
        // byte b = (byte)(a);
        // System.out.println(b);

// One more example - 
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/ c;
        System.out.println(d);

// There is a another example :
// American Standard Code for Information Interchange (ASCII)."
        int t = 'A';
        System.out.println(t);

// This is the unicode system of the java programing language.
        System.out.println("नमस्ते");
    }
}  