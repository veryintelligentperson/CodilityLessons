import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 1) return 0;
        if(A.length == 2 && A[0] == A[1]) return 1;


        Deque<Integer> stack = new ArrayDeque<Integer>();
        int leader = A[0];
        int leaderCount = 0;

        for(int i = 0 ; i< A.length ; i++){
            if(A[i] == leader){
                stack.push(A[i]);
            }else if(A[i] != leader){
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(A[i]);
                    leader = A[i];
                }
            }
        }

        for(int i : A){
            if(i == leader) leaderCount++;
        }
        
        if(leaderCount == A.length) return leaderCount-1;
        
        int count = 0;
        double a,b;
        int nrEle;
        stack.clear();
          
        for(int i = 0; i < A.length ; i++){
            
            nrEle = i+1;
            
            if(A[i] == leader){
                
                stack.push(A[i]);
            }
            a = ((double)stack.size())/nrEle;

            if(i < (A.length-1)){ 
                b = (double)(leaderCount-stack.size())/(A.length-nrEle);
            }else b = 0.0;

            if(a>0.5 && b>0.5){
                count++;
            }
        }
        return count;
    }
    
}