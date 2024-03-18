import java.util.*;
public class Loop{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number here :");
        int num = in.nextInt();
        int i = 0;
        while (i<num){
            System.out.println(i);
            i = i + 1 ;
        }
    
    // This is the for loop-

        for(int b=0; b<num;b++){
            System.out.println(b);
        }
    
    // This is the basics of if else condition - 
        int a = 10;
        if(a==10){
            System.out.println("Hello word");
        }



    }
}