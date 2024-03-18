import java.util.*;
public class function{
    public static void main(String[] args){
        sum();
        System.out.println();
        String ans = greating();
        System.out.println(ans);    
        int rslt = sum2(20,30);
        System.out.println(rslt);
        String get = getDailyLife();
        System.out.println(get);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your name here: ");
        String name = in.nextLine();
        String info = message(name);
        System.out.println(info);

    }
    
    // This is the function - 
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number here:");
        int first = in.nextInt();
        System.out.print("Enter the second number here:");
        int second = in.nextInt();
        int sum = first + second ;
        System.out.printf("The sum of %d and %d is  = %d ",first,second,sum);
    }

    // This is a another function here:

    static String greating(){
        String message = "How are you?";
        return message ;
    }

    // This is the sum function - 
    static int sum2(int first, int second){
        int sum = first + second ;
        return sum;
    }

    // Creating the another function which provide the some information about the daily life:
    static String getDailyLife(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the your name here: ");
        String name = in.nextLine();
        System.out.println("Enter the your village name here : ");
        String villageName = in.nextLine();
        return "My name is " + name + " and my village is " + villageName ;
    }

    // Creating another function which is provide message to you Hello Rohan Rathore.
    static String message(String name){
        return "Hello " + name ;
    }

}