/*
 * Polymorphism
 * Method Overriding
 */
package OOPS;
public class A153 {
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();

        Dear d = new Dear();
        d.eat();

    }
    
}

class Animal{
    void eat(){
        System.out.println("eats anythiung.....");
    }
}

class Dear{
    void eat(){
        System.out.println("eats grass......");
    }
}
