// you can also use imports, for example:
 import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int sum=0;
        int mem = -1000000;
        for(int k : A){
            if(k>mem){ 
                mem = k;
                sum++;
            }   
        }
        return sum;
    }
}