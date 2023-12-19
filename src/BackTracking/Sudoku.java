public class Sudoku {
    public static boolean isSafe(int arr[][], int row, int col, int digit){
        // column
        for(int i=0; i<=8; i++) {
            if(arr[i][col] == digit) {
                return false;
            }
        }

        // row
        for(int j=0; j<=8; j++) {
            if(arr[row][j] == digit) {
                return false;
            }
        }

        // grid
        int startingRow = (row / 3) * 3;
        int startingCol = (col / 3) * 3;
        // 3x3 grid
        for(int i=startingRow; i<startingRow+3; i++) {
            for(int j=startingCol; j<startingCol+3; j++) {
                if(arr[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int arr[][], int row, int col) {
        // Base case
        if(row == 9) {
            return true;
        }

        // Recursion
        int newRow = row, newCol = col+1;
        if(col+1 == 9) {
            newRow = row+1;
            newCol = 0;
        }
        if(arr[row][col] != 0) {
            return sudokuSolver(arr, newRow, newCol);
        }
        for(int digit=1; digit<=9; digit++) {
            if(isSafe(arr, row, col, digit)) {
                arr[row][col] = digit;
                if(sudokuSolver(arr, newRow, newCol)) {
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    // print sudoku
    public static void printSudoku(int arr[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if(sudokuSolver(arr, 0, 0)) {
            System.out.println("Solution exists...");
            printSudoku(arr);
        }
        else{
            System.out.println("Solution doesn't exists...");
        }
    }
}