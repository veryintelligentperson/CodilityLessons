// you can also use imports, for example:
 import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0) return -1;
        else if(A.length == 1) return 0;
        
        
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        int leader = A[0];
        int index = 0;
        double counter = 0;
        
        for(int i = 0; i < A.length ; i++){
            
            if(A[i] == leader){
                stack.push(A[i]);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    leader = A[i];
                    stack.push(A[i]);
                }
            }
        }
        
        for(int i = 0; i<A.length; i++){
            if(A[i] == leader){
                counter++;
                index = i;
            }
        }
        
        return (counter/A.length) > 0.5 ? index : -1;
    }
}