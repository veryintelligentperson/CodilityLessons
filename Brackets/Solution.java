// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8

        if (S.equals("")) return 1;

        boolean a = true, b = true, c = true;

        char last;

        char[] arr = S.toCharArray();

        Deque<Character> stack = new ArrayDeque<>();

        for (char k : arr) {

            if (k == '(' || k == '[' || k == '{' ){
                stack.push(k);
            }
            else if(k == ')' || k == ']' || k == '}'){
                if(stack.isEmpty()) return 0;
                 k = k == ')' ? '(' : k == ']' ? '[' : '{';
                 if(stack.pop() != k) return 0;
            }
            
        }
        
        return stack.isEmpty() ? 1 : 0;



    }

}