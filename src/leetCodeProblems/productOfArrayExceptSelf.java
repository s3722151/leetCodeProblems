package leetCodeProblems;

//Question: https://leetcode.com/problems/product-of-array-except-self/description/
public class productOfArrayExceptSelf {

}

/* 
//Example for nums = [2, 3, 4, 5]:
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

DEEPSEEK
Key Concepts to Understand
i++: This means "increment i by 1 after the current step." 
	It’s used in the for loop to move forward through the array.
i--: This means "decrement i by 1 after the current step." 
	It’s used in the for loop to move backward through the array.
i-1: This refers to the index before the current index i.
i+1: This refers to the index after the current index i.

WE DON'T ACTUALLY -1 and +1, we do this to REFER to positions.
	i is the current index in the for loop.
	i-1 is the previous index (the one before i).
	We use i-1 to access the previous value in the left array and the previous value in the nums array.

Example Input: nums = [2, 3, 4, 5] (values in array)
1/Calculate Left 
		positions(i)-> 0  1  2  3
Iteration	i(Current Index)	i-1(Previous Index)   left[i-1](Previous Left Value)	nums[i-1](Previous Number in nums)	left[i] = left[i-1] * nums[i-1]		left Array
1			1					0					  left[0] = 1						nums[0] = 2							left[1] = 1 * 2 = 2					[1, 2, _, _]
2			2					1					  left[1] = 2						nums[1] = 3							left[2] = 2 * 3 = 6					[1, 2, 6, _]
3			3					2					  left[2] = 6						nums[2] = 4							left[3] = 6 * 4 = 24				[1, 2, 6, 24]


What’s Happening Here?
1.i is the current index:
	In each iteration of the loop, i is the index we’re currently calculating the left value for.
	For example, in the first iteration, i = 1 (we’re calculating left[1]).

2.i-1 is the previous index:
	i-1 is the index before i. 
	It’s used to access the previous value in the left array (left[i-1]) and the previous value in the nums array (nums[i-1]).
	For example, when i = 1, i-1 = 0. So we look at left[0] and nums[0].

3.Why do we use i-1?:
	The left array stores the product of all elements to the left of the current index i.
	To calculate left[i], we need the product of all elements before i. 
	That’s why we use left[i-1] (the product so far) and multiply it by nums[i-1] (the previous number in nums).

Summary: We refer to the previous left value to avoid calculating it again



Step 2: Calculate the Right Array
The right array stores the product of all elements to the right of each index.
We use a for loop with i-- to move backward through the array.

Step-by-Step Breakdown:
Iteration	i	i+1	right[i+1]		nums[i+1]		right[i] = right[i+1] * nums[i+1]	right Array
1			2	3	right[3] = 1	nums[3] = 5		right[2] = 1 * 5 = 5				[_, _, 5, 1]
2			1	2	right[2] = 5	nums[2] = 4		right[1] = 5 * 4 = 20				[_, 20, 5, 1]
3			0	1	right[1] = 20	nums[1] = 3		right[0] = 20 * 3 = 60				[60, 20, 5, 1]

What’s Happening:
We start at i = nums.length - 2 (second-to-last index) because right[nums.length - 1] is already set to 1.
For each i, we look at the next index (i+1) to get the product so far (right[i+1]) and multiply it by the next number in nums (nums[i+1]).
This builds the right array step by step.

Step 3: Combine Left and Right Arrays
Step-by-Step Breakdown:
Index (i)	left[i]	right[i]	ans[i] = left[i] * right[i]		Final ans Array
0			1		60			1 * 60 = 60						[60, _, _, _]
1			2		20			2 * 20 = 40						[60, 40, _, _]
2			6		5			6 * 5 = 30						[60, 40, 30, _]
3			24		1			24 * 1 = 24						[60, 40, 30, 24]
*/