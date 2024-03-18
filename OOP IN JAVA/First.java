// This is the first class - 
public class First{
    public static void main(String[] args){
        Student Rohan = new Student("Danish zehen",99.0f,55);
        // Student Rahul = new Student();

        // Rohan.name = "Rohan Rathore";
        // Rohan.rollno = 54;
        // Rohan.marks = 10.3f;

        System.out.println(Rohan.name);
        System.out.println(Rohan.rollno);
        System.out.println(Rohan.marks);

        // System.out.println(Rahul.name);
        // System.out.println(Rahul.rollno);
        // System.out.println(Rahul.marks);

        // Calling the function - 
        Rohan.changeName("Satish Rathore");
        Rohan.Greating();

    }
}

    // Creating the class - 
class Student{
    int rollno;
    String name;
    float marks;

    void Greating(){
        System.out.println("My name is " + this.name);
    }
    // Change name over here:
    void changeName(String newname) {
        System.out.println("The new name is  = " + newname);
        name = newname;
    }

        Student(String name,float marks,int rollno){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}
