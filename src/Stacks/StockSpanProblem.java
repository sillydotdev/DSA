package Stacks;

import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;    // span of first day
        s.push(0);  // push index of day 1

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();    // if stock is not empty & curr price is greater than the element at top of stack, pop it---as we need less than the current
            }
            if (s.isEmpty()) {
                span[i] = i + 1;    // if stock is empty like for the last day of given stocks example
            } else {
                int prevHigh = s.peek();    // previous high =  peek of stack
                span[i] = i - prevHigh;     // span = i - previous high index
            }
            s.push(i);      // push
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
        System.out.println();
    }
}
