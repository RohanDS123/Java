import java.util.*;
public class Stack_{
    public static void main(String[] args){
        // Creating  a stack here:
        // Note - Stack is a class itself.
        System.out.println("This is a stack data structure : ");
        Stack <Integer> my = new Stack <>();
        // Adding the elements in the stack:
        for(int i = 0; i < 5; i++){
            my.push(i);
        }

        // The peak element in stack is used to retreive the top element without removing it.
        System.out.println(my.peek());
        
        // Printing the elements of the stack:
        for(int i = 0; i < 5; i++){
            System.out.println(my.pop());
        }
    }
}


// Note - Push that means inserting the elemenet and pop that means remove the elements.
