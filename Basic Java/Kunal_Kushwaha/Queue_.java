import java.util.*;
public class Queue_{
    public static void main(String[] args){
        System.out.println("This is a Queue here");
        // Note - Queue is  a  interface itself not a class :
        Queue <Integer> queue = new LinkedList<>();

        // Adding the elements in the queue:
        for(int i = 5; i > 0; i--){
            queue.add(i);
        }

        // Printing the elements of the Queue :
        System.out.println(queue.peek());

        // Remove the top most element of the Queue - 
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}