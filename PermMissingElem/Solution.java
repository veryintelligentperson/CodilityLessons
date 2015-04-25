// you can also use imports, for example:
// import java.util.*;
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int x;
        for(x = 0; x<A.length; x++){
            if(A[x] != x+1) break;
        }
        return x+1;
        }
}