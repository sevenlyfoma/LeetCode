package io.github.sevenlyfoma;

import java.util.Stack;



public class StockSpanner {

    Stack<Stock> s;

    int position;

    public record Stock(int val, int pos){}

    public StockSpanner() {
        s = new Stack<>();
        position = 1;

        s.push(new Stock(Integer.MAX_VALUE,0));
        
    }
    
    public int next(int price) {
        int ret = 0;


        // if (price == 75) System.out.println(s);

        while (!s.isEmpty() && s.peek().val < price){
            s.pop();
        }

        int lastPos = this.position;
        if (!s.isEmpty()){
            lastPos = s.peek().pos;
        }
        
        ret += this.position - lastPos;

        s.push(new Stock(price, this.position));
        this.position++;

        return ret;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
