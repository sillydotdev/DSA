package Strings;/*
 * Given a route containing 4 directions(E, W, N, S). 
 * Find the shortest path to reach the destination.
 * Given path (WNEENESENNN)
 */

public class Shortest_Path {

    public static float findShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }

            //north
            else if(dir == 'N'){
                y++;
            }

            //west
            else if(dir == 'W'){
                x--;
            }

            //east
            else{
                x++;
            }
        }
        //X2 is x^2 and Y2 is y^2.... Displacement = squareroot((x2-x1)^2 + (y2-y1)^2)
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        //String path = "NS";
        System.out.println(findShortestPath(path));
    }
    
}
