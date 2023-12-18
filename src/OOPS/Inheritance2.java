package OOPS;
/*
 * Inheritance
 * Hierarical level inheritance
 */
public class A150 {

    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathes();
        shark.color = "White";
        System.out.println(shark.color);
        shark.finnSize = 200;
        System.out.println(shark.finnSize);

        Mammal lion = new Mammal();
        lion.eat();
        lion.walk();

        Bird parrot = new Bird();
        parrot.breathes();
        parrot.fly();

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

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks....");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies...");
    }
}

class Fish extends Animal{
    int finnSize;

    void swim(){
        System.out.println("Swims in water...");
    }
}
