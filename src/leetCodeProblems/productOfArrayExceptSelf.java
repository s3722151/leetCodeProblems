package leetCodeProblems;

//Question: https://leetcode.com/problems/product-of-array-except-self/description/
public class productOfArrayExceptSelf {

}

/* 
class Solution {
    public int[] productExceptSelf(int[] nums) {
    
    //Array to store all left multiplication 
     int [] left = new int [nums.length];
    
    //Array to store all right multiplication
     int [] right = new int [nums.length];
    
    left[0] = 1; //We do this as nothing is past left - we need to give it a value otherwise 0
    for (int i = 1; i <nums.length; i++){
    	left[i] = left [i -1 ] * nums[i - 1];      
    }
    
    right [nums.length -1] = 1;//We start from 2nd last position then go to beginning
    for (int i = nums.length - 2; i > -1; i--){
    	right[i] = right [i + 1] * nums[i + 1];      
    }
    
    int[] ans = new int[nums.length];
    for (int i = 0; i <nums.length; i++){
		ans[i] = left[i] * right[i];      
	}
	return ans;
    
}
}
 */


//============================================================
//Research topics
//============================================================
/*
Topics
1.Array
2.Prefix sum
 - https://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/
 - https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/


What I have learnt 
DP is a way of braking larger problems into smaller problems 
This is through reucursion where a condition must be specified to avoid method repeating forever.

*/


	
//============================================================
//Solutions
//============================================================
/*
https://www.geeksforgeeks.org/a-product-array-puzzle/
https://www.youtube.com/watch?v=G9zKmhybKBM

What question means
- Product means everything multiplied beside the pointer
- E.g. [1,2,3,4] = [24, 12, , 8 , 6)
- 24 = 2 * 3* 4 = 6 * 4
- It is not correct to simplfy multiple all elements in array then divide by position
	- Limit is 2^32 and hypothetically we could have numbers greater than that
	- Also we cannot divide by 0 
- To calculate a current value, find elments beside it 9left and right)

CODE
Problem: You need to create a new array where each element is the product of all other elements except itself.
Example Input: nums = [2, 3, 4, 5]
Desired Output: [3*4*5, 2*4*5, 2*3*5, 2*3*4] = [60, 40, 30, 24]

Solution Strategy: Use Two Helper Arrays (Left & Right)
We'll split the problem into two simpler parts:
Left Products: What's the product of all elements to the left of each element?
Right Products: What's the product of all elements to the right of each element?

Combine Them: Multiply left and right products for each position to exclude the current element.

Step 1: Calculate Left Products
left[i] = product of all elements before index i.

Key Rule: Start with left[0] = 1 (nothing to the left of first element).

Example for nums = [2, 3, 4, 5]:
Index	How to Calculate left[i]						left Array
0		Nothing left → 1								[1, _, _, _]
1		Previous left (1) * nums[0] (2) → 1*2 = 2		[1, 2, _, _]
2		Previous left (2) * nums[1] (3) → 2*3 = 6		[1, 2, 6, _]
3		Previous left (6) * nums[2] (4) → 6*4 = 24		[1, 2, 6, 24]
Left Array: [1, 2, 6, 24]

Step 2: Calculate Right Products
right[i] = product of all elements after index i.

Key Rule: Start with right[3] = 1 (nothing to the right of last element).

Example for nums = [2, 3, 4, 5]:
Index	How to Calculate right[i]						right Array
3		Nothing right → 1								[_, _, _, 1]
2		Previous right (1) * nums[3] (5) → 1*5 = 5		[_, _, 5, 1]
1		Previous right (5) * nums[2] (4) → 5*4 = 20		[_, 20, 5, 1]
0		Previous right (20) * nums[1] (3) → 20*3 = 60	[60, 20, 5, 1]
Right Array: [60, 20, 5, 1]

Step 3: Combine Left & Right Products
For each index i, multiply left[i] * right[i] to get the final answer.
This works because left[i] contains all elements to the left, and right[i] contains all elements to the right 
→ Together, they exclude nums[i].

Final Calculation:
Index	left[i]	right[i]	Answer (left * right)
0	1			60			1*60 = 60
1	2			20			2*20 = 40
2	6			5			6*5 = 30
3	24			1			24*1 = 24
Final Answer: [60, 40, 30, 24]

Why Does This Work?
Left Array "carries" the product of everything before it as we move left to right.
Right Array "carries" the product of everything after it as we move right to left.

Combining them skips the current element naturally!

*/