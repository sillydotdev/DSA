package BitManipulation;

/*
 * Add 1 to an integer using bit Manipulation
 * (Hint: use NOT operator)
 */
public class AddOneToInteger {

    public static int addOne(int a){
        return (-(~a));
    }
    public static void main(String args[]){

        //One way
        System.out.println(addOne(13));
        
        //2nd way of doing it
        int x = 6;
        System.out.println(x + " + " + 1 + " is: " + -~x);

        x = -4;
        System.out.println(x + " + " + 1 + " is: " + -~x);

        x = 0;
        System.out.println(x + " + " + 1 + " is: " + -~x);

    }
    
}
