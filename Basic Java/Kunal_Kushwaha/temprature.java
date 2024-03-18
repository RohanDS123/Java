import java.util.*;
public class temprature{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your tamprature value here: ");
        float temC = in.nextFloat();
        float temF = (temC*9/8) + 32;
        System.out.printf("The value %.2f is  = %.2f" ,temC,temF);

    }
}