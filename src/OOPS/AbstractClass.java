/*
 * Abstract class
 */
package OOPS;
public class A154 {
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color); // by default, it will be brown unless you call changeColor() methode.

        Chicken c = new Chicken();
        c.walk();
        c.eat();
        h.changeColor(); // changeColor() method called
        System.out.println(h.color); // so will print black

        //Animal a = new Animal();  //Animal is an abstract class. Can't create its instance.
    }
    
}

abstract class Animal{

    String color;
    Animal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("Eats anything......");
    }

    abstract void walk();
}

class Horse extends Animal{

    void changeColor(){
        color = "Black";
    }
    void walk(){
        System.out.println("Walks on 4 limbs.....");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("Walks on 2 legs.....");
    }
}