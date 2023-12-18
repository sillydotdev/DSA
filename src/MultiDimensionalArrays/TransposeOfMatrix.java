package MultiDimensionalArrays;//-------------------Transpose of a matrix-----------------

public class TransposeOfMatrix {
    public static void transposeMatrix(int matrix[][]){

        int rows = 2;
        int cols = 3;
        System.out.println("Original matrix:");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix after transposing:");
        int transpose[][] = new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
            }
            //System.out.println();
        }

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]){
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};

        transposeMatrix(matrix);

        
    }
    
}
