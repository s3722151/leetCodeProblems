package leetCodeProblems;

//Question: https://leetcode.com/problems/climbing-stairs/description/
public class climbingStairs {

}


//============================================================
//Research topics
//============================================================
/*
1.Math 
	https://www.w3schools.com/java/java_math.asp
2.Dynamic Programming 
	What is it: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
	Techniques of DP (tabulation vs memoization): https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
	How to solve DP: https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
	Summary: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
3. Memorization 
	Summary explanation: https://www.linkedin.com/pulse/recursion-memoization-java-examples-implementation-kabir-sidana/
	Code examples: https://www.geeksforgeeks.org/memoization-1d-2d-and-3d/

What I have learnt 
DP is a way of braking larger problems into smaller problems 
This is through reucursion where a condition must be specified to avoid method repeating forever.

*/

//============================================================
//Solution explanations
//============================================================
/*
(Base)Here is a binary tree
   4
 /   \
2     7
/ \   / \
1   3 6   9

(Middle)First switch the child nodes
   4
 /   \
2     7
/ \   / \
3   1 9   6

(Final)After inverting parent nodes:
   4
 /   \
7     2
/ \   / \
9   6 3   1
*/
