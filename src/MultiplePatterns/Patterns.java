public class Patterns {

// * * * *   
// * * * *  
// * * * *  
// * * * *   
    public static void squarePattern(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// *
// **
// ***
// ****
    public static void patternTwo(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4
    public static void pattern3(int n) {
        for(int i=1; i<n; i++){
            for(int j=1; j<i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
// 6 6 6 6 6 6
    public static void pattern4(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 
    // public static void pattern5(int n) {
    //     for(int i=1; i<=n; i++){
    //         for(int j=n; j>=i; j--){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1 2 3 4 5 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1 
    public static void pattern6(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //           * 
    //         * * * 
    //       * * * * * 
    //     * * * * * * * 
    //   * * * * * * * * * 
    // * * * * * * * * * * * 
    public static void pattern7(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // * * * * * * * 
    //   * * * * * 
    //     * * * 
    //       * 
    public static void pattern8(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<2*n-(2*i+1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
// * * * * * * * * * * * 
// * * * * * * * * * * *
//   * * * * * * * * * 
//     * * * * * * * 
//       * * * * * 
//         * * * 
//           * 
    public static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // * 
    public static void pattern10(int n) {
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i > n){
                stars = (2*n - i);
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1 
    // 0 1 
    // 1 0 1 
    // 0 1 0 1 
    // 1 0 1 0 1 
    public static void pattern11(int n) {
        // int start = 1;
        // for(int i=0; i<n; i++){
        //     if(i % 2 == 0){
        //         start = 1;
        //     }else{
        //         start = 0;
        //     }
        //     for(int j=0; j<=i; j++){
        //         System.out.print(start+" ");
        //         start = 1-start;
        //     }
        //     System.out.println();
        // }
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

    
    // 1                 1 
    // 1 2             2 1 
    // 1 2 3         3 2 1 
    // 1 2 3 4     4 3 2 1 
    // 1 2 3 4 5 5 4 3 2 1 
    public static void pattern12(int n) {
        int space = 2*(n-1);
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            //space
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
            space -= 2;
        }
        
    }

   
    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    // 11 12 13 14 15 
    // 16 17 18 19 20 21 
    public static void pattern13(int n) {
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
    // A 
    // A B 
    // A B C 
    // A B C D 
    // A B C D E  
    public static void pattern14(int n){
        for(int i=0; i<n; i++){
            for(char ch = 'A'; ch<= 'A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

// A B C D E 
// A B C D 
// A B C 
// A B 
// A 
    public static void pattern15(int n) {
        for(int i=0; i<n; i++){
            for(char ch = 'A'; ch <= 'A'+(n-i-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
// A 
// B B 
// C C C 
// D D D D 
// E E E E E 
    public static void pattern16(int n) {
        for(int i=0; i<n; i++){
            char ch = (char) ('A'+i);
            for(int j=0; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();

        }

    }
    
//         A 
//       A B A 
//     A B C B A 
//   A B C D C B A 
// A B C D E D C B A 
    public static void pattern17(int n) {
        
        for(int i=0; i<n; i++){
            char ch = 'A';
            int breakPoint = (2 * i + 1) / 2;
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            //characters
            for(int j=1; j<= 2*i+1; j++){
                System.out.print(ch+" ");
                if(j<= breakPoint) ch++;
                else ch--;
            }
            System.out.println();
        }

    }
    

// E 
// D E 
// C D E 
// B C D E 
    public static void pattern18(int n) {
        for(int i=0; i<4; i++){
            for(char j = (char)('E'-i); j<='E'; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
    public static void pattern19(int n) {
        int initialSpace = 0;
        for(int i=0; i<n; i++) {
            //stars
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<initialSpace; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            initialSpace += 2;
            System.out.println();         
        }
        initialSpace = 2 * n - 2;
        for(int i=1; i<=n; i++) {
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0; j<initialSpace; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            initialSpace -= 2;
            System.out.println();         
         }
    }
    
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *  
    public static void pattern20(int n) {
        int spaces = 2 * n - 2;
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i > n) stars = 2 * n - i;
            //stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i < n) spaces -= 2;
            else spaces +=2;
        }
    }
    

    // *****
    // *   *
    // *   *
    // *   *
    // *****
    public static void pattern21(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5 
    public static void pattern22(int n) {
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int bottom = (2*n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right))+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squarePattern(5);
        patternTwo(5);
        pattern3(6);
        pattern4(6);
        pattern5(5);
        pattern6(6);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(6);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(5);
        pattern22(5);
    }
}