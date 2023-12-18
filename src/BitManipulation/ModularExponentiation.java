package BitManipulation;

/*
 * Modular Exponentiation
 * Inputs: a = 2, n = 5, x = 13
 * OUtput: 3
 * Explanation: 2^3 % 13 = 32 % 13 = 6
 * 
 */
public class ModularExponentiation {

    public static int modularExponentiation(int a, int n, int x){
        int ans = 1;
        
        while(n > 0){
            if((n & 1) != 0){ //Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans % x;
    }

    public static void main(String args[]){
        int a = 2;
        int n = 5;
        int x = 13;
         
        int mod = modularExponentiation(a, n, x);
        System.out.println(mod);

        System.out.println(modularExponentiation(2, 3, 5));

    }
    
}
