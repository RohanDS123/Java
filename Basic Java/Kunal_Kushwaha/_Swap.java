import java.util.*;
public class _Swap{
    public static final void main(String[] args){
        Scanner in =  new Scanner(System.in);
        // System.out.println("Enter the first element over here: ");
        // int first = in.nextInt();
        // System.out.println("Enter the second element over here: ");
        // int second = in.nextInt();
        // System.out.println(first);
        // System.out.println(second);
        // System.out.println("After swaping the elements :");
        // int temp = first;
        // first = second;
        // second = temp;
        // System.out.println(first);
        // System.out.println(second);

        // We can also swap the elements of the array - 

        System.out.println("Enter the size of the array here:");
        int size = in.nextInt();
        int arr[] = new int[size];

        // Adding the elements in the array - 
        for(int i = 0;i<size;i++){
            arr[i] = in.nextInt();
        }
        // printing the elements of the array - 
        System.out.println(Arrays.toString(arr));
        System.out.println("After swaping the array elements :");
        swp(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Creating a function for printing the elements of the array after swaping - 
    static void swp(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}