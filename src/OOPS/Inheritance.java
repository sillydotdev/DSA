/*
 * Inheritance
 * Single level inheritance
 */
package OOPS;
public class A148 {

    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathes();
        shark.color = "White";
        System.out.println(shark.color);
        shark.finnSize = 200;
        System.out.println(shark.finnSize);

    }
    
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats meat...");
    }

    void breathes(){
        System.out.println("breathes oxygen...");
    }
}

class Fish extends Animal{
    int finnSize;

    void swim(){
        System.out.println("Swims in water...");
    }
}
