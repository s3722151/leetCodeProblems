package leetCodeProblems;

public class reverseLinkedList {

}

//Solution to copy into LeetCode
//class Solution {
//	public ListNode reverseList(ListNode head) {
//		ListNode prev = null;
//		
//		while (head != null) {
//			ListNode next = head.next; // Step 1: Save the next node
//			head.next = prev; // Step 2: Reverse the current node's pointer
//			prev = head; // Step 3: Move prev to the current node
//			head = next; / Step 4: Move head to the next node
//			
//			return prev;  // Step 5: Return the new head of the reversed list
//		}
//	}
//}


//============================================================
//Sources
//============================================================
/*
Topics 
1. Linked Lists
2. Recurrsion

Solutions
https://www.youtube.com/watch?v=NCilGMhdYPY
- Explanation and code 
- E.g. We have nodes 1->2->3->4->5->Null
- ListNode next = head.next: 1 will act as our head, 2 is our next element
- head.next = prev: However we make Null our next element after 1 ( 1-> NUll )
- prev = head: This means 1 is made into head 
- head = next: 2 becomes our next element (2 -> NUll)

https://www.youtube.com/watch?v=D7y_hoT_YZI
- Simple visualisation 

https://www.w3schools.com/java/java_sort_list.asp
- This is documentation on how to sort the array
*/

//============================================================
//Deepseek queries
//============================================================
/*
You have a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL 
Step-by-Step Execution
Initial State:
head points to 1 (the first node).
prev is null.

First Iteration:
ListNode next = head.next;
	next now points to 2 (the node after 1).
head.next = prev;
	The next pointer of 1 is set to null (since prev is null).
	Now, 1 points to null.
prev = head;
	prev now points to 1.
head = next;
	head now points to 2.
List State: 1 -> NULL, 2 -> 3 -> 4 -> 5 -> NULL

Second Iteration:
ListNode next = head.next;
	next now points to 3 (the node after 2).
head.next = prev;
	The next pointer of 2 is set to 1 (since prev points to 1).
	Now, 2 points to 1.
prev = head;
	prev now points to 2.
head = next;
	head now points to 3.
List State: 2 -> 1 -> NULL, 3 -> 4 -> 5 -> NULL

Third Iteration:
ListNode next = head.next;
	next now points to 4 (the node after 3).
head.next = prev;
	The next pointer of 3 is set to 2 (since prev points to 2).
	Now, 3 points to 2.
prev = head;
	prev now points to 3.
head = next;
	head now points to 4.
List State: 3 -> 2 -> 1 -> NULL, 4 -> 5 -> NULL

Fourth Iteration:
ListNode next = head.next;
	next now points to 5 (the node after 4).
head.next = prev;
	The next pointer of 4 is set to 3 (since prev points to 3).
	Now, 4 points to 3.
prev = head;
	prev now points to 4.
head = next;
	head now points to 5.
List State: 4 -> 3 -> 2 -> 1 -> NULL, 5 -> NULL

Fifth Iteration:
ListNode next = head.next;
	next now points to null (the node after 5).
head.next = prev;
	The next pointer of 5 is set to 4 (since prev points to 4).
	Now, 5 points to 4.
prev = head;
	prev now points to 5.
head = next;
	head now points to null.

List State: 5 -> 4 -> 3 -> 2 -> 1 -> NULL

Termination:
	The loop condition while (head != null) is now false because head is null.
	The function returns prev, which is now the new head of the reversed list (5).

Final Reversed List
5 -> 4 -> 3 -> 2 -> 1 -> NULL

 */
