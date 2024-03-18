import java.util.Scanner;  // java package and inside this package Scanner class .

public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your name here : ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println(sc.nextInt());
    }
} 