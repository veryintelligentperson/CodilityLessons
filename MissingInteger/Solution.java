// you can also use imports, for example:
import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int test=0;
        Arrays.sort(A);
        for(int x = 0; x<A.length; x++){
            if(A[x] == test + 1) test = A[x];
        }
        return test+1;
        
    }
}