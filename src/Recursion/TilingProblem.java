package Recursion;

public class TilingProblem {

    public static int tilingProblem(int n) {

        if(n == 0 || n == 1) {
            return 1;
        }
        // //vertical
        // int verticalTiles = tilingProblem(n-1);
        // //horizontal
        // int horizontalTiles = tilingProblem(n-2);

        // int totalWays = verticalTiles + horizontalTiles;

        // return totalWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
        
    }
    
}
