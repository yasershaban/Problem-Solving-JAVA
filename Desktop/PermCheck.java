/*

A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
	
	*/
	
	// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
              Arrays.sort(A);
        
        for (int i =0 ; i < A.length-1 ; i++)
        
        {
            
            if(A[i+1]!= A[i]+1 )
            return 0 ;
            
        }
        return 1;
    }
}