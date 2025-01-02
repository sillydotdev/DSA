package Revision;

public class ShortestPath {
    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'E') {
                x++;
            } else if (ch == 'W') {
                x--;
            } else if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}
