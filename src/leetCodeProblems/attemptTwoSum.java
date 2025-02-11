package leetCodeProblems;
import java.util.*;// To use hashtable

public class attemptTwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }



}




//============================================================
// Sources
//============================================================
/*
Time limit 30 minutes 
Question
https://leetcode.com/problems/two-sum/description/

Topics:
Arrays
- https://www.w3schools.com/java/java_arrays_multi.asp
Hash Tables
- https://www.youtube.com/watch?v=FsfRsGFHuv4
Hash Maps
- https://www.youtube.com/watch?v=H62Jfv1DJlU
Big O
- https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/#:~:text=What%20is%20Big%20O%3F,as%20the%20input%20size%20grows.

Thinking of trying to work out
I should copy the code structure. And then declare int target and nums
I need to have a condition in for loop that makes the length greater than 2 but less than 10^4
Array topic: I somehow need to use the lengeth and for loop

What I took away
- I can't do a problem each day like this?
- I also came across wrappers (int vs Integer)
			
Solution (Java)
BETTER explanation of code: https://www.youtube.com/watch?v=Yyyi12oaK94
 Question Breakdown
- We want to look all numbers in array and see 2 numbers that equal 9
- We don't use the same element (index) twice
- We assume that only 2 numbers add to target only
- We must return the 2 indexes that make target ( in this case 2, 7 or [0,1])

 Brute Force
- First we loop at elements in each array 
- Brute force means looking at all combinations based on numbers to reach target
- E.g. [5, 2, 4], target 6. We look at each num, and see each number added. Check what 2 numbers equal target, 6
- j is used to signify inner loop, we use length to go through array
- What is better is using the target first and using the numbers to subtract from it to determine what makes target


Solution 1: (Brute Force)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        //Go through each element in array
        for (int i = 0; i < n - 1; i++) { 
        	//Now we loop through each number after index and add it
            for (int j = i + 1; j < n; j++) { //i +1 is looking at the next number after i (index)
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // i and j are indices we look at
                }
            }
        }
        return new int[]{}; // Default value. No solution found
        //Can also be return nums;
    }

Approach
One brute force approach is to consider every pair of elements and check if their sum equals the target. 
This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, and the inner loop iterates from the next element to the last element. 
However, this approach has a time complexity of O(n^2).
- This means it is not as fast.
- This is because we are using an inner and outer loop.
- In real world, we would use more sets.
ISSUE: We need to find a way to loop through loop 1 time to be faster.

SOLUTION: HashMap
- This is a collection of key value pairs (indexes).
- This helps map to certain values.
- In this case for each value in array we map a number
{5,2,4}, target 6

Hashmap brief explanation
Key -> Value
1 -> 0
4 -> 1
{ 2, 1}

In this case we look at index 1. We say what plus 5 = 6. It is 1 (complement)
The key is 1, the map value is 0
When we reach 4 (last number) we realise it is already list as key 
- This is identifies we can add index 2 and 3 to get target
NOTE: Solution compared to brute force hase same memory but slightly faster RunTime

import java.util.Hashmap;
import java.util.Map;
class Solution 
{
	public int [] twoSum (int [] nums, int target)
	{
		//Create Hashmap
		Map < Integer, Integer> complments = new Hashmap<>();
		for (int i = 0; i < nums.length; i++)
		{
		//This is to check if the index currently exists in hashMap
		Integer complementIndeex = complements.get(nums[i]);
		  if (complementIndex != null)
		  	{
		  	return new int[] {i, complementIndex};//We return i, which index we currently loop through, complementIndex is index that is added to get target
		  	}
		  	//This is to add a complement to a map
		  	complements.put(target - nums[i],i); first i is number currently looking at, 2nd i is what we want to store
		}
		return nums;
	}
}




====================================================================================
Alternate solution 

MORE DETAIL
A more efficient approach is to use a hash table (unordered_map in C++). 
We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. 
If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.
Approach using a hash table:
1.Create an empty hash table to store elements and their indices.
2.Iterate through the array from left to right.
3.For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
4.Check if the complement exists in the hash table. If it does, we have found a solution.
5.If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
6.Repeat steps 3-5 until we find a solution or reach the end of the array.
7.If no solution is found, return an empty array or an appropriate indicator.

Solution 2: (Two-pass Hash Table)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //First create hash map
        Map<Integer, Integer> numMap = new HashMap<>();
        //Get length of array
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
}

Solution 3: Solution 3: (One-pass Hash Table)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}


Solution(Python)
https://www.youtube.com/watch?v=luicuNOBTAI
- Found in discussion. This isn't java. 
- Brute force means looking at all combinations based on numbers to reach target
- What is better is using the target first and using the numbers to subtract from it to determine what makes target

def twoSum (nums,target):
	seen = {} //First define an array
	for i in range (len (nums)): //Define way to look at numbers based on how many there ate
		diff = target - nums [i] //Calculate difference between each number
		if diff in seen: //This checks if we have seen the number beforce
			return [seen[diff],i]
		else: //This records the value and maps it out index
			seen[nums[i]] = i 
 */


