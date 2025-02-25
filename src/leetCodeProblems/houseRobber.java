package leetCodeProblems;

//Question: https://leetcode.com/problems/house-robber/
public class houseRobber {

}


/*
class Solution {
    public int rob(int[] nums) {
    if(nums.length == 0) return 0; //Nothing to compute
    if(nums.length == 1) return nums[0]; //If only have 1 house
    if(nums.length == 2) return Math.max(nums[0], nums[1]); //If 2 houses, get house which is higher value
        //num[0] is house 1, num[1] is house 2, 
    
    //Dp is a convention fo Dynamic, 
    int[] dp = new int [nums.length];
    
    //We populate first 2 values in array
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    
    //Make a for loop for 3rd value
    for(int i =2; i <nums.length; i++){
    	dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]); //dp[i] represents the maximum amount you can rob up to
    }
    return dp[nums.length-1]; //Return final element in array      
    }
} 
 */




//============================================================
//Research topics
//============================================================
/*
1.Array 
	https://www.w3schools.com/java/java_arrays.asp
2.Dynamic Programming 
	What is it: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
				https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
	Techniques of DP (tabulation vs memoization): https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/
	How to solve DP: https://www.geeksforgeeks.org/solve-dynamic-programming-problem/
	Summary: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/


What I have learnt 
DP is a way of braking larger problems into smaller problems 
This is through reucursion where a condition must be specified to avoid method repeating forever.

*/


	
//============================================================
//Solutions
//============================================================
/*
https://www.youtube.com/watch?v=-d3TUJUY96k
https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/
HOW TO THINK
- We need to use incurrsion
-  


CODE
Let's break down the solution step by step for the House Robber problem, which uses dynamic programming (DP) to find the maximum amount a robber can steal without robbing adjacent houses.

Step 1: Base Cases
	No Houses: If there are no houses (nums.length == 0), return 0.
	One House: If there's one house (nums.length == 1), rob it directly (nums[0]).
	Two Houses: If there are two houses (nums.length == 2), take the maximum of the two (you can't rob both).

Step 2: Initialize DP Array
	Create a DP array dp where dp[i] represents the maximum amount you can rob up to the ith house.
	Set initial values:
		dp[0] = nums[0] (only the first house).
		dp[1] = max(nums[0], nums[1]) (choose the better of the first two houses).

Step 3: Fill DP Array Using Recurrence Relation
For each house i starting from index 2:
	Choice 1: Rob the ith house. Add its value to the maximum amount from two houses back (dp[i-2] + nums[i]).
	Choice 2: Skip the ith house. Take the maximum amount up to the previous house (dp[i-1]).
	Update DP: dp[i] = max(Choice 1, Choice 2).

Step 4: Return Result
The final answer is stored in the last element of the DP array (dp[nums.length-1]), 
which contains the maximum for all houses.

Example Walkthrough
Let's use nums = [2, 7, 9, 3, 1]:

Initialize:
dp[0] = 2, dp[1] = max(2,7) = 7.

i=2:
	dp[2] = max(2 + 9, 7) = 11.

i=3:
	dp[3] = max(7 + 3, 11) = 11.

i=4:
	dp[4] = max(11 + 1, 11) = 12.

Result: 12 (rob houses 0, 2, and 4).

Key Idea
Optimal Substructure: 
The solution builds on smaller subproblems. 
Each decision (rob/skip) uses previously computed optimal values.

Avoid Adjacent: 
By always comparing the sum including the current house (with dp[i-2]) or excluding it (dp[i-1]), 
the solution ensures no two adjacent houses are robbed.
 


*/