package OOPS;
/*
 * Hybrid inheritance
 */
public class A151 {
    public static void main(String args[]){
        Shark ss = new Shark();
        ss.finnSize = 200;
        System.out.println(ss.finnSize);
        ss.swim();
        ss.eat();

        Parrot pp = new Parrot();
        pp.fly();
        pp.color = "Green";
        System.out.println(pp.color);
        pp.fly();
        pp.breathes();
    }
    
}

class Animal{
    void eat(){
        System.out.println("eats.....");
    }
    void breathes(){
        System.out.println("breathes...");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims....");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies...");
    }
}

class Shark extends Fish{
    int finnSize;
}

class Parrot extends Bird{
    String color;
}