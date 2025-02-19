package leetCodeProblems;

//Question: https://leetcode.com/problems/merge-two-sorted-lists/

public class mergeTwoSortedLists {
	

		
}

//USE SOLUTION - Adjusted based on created class
//class Solution {
//	//mergeTwoSortedLists = ListNode in the video
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//    	ListNode dummy = new ListNode(0); //This is the beginneer node
//    	ListNode curr = dummy; //Current node that we are using
//    	while (list1 != null && list2!=null) {
//    		//merge list 
//    		if (list1.val <= list2.val) {
//    			curr.next = list1;
//    			list1= list1.next;
//    		}else {
//    			curr.next = list2;
//    			list2 = list2.next;
//    		}
//    		curr = curr.next;
//    	}
//    	curr.next = list1 !=null ? list1 :list2;
//    	return dummy.next;
//        
//    }
//}




//============================================================
//Sources
//============================================================
/*
TOPICS
1.Linked List
- WHat is it: https://www.w3schools.com/java/java_linkedlist.asp
- Demonstration: https://www.youtube.com/watch?v=N6dOwBde7-M
2.Recursion 
- What is it: https://www.w3schools.com/java/java_recursion.asp
3.Extra Topics
- Understanding factorials: https://www.youtube.com/watch?v=pxh__ugRKz8
4.Solutions
https://www.youtube.com/watch?v=g_uxlc8C6HE
- We have pointers in each node for each list
- We compare each list and append based on if if one is greater than the other
- We continue intil both linked lists reach null (end)
https://www.youtube.com/watch?v=KVf1Uuqfv8E
- Same as above but without turnary operator
 
WHAT I LEARNT - Linked Lists
Linked Lists data structures that contain a series of nodes
Each node contains data and a address
Elements in linked lists uses pointers
There are 2 types of linkedLists
1. Singly Linked lists
2. Doubly Linked Lists

There are no indexes, but each node points to another node
You can tell end of linked list with when address is null.
These are bad at searching, we start at start and end at tail of linkedlist
This takes more memory compared to arrays. 
There is a doublelinked list which allows us to go to start to end and end to start but takes more memory
Each node contains memory next and oprevious nodeLinked lists contains start and end nodes

They are good for inserting and deleting nodes (better than arrays) HOWEVER you need to look over entire linkedList
- You overcome this by using index

Advantages 
1. Dynamic Data structure (allocates needed memory while running)
2. Insertion and Deletion of Nodes is easy O(1)
3. No. Low memory waste 

Disadvantages
1. Greater memory usage (additional pointer)
2/ No random access of elements (no index [i])
3. Accessing/searching elements is more time consuming. O(n)

Uses
1. Implement Stacks/Queues
2. GPS navigation 
3. Music playlist



DEEPSEEK Indepth explanation 
Problem Overview
You are given two sorted linked lists, and your goal is to merge them into a single sorted linked list. For example:

List 1: 1 -> 3 -> 5
List 2: 2 -> 4 -> 6
Merged List: 1 -> 2 -> 3 -> 4 -> 5 -> 6

Key Concepts
1.Linked List: A linked list is a data structure where each element (called a node) contains two parts:
	val: The value of the node.
	next: A pointer/reference to the next node in the list.
The last node points to null, indicating the end of the list.
2.Pointers: In this solution, we use pointers to keep track of the current 
position in each list as we merge them.
3.Dummy Node: A dummy node is a temporary node that helps simplify the merging process. 
It acts as the starting point of the merged list.

Step-by-Step Explanation
1. Initialize a Dummy Node and a Current Pointer
java
ListNode dummy = new ListNode(0);
ListNode curr = dummy;
dummy is a temporary node that helps us build the merged list. It doesn't store any meaningful value (we initialize it with 0).
curr is a pointer that will move through the merged list as we add nodes to it.

2. Traverse Both Lists
We use a while loop to traverse both lists (list1 and list2) until we reach the end of one of them:

java
while (list1 != null && list2 != null) {
The loop continues as long as both list1 and list2 have nodes to process.

3. Compare Values and Append to Merged List
Inside the loop, we compare the values of the current nodes in list1 and list2:

java
if (list1.val <= list2.val) {
    curr.next = list1;
    list1 = list1.next;
} else {
    curr.next = list2;
    list2 = list2.next;
}
If the value in list1 is smaller or equal, we append the node from list1 to the merged list.

0therwise, we append the node from list2.
After appending a node, we move the pointer (list1 or list2) to the next node in that list.

4. Move the Current Pointer
After appending a node to the merged list, we move the curr pointer to the newly added node:

java
curr = curr.next;

This ensures that curr always points to the last node in the merged list.

5. Append Remaining Nodes
Once we reach the end of one of the lists, we append the remaining nodes from the other list:

curr.next = list1 != null ? list1 : list2;

	If list1 still has nodes left, we append all of them to the merged list.
	If list2 still has nodes left, we append all of them instead.
This is a turnary operator.
condition ? expression1 : expression2
	condition: A boolean expression (e.g., list1 != null).
	expression1: The value to return if the condition is true.
	expression2: The value to return if the condition is false.

 	    CONDITION			EXP1	EXP 2			
curr.next = list1 != null ? list1 : list2;
Let's break it down:
	list1 != null: This is the condition. It checks if list1 still has nodes remaining.
	list1: This is expression1. If the condition is true (i.e., list1 is not null), 
		the value of list1 is assigned to curr.next.
	list2: This is expression2. If the condition is false (i.e., list1 is null), 
		the value of list2 is assigned to curr.next.

6. Return the Merged List
Finally, we return the merged list, which starts at dummy.next:

java
Copy
return dummy.next;
The dummy node was just a placeholder. The actual merged list starts at dummy.next.


*/