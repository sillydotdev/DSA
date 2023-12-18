package MethodsFunctions;

/*
 * Factorial and binomial coefficient
 */
public class FactorialAndBinomialCoefficient {

    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;

        }
        return f;
    }

    public static int binomialCoefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int binomialCoefficient = fact_n/(fact_r * fact_nr);
        return binomialCoefficient;

     }
    public static void main(String args[]){
       //int fact = factorial(4);
       //System.out.println(fact);
       /* ----- OR----- */
       System.out.println("Factorial is: "+factorial(4));
       System.out.println("Binomial corfficient is: "+binomialCoefficient(5, 2));

    }
    
}
