package OOPS;

/*
 * static keyword
 * static varialbles
 * static methods
 */
public class A158 {

    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "JNV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        int a = s2.cgpa(80, 70, 80);
        System.out.println(a);

    }
    
}

class Student{

    String name;
    int rollno;
    static String schoolName; //static variable

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    //static method
    static int cgpa(int chem, int math, int phy){
        return (chem + math + phy)/3;
    }
}
