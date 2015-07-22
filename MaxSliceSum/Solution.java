// you can also use imports, for example:
// import java.util.*;
    import java.lang.Math;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int max = 0;
        int maxLocal = 0;
        int belowZero = A[0];
        
        for(int x : A){
            maxLocal = Math.max(0 , maxLocal+x);
            max = Math.max(max, maxLocal);
            belowZero = Math.max(x, belowZero);
        }
       
       return belowZero >= 0 ? max : belowZero; 
        
    }
}