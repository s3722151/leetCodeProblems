package leetCodeProblems;

//Question: https://leetcode.com/problems/climbing-stairs/description/
public class climbingStairs {

}

/* Solution

class Solution {
    public int climbStairs (int n) {
	//If there is only 1 step to use
	if ( n ==1) return 1;
	
	int [] dp = new int [n + 1];
	dp [1] = 1;
	dp [2] = 2;
	
	for (int i = 3; i <=n; i++){
		dp[i] = dp[i -1] + dp[i - 2];
	}
	return dp[n];
	
	}
}

 */

//============================================================
//Research topics
//============================================================
/*
1.Math 
	https://www.w3schools.com/java/java_math.asp
2.Dynamic Programming 
	What is it: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
				https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
	Techniques of DP (tabulation vs memoization): https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
	How to solve DP: https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
	Summary: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
3. Memorization 
	Summary explanation: https://www.linkedin.com/pulse/recursion-memoization-java-examples-implementation-kabir-sidana/
	Code examples: https://www.geeksforgeeks.org/memoization-1d-2d-and-3d/

What I have learnt 
DP is a way of braking larger problems into smaller problems 
This is through reucursion where a condition must be specified to avoid method repeating forever.
A)Memoization:
	Top-down approach
	Stores the results of function calls in a table.
	Recursive implementation
	Entries are filled when needed.
B)Tabulation:
	Bottom-up approach
	Stores the results of subproblems in a table
	Iterative implementation
	Entries are filled in a bottom-up manner from the smallest size to the final size.
*/

//============================================================
//Solution explanations
//============================================================
/*
https://www.youtube.com/watch?v=UUaMrNOvSqg

A good way of solving is brute force
- This proves that a solution exists
- In this case we can look at no. of ways to climb stair case
- So compare n (no of steps) to no. of ways to climb stairs (1 = 1, 1 = 2, 1 = 3, 4 = 5 --> n to no. of ways.)
- 1 step allows one way. 2 steps allow 2 ways..

E.g. for 7 steps
- No of ways to reach step 7 = (climb 1 stair from step 6) + (climb 2 stair from step 5)

Formula
step[n] = step[ n - 1 ] + step [ n - 2]

We need dynamic programming as a way to store previous values

*/
