package OOPS;

public class A161 {
    public static void main(String args[]){
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();

    }
    
}
class Vehicle{
    void print(){
        System.out.println("parent class (Vehicle).......");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("child class (car).......");
    }
}