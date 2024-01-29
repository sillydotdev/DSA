package HeapsAndPriorityQueue;

import java.util.PriorityQueue;

public class NearByCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSquare;
        int index;
        public Point(int x, int y, int distSquare, int index) {
            this.x = x;
            this.y = y;
            this.distSquare = distSquare;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSquare - p2.distSquare;
        }
    }
    public static void main(String[] args) {
        int points[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distSquare = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Point(points[i][0], points[i][1], distSquare, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.remove().index);
        }
    }
}
