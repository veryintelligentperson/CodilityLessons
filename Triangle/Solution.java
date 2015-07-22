import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        boolean a,b,c;
        
        for(int i=0 ; i<A.length-2 ; i++){
            
            a = (long)A[i]+(long)A[i+1] > A[i+2];
            b = (long)A[i]+(long)A[i+2] > A[i+1];
            c = (long)A[i+1]+(long)A[i+2] > A[i];
            if(a && b && c) return 1;    
        }
        return 0;
    }
}