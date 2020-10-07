/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.
*/
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
int smallestNum = 1;
    if(A.length == 0)
    return smallestNum;

Arrays.sort (A);
    if(A[0] > 1) 
    return smallestNum;
    if(A[ A.length - 1] <= 0 ) 
    return smallestNum; 
  for(int i = 0; i < A.length; i++){
        if(A[i] == smallestNum){ 
         smallestNum++;}    
    }

    return smallestNum;

        
    }
}