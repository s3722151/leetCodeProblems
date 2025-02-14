package leetCodeProblems;

//Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/



//Method 2: One Traversal Solution – O(n) Time and O(1) Space
//Change class to "solution" in LeetCode


//Solution 1
//Java Program to solve stock buy and sell by  
//exploring all possible pairs

class bestTimeToBuyStockEasy   {

static int maxProfit(int[] prices) {
   int n = prices.length;
   int res = 0;

   // Explore all possible ways to buy and sell stock
   for (int i = 0; i < n - 1; i++) {
       for (int j = i + 1; j < n; j++) {
           res = Math.max(res, prices[j] - prices[i]);
       }
   }
   return res;
}

public static void main(String[] args) {
   int[] prices = {7, 10, 1, 3, 6, 9, 2};
   System.out.println(maxProfit(prices));
}
}



//Solution 2
//import java.util.ArrayList;
//import java.util.List;
//class bestTimeToBuyStockEasy  {
//
//    static int maxProfit(int[] prices) {
//        int minSoFar = prices[0];
//        int res = 0;
//
//        // Update the minimum value seen so far
//          // if we see smaller
//        for (int i = 1; i < prices.length; i++) {
//            minSoFar = Math.min(minSoFar, prices[i]);
//           
//            // Update result if we get more profit                
//            res = Math.max(res, prices[i] - minSoFar);
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        int[] prices = {7, 10, 1, 3, 6, 9, 2};
//        System.out.println(maxProfit(prices));
//    }
//}



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
https://www.youtube.com/watch?v=3EehPI_BkFk
- General explanation of selling and buying
https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/
- Note that if array is in order you cannot sell at maximum, based on first value


What I have learnt 
Dynamic Programming: algorithmic technique used to optimize recursive solutions
Dynamic programming can be achieved using two approaches:
-top-down approach, also known as memoization, we keep the solution recursive and add a memoization table to avoid repeated calls of same subproblems.
-bottom-up approach, also known as tabulation, we start with the smallest subproblems

Solution 1: Brute Force Approach
Code Explanation:
 Outer Loop (i): Iterates through each day to consider buying the stock on that day.
 Inner Loop (j): For each buy day i, iterates through all subsequent days to consider selling the stock on day j.
Profit Calculation: For each pair (i, j), calculates the profit as prices[j] - prices[i].
Max Profit Update: Keeps track of the maximum profit found across all pairs.
Performance:
  Time Complexity: O(n²) because of the nested loops. For n days, it checks all possible pairs, leading to n*(n-1)/2 comparisons.
  Space Complexity: O(1) as it uses a constant amount of extra space.
Use Case:
 This solution is simple but inefficient for large datasets due to its quadratic time complexity. It’s not practical for real-world scenarios with large input sizes.

Solution 2: Optimized Single Pass Approach
Code Explanation:
 Initialization: Tracks the minimum price seen so far (minSoFar) and the maximum profit (res).
Single Loop: Iterates through the prices array once.
 Update Minimum Price: If the current price is lower than minSoFar, update minSoFar.
 Update Maximum Profit: Calculate the profit if the stock is sold on the current day (prices[i] - minSoFar) and update res if this profit is greater than the previously recorded maximum profit.
Return Result: After the loop, res contains the maximum profit.
Performance:
 Time Complexity: O(n) because it processes each element once.
 Space Complexity: O(1) as it uses a constant amount of extra space.
Use Case:
 This solution is efficient and scalable, making it suitable for large datasets. 
 It’s the preferred approach for this problem.

Key Differences:
Time Complexity:
Solution 1: O(n²) – Inefficient for large inputs.
Solution 2: O(n) – Efficient and scalable.
Approach:
Solution 1: Checks all possible pairs, which is redundant.
Solution 2: Tracks the minimum price and calculates profit in a single pass.

Practicality:
Solution 1: Not suitable for real-world applications with large data.
Solution 2: Ideal for real-world use due to its efficiency.

Which Solution to Use?
Solution 2 is the better choice because it is more efficient and handles large inputs effectively. It’s the standard approach for this problem and is widely used in practice.





*/