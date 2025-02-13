package leetCodeProblems;

//Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/



//Method 2: One Traversal Solution – O(n) Time and O(1) Space
//Change class to "solution" in LeetCode
import java.util.ArrayList;
import java.util.List;
class bestTimeToBuyStockEasy  {

    static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        // Update the minimum value seen so far
          // if we see smaller
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
           
            // Update result if we get more profit                
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}




//Take a look: https://www.youtube.com/watch?v=Clp5c7HvLqs
//https://www.youtube.com/watch?v=Sz9yH-RDAgo

//============================================================
//Sources
//============================================================
/*
Initials throughts before answers
- You need to get the length of array prices
- Make a inner and outer for loop

Topics
1.Arrays: https://www.w3schools.com/java/java_arrays.asp
2.Dynamic Programming: 
- What is it: https://www.geeksforgeeks.org/dynamic-programming/
- Video course: https://www.freecodecamp.org/news/learn-dynamic-programming-in-java/

Relevant information 
Nodes: https://www.codecademy.com/learn/getting-started-with-data-structures-java/modules/nodes-java/cheatsheet
Max: https://www.w3schools.com/java/ref_math_max.asp

Solutions
https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/
- Note that if array is in order you cannot sell at maximum, based on first value
https://www.youtube.com/watch?v=3EehPI_BkFk

What I have learnt 
Dynamic Programming: algorithmic technique used to optimize recursive solutions
Dynamic programming can be achieved using two approaches:
-top-down approach, also known as memoization, we keep the solution recursive and add a memoization table to avoid repeated calls of same subproblems.
-bottom-up approach, also known as tabulation, we start with the smallest subproblems
*/