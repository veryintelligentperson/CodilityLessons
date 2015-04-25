// 88 % :(
class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        
        int[] arr = new int[N];
        
        int maxcounter = 0;
        for(int a = 0; a<A.length ; a++){
            
            if(A[a] == N+1){ 
                eqAr(arr, maxcounter);
                maxcounter = arr[0];
            }
            else{ 
                arr[A[a]-1] += 1;
                if(maxcounter < arr[A[a]-1]) maxcounter = arr[A[a]-1];
                }
        }
        
        return arr;
       
    }
    
    public static void eqAr(int[] ar, int c){
        for(int x=0; x<ar.length; x++) ar[x] = c;
    }
}