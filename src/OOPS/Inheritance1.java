package OOPS;
/*
 * Inheritance
 * Multi level inheritance
 */
public class A149 {

    public static void main(String args[]){
        Dog german = new Dog();
        german.eat();
        german.breathes();
        german.breed = "german sheppard";
        System.out.println(german.breed);
        german.legs = 4;
        System.out.println(german.legs);

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
}

class Dog extends Mammal{
    String breed;
}

