// you can also use imports, for example:
 import java.util.*;
 import java.lang.Math;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0) return 0;
        
        int max = 0;
        int min = A[0];
        
        for(int i = 0 ; i<A.length ; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]-min);
            
        }
        
        return max > 0 ? max : 0; 
        
    }
}