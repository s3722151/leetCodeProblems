package leetCodeProblems;

//Question: https://leetcode.com/problems/binary-search/description/
public class binarySearch { //replace binarySearch with "Solution" in leetCode

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1; //Because we sttart at 0
        
        int left = 0; //Always starts at index 0
        int right = nums.length -1; 
        
        while (left <= right) {
        	int midpoint = left + (right-left) /2; //This will always = middle
        	if (nums[midpoint] ==target) { //If middle of array = target
        		return midpoint;
        	} else if (nums[midpoint] > target) { //If target is on left side of array, get rid of right side of array
        		right = midpoint -1; //Remove values greater than midpoint which is greater than target
        	} else {
        		//We keep going through array to right
        		left = midpoint + 1;
        	}
        }
        return -1; // This occurs if we cannot return anything
    }

}

//============================================================
//Sources
//============================================================
/*
Initials throughts before answers
- You need to get the length of array prices
- Make a inner and outer for loop

Topics
1.Arrays
https://www.w3schools.com/java/java_arrays.asp
2.Binary Search
- What it is & Example: 
https://www.geeksforgeeks.org/binary-search-in-java/
- Java LeetCode example
https://www.youtube.com/watch?v=9q0k3OyCKPY
3. Big O complexity (Determine if the result is good)
https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/ 

WHAT IO HAVE LEARNT
Binary Search is used when an input is already sorted.
Ans we look for a value in it.
There are 3 methods for Binary Search
1.Iterative Method
2.Recursive Method
3.Inbuild Method


Why return -1 explanation (DeepSeek)
Returning -1 is a convention to indicate that the target value was not found in the array. 

Here's why this makes sense:
Array Indices: 
In Java, array indices are zero-based, meaning the first element of an array is at index 0, the second at index 1, and so on. 
Therefore, valid indices for an array of length n range from 0 to n-1.

Returning an Index: 
When the target value is found in the array, the function returns the index of that value. 
Since valid indices are non-negative, returning a negative number like -1 is a clear and UNAMBIGUOUS way to signal that the target was not found.

Common Practice: Returning -1 to indicate "not found" is a common practice in many programming languages and libraries. 
For example, Java's String.indexOf() method returns -1 if the specified substring is not found in the string.

Why Not Return 0 or null?
Returning 0: Returning 0 could be misleading because 0 is a valid index (the first element of the array). 
If the target is actually at index 0, returning 0 would be correct, but if the target is not found, returning 0 would be incorrect and confusing.

Returning null: 
In Java, null is used to indicate the absence of an object. 
However, the return type of the search method is int, which


*/