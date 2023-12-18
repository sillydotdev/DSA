/*
 * Interfaces
 * multiple inheritance
 */
package OOPS;
public class A157 {
    public static void main(String args[]){
        Bear b = new Bear();
        // b.isHerbivore();
        // b.isCarnivore();
        b.eats();
        

    }
    
}

interface Herbivore{
    //void isHerbivore();
    void eats();
}

interface Carnivore{
    //void isCarnivore();
    void eats();
}

class Bear implements Herbivore, Carnivore{
    // public void isHerbivore(){
    //     System.out.println("Eats grass.........");
    // }

    // public void isCarnivore(){
    //     System.out.println("Easts meat as well.......");
    // }

    public void eats(){
        System.out.println("Eats grass.........");
    }

    

}

