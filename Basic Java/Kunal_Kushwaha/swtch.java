import java.util.*;
public class swtch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number here :");
        int num = in.nextInt();

        /*
        Some condition of switch statement - 
        1. The type of input must same as inside the case statement .
        2. Duplicate value is not allowed here.
        3. break is basicaly used to terminate the sequence.
        4. if break is not used then condition will be continuous.
        5. default will be exucute when no one codition will execute.
        6. if defalut is not at the end put break after it.
        */


        switch(num){
            case 1:
                System.out.println("This is the case number 1");
                break;
            case 2:
                System.out.println("This is the case number 2");
                break;
            case 3:
                System.out.println("This is the case number 3");
                break;
            case 4:
                System.out.println("This is the case number ");
                break;
            default:
                System.out.println("This is the default case over here:");
        }

    // Another example of switch case - 
            System.out.println("Enter the name of your fruit here:");
            String fruit = in.next();
            switch (fruit){
                case "Mango":
                    System.out.println("King of fruit!");
                    break;
                case "Apple":
                    System.out.println("Nice red apple!");
                    break;
                case "Papaya":
                    System.out.println("Healthy fruit!");
                    break;
                case "Orange":
                    System.out.println("This is the source of vitain C");
                    break;
                case "Pomegranade":
                    System.out.println("Necessary for RBC(RED BLUD CELLS)");
                default:
                    System.out.println("There is not food here:");
            }

        // This is similar concept of if and else statement - 
            System.out.println("Enter the number here : ");
            int number = in.nextInt();
            if(number==8){
                System.out.println("This is number 8");
            }
            else if(number==9){
                System.out.println("This is number 9");
            }
            else{
                System.out.println("There is no number here:");
            }
            in.nextLine();  // This is neccessary to add newLine over here:


        // We can also apply the switch condition over here:
            
            System.out.println("Enter the your name over here : ");
            String name = in.nextLine();
            switch(name){
                case "Rohan" -> System.out.println("This  is Rohan : ");
                case "Rohit" -> System.out.println("This  is Rohit : ");
                case "Mahesh" -> System.out.println("This  is Mahesh : ");
                case "Hivesh" -> System.out.println("This  is Hivesh : ");
                default  -> System.out.println("This is the default case over here: ");

            }
            in.nextLine();

        // This is the example of nested switch case - 
        System.out.println("Enter the you emp id here:");
        int empId = in.nextInt();
        in.nextLine();
        System.out.println("Enter the you department here:");
        String department = in.nextLine();

        switch(empId) {
            case 1 :
                System.out.println("your employee id is one");
            case 2:
                System.out.println("your employee id is two");
            case 3:
                switch(department) {
                    case "IT" :
                        System.out.println("You department is IT");
                    case "Management" :
                        System.out.println("You department is Management");
                }
        }


    }
}