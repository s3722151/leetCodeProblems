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

Thinking
I should copy the code structure. And then declare int target and nums
I need to have a condition in for loop that makes the length greater than 2 but less than 10^4
Array topic: I somehow need to use the lengeth and for loop


			
Solution (Java)
BETTER explanation of code: https://www.youtube.com/watch?v=Yyyi12oaK94


Approach
One brute force approach is to consider every pair of elements and check if their sum equals the target. 
This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, and the inner loop iterates from the next element to the last element. 
However, this approach has a time complexity of O(n^2).
Solution 1: (Brute Force)
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



A more efficient approach is to use a hash table (unordered_map in C++). We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.
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
        Map<Integer, Integer> numMap = new HashMap<>();
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


