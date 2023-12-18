/*
 * Constructors
 * Pramerterized constructor
 * Non-Pramerterized constructor
 */
package OOPS;
public class A145 {
    public static void main(String args[]){

        Student s1 = new Student("Kamran");
        System.out.println(s1.name);

        Student s2 = new Student(123);
        System.out.println(s2.rollno);

    }
    
}
class Student{
    
    String name;
    int rollno;

    //Pramerterized constructor
    Student(String name){
        this.name = name;
    }

    //Pramerterized constructor
    Student(int rollno){
        this.rollno = rollno;
    }

    //Non-Pramerterized constructor
    Student(){
        System.out.println("Constructor is called...");
    }
}
