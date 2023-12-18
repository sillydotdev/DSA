package MultiplePatterns;/*
 * Advanced Patterns
 */


public class A75 {

    //Hollow rectangle pyramid
    public static void hollow_rectangle(int rows, int cols){
        //outer loop for number of rows
        for(int i=1; i<=rows; i++){
            //inner loop for number of cols
            for(int j=1; j<=cols; j++){
                //(i,j)
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Inverted rotated halp pyramid
    public static void inverted_Rotated_Half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    //Invert half pyramid with numbers
    public static void inverted_half_pyramid_withNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //Floyd's triangle
    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    // Butterfly pattern
    public static void butterfly_pattern(int n){

        //Upper half
        for(int i=1; i<=n; i++){

            //print i stars = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //print spces 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //print stars again = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //Lower half
        for(int i=n; i>=1; i--){

            //print i stars = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //print spces 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //print stars again = i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();


        }

    }

    // Solid Rhombus
    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // Hollow Rhombus
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }


    // Diamond Pattern
    public static void diamond_pattern(int n){
        //Upper half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String args[]){
        hollow_rectangle(10, 15);
        inverted_Rotated_Half_Pyramid(5);
        inverted_half_pyramid_withNumbers(5);
        floyds_triangle(5);
        zero_one_triangle(5);
        butterfly_pattern(5);
        solid_rhombus(7);
        hollow_rhombus(8);
        diamond_pattern(5);
    }
    
}
