package BitManipulation;

/*
 * Efficient approach
 * Modular Exponentiation
 */
public class Modular_Exponentiation {

    public static int modularExponentiation(int a, int n, int x){
        int ans = 1;

        a = a % x;

        if(a == 0){
            return 0;
        }

        while(n > 0){

            if((n & 1) != 0){
                ans = (ans * a) % x;

                n = n>>1;
                a = (a * a) % x;
            }
        }
        return ans;
    }

    public static void main(String args[]){

        System.out.println(modularExponentiation(2, 5, 13));

    }
    
}
