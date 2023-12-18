package MultiDimensionalArrays;

public class StaircaseSearch {

    public static boolean staircaseSearch(int matrix[][], int target) {
        int row = 0, col = matrix[0].length-1;
        while(row <matrix.length && col >=0) {
            if(matrix[row][col] == target) {
                System.out.println("Number found at ("+row+", "+col+")");
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        staircaseSearch(matrix, 14);

        }
}
    




