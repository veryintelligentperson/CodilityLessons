// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
    	
        int dif = Y-X;
        if(dif % D == 0) return dif/D;
        else return dif/D +1;
 
    }
}