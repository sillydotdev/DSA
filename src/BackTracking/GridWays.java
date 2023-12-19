// number of ways to reach n-1, m-1 cell from 0,0, You can only go down and right, not left or up
package BackTracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        if(i == n-1 && j == m-1) {  // last cell condition
            return 1;
        } else if (i == n || j == m) {  // boundary cross condition
            return 0;
        }
        int waysRight = gridWays(i, j+1, n, m);
        int waysDown = gridWays(i+1, j, n, m);
        return waysRight + waysDown;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Number of ways: "+gridWays(0,0, n, m));
    }
}
