package OOPS;/*
 * Class, object and access modifiers 
 * getters and setters
 * Encapsulation
 */

public class A144 {

    public static void main(String args[]){
        
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setColor("White");
        System.out.println(p1.getColor());

        p1.setTip(15);
        System.out.println(p1.getTip());

        Bank myAcc = new Bank();
        myAcc.username = "Kamran";
        System.out.println(myAcc.username);

        //myAcc.password = "Kamran#14564";    //password not visible error because it is private
        myAcc.setPassword("asdfg");
        System.out.println(myAcc.getPassword());
        
        
    }

}

class Bank{
    public String username;
    private String password;

    String getPassword(){
        return this.password;
    }

    void setPassword(String password){
        this.password = password;
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
