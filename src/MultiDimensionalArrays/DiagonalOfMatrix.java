package MultiDimensionalArrays;//--------------Diagonal Sum in a matrix----------------

public class DiagonalOfMatrix {

    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        /*
         * This is not the optimized approach.
         * with this the time comlexity is O(n^2)
         */
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }

        /*
         * Optimized approach with linear time complexity O(n) 
        */

        for(int i=0; i<matrix.length; i++){
            //Primary diagonal
            sum += matrix[i][i];

            //Secondary diagonal
            if(i != matrix.length-i-1)
                sum += matrix[i][matrix.length-i-1];
        }
        return sum;
        
    }

    public static void main(String args[]){
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        //diagonalSum(matrix);
        System.out.println("Sum of diagonals of a matrix = "+diagonalSum(matrix));


    }
    
}
