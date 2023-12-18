package ConditionalStatements;

public class BasicOne {
    public static void main(String args[]){
        int age = 14;

        if(age>+18){
            System.out.println("You are eligible to vote, drive...");
        }

        else if(age >= 13 && age<=18){
            System.out.println("Teenager...");
        }
        else{
            System.out.println("Not eligible...");
        }

    }
    
}
