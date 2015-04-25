// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        
        int[] K=new int[X];
        int index = 0;
        for(int x=0; x<A.length; x++){
            
            if(A[x] <= X){
                if(K[ A[x]-1 ] == 0){
                    K[A[x]-1] = A[x];
                    index = x;
                }    
                
            }
           
        }
        for( int j : K){
            if(j == 0) return -1;    
        }
        
        return index;
     
    }
}