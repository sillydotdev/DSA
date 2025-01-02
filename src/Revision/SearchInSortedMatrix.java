package Revision;

public class SearchInSortedMatrix {
    public static boolean searchInSortedMatrix(int[][] matrix, int target) {
        int n = 0, m = matrix[0].length - 1;

        while (n < matrix.length && m > 0) {
            if (matrix[n][m] == target) {
                System.out.println("Element found at: "+matrix[n][m]);
                return true;
            } else if (target < matrix[n][m]) {
                m--;
            } else {
                n++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        System.out.println(searchInSortedMatrix(matrix, 33));
    }
}
