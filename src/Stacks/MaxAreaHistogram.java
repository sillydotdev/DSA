package Stacks;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void maxAreaHistogram(int heights[]) {
        int maxArea = 0;
        int nextSmallerRight[] = new int[heights.length];
        int nextSmallerLeft[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();
        // next smaller on right
        for (int i = heights.length-1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallerRight[i] = heights.length;
            } else {
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller on left
        s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        // width = j - i - 1  => nextSmallerRight[i] - nextSmallerLeft[i] - 1
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max area in Histogram is: "+maxArea);
    }
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
//        int heights[] = {9, 0};
        maxAreaHistogram(heights);
    }
}
